/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercise.demo.utils;

import com.exercise.demo.entity.stanalone.Country;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ahmed.gamal
 */
public class Commons {

    public static final List<Country> countryList = new ArrayList<>();

    static {
        countryList.add(new Country("Cameroon", "+237", "\\(237\\)\\ ?[2368]\\d{7,8}$"));
        countryList.add(new Country("Ethiopia", "+251", "\\(251\\)\\ ?[1-59]\\d{8}$"));
        countryList.add(new Country("Morocco", "+212", "\\(212\\)\\ ?[5-9]\\d{8}$"));
        countryList.add(new Country("Mozambique", "+258", "\\(258\\)\\ ?[28]\\d{7,8}$"));
        countryList.add(new Country("Uganda", "+256", "\\(256\\)\\ ?\\d{9}$"));
    }
}
