/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercise.demo.entity.stanalone;

/**
 *
 * @author ahmed.gamal
 */
public class CategorizedPhone {

    private String country;
    private String state;
    private String countryCode;
    private String phoneNumber;

    public CategorizedPhone() {
    }

    public CategorizedPhone(String country, String state, String countryCode, String phoneNumber) {
        this.country = country;
        this.state = state;
        this.countryCode = countryCode;
        this.phoneNumber = phoneNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "PhoneCategory{" + "country=" + country
                + ", state=" + state + ", countryCode=" + countryCode
                + ", phoneNumber=" + phoneNumber + '}';
    }

}
