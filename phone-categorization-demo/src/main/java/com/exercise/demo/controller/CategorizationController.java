/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercise.demo.controller;

import com.exercise.demo.service.PhoneCategorizationService;
import com.google.gson.Gson;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ahmed.gamal
 */
@Controller
public class CategorizationController {

    @Autowired
    PhoneCategorizationService phoneCategorizationService;

    @RequestMapping("/")
    public String home(Map<String, Object> model) {
        Gson g = new Gson();
        String strList = g.toJson(phoneCategorizationService.getPhoneInCategrizedFormate());
//        System.out.println("strList---> " + strList);
        model.put("list", strList);
        return "CategorizedPhones";
    }
}
