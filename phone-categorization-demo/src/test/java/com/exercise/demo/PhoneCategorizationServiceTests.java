package com.exercise.demo;

import com.exercise.demo.service.PhoneCategorizationService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class PhoneCategorizationServiceTests {

    @Autowired
    private PhoneCategorizationService categorizationService;

    @Test
    void testGetPhoneCode() {
        Assertions.assertEquals("251", categorizationService.getPhoneCode(
                "(251) 9119454961"));
    }

    @Test
    void testGetCountryByCode() {
        Assertions.assertEquals("Cameroon", categorizationService.
                getCountryByCode("+237").getName());
        Assertions.assertNull(categorizationService.getCountryByCode("+937"));
    }

    @Test
    void testNumberMatchedCountryRegex() {
        Assertions.assertFalse(categorizationService.isNumberMatchedCountryRegex(
                "(251) 9119454961", "\\(251\\)\\ ?[1-59]\\d{8}$"));
        Assertions.assertTrue(categorizationService.isNumberMatchedCountryRegex(
                "(251) 914148181", "\\(251\\)\\ ?[1-59]\\d{8}$"));
    }

}
