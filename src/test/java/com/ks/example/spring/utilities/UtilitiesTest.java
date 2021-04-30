package com.ks.example.spring.utilities;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UtilitiesTest {
    Utilities utilities = new Utilities();
    @Test

    void ShouldReturnOnlyPositiveNumbers() {

        assertEquals(123,utilities.onlyPositiveValues("123"));
    }
}