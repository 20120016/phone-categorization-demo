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
public class Country {

    private String name;
    private String code;
    private String regex;

    public Country(String name, String code, String regex) {
        this.name = name;
        this.code = code;
        this.regex = regex;
    }

    public Country() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    @Override
    public String toString() {
        return "Country{" + "name=" + name + ", code=" + code + 
                ", regex=" + regex + '}';
    }

}
