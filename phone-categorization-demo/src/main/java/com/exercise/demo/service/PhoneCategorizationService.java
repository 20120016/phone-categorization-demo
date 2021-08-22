/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercise.demo.service;

import com.exercise.demo.entity.Customer;
import com.exercise.demo.entity.stanalone.CategorizedPhone;
import com.exercise.demo.entity.stanalone.Country;
import com.exercise.demo.utils.Commons;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ahmed.gamal
 */
@Service
public class PhoneCategorizationService {

    @Autowired
    CustomerService customerService;

    public List<CategorizedPhone> getPhoneInCategrizedFormate() {
        List<CategorizedPhone> categorizedPhones = new ArrayList<>();
        try {
            List<Customer> customers = customerService.findAll();
            System.out.println("customers--> " + customers.size());
            customers.forEach((c) -> {
                String customerPhoneCode = getPhoneCode(c.getPhone());
                Country country = getCountryByCode("+" + customerPhoneCode);
                if (country != null) {
                    String numberState = isNumberMatchedCountryRegex(
                            c.getPhone(), country.getRegex()) ? "valid" : "not valid";
                    CategorizedPhone phoneCategory = new CategorizedPhone(
                            country.getName(), numberState, country.getCode(), c.getPhone());
                    System.out.println("Number: " + c.getPhone() + ", phoneCategory--> " + phoneCategory);
                    categorizedPhones.add(phoneCategory);
                }
            }
            );
        } catch (Exception e) {
            System.out.println("Exception while getPhoneInCategrizedFormate as:- "
                    + e.getMessage());
            e.printStackTrace();
        }
        return categorizedPhones;
    }

    public String getPhoneCode(String phoneNumber) {
        Pattern pattern = Pattern.compile("\\((.*?)\\)");
        Matcher matcher = pattern.matcher(phoneNumber);
        if (matcher.find()) {
            String customerPhoneCode = matcher.group(1);
            System.out.println("customerPhoneCode for : "
                    + "" + phoneNumber + ", " + customerPhoneCode);
            return customerPhoneCode;
        } else {
            System.out.println("not found");
        }
        return "";
    }

    public boolean isNumberMatchedCountryRegex(String phoneNumber, String countryRegex) {
        boolean matches = Pattern.matches(countryRegex, phoneNumber);
        System.out.println("matche phoneNumber: " + phoneNumber
                + ", with regex: " + countryRegex + "--> " + matches);
        return matches;
    }

    public Country getCountryByCode(String code) {
        return Commons.countryList.stream().filter((t) -> {
            return t.getCode().equals(code);
        }).findAny().orElse(null);
    }

}
