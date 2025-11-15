package io.hexlet.testsAutomaticTesting;

import org.junit.jupiter.api.Test;

import static io.hexlet.testsAutomaticTesting.TestUtils_3.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static io.hexlet.testsAutomaticTesting.Methods_3.generatePassword;

public class Methods_3Test {

    @Test
    public void generatePasswordTrueTest() {
        var actual = generatePassword(8, true, true, true);

        assertTrue(actual.length() == 8);
        assertTrue(containsUpperCase(actual));
        assertTrue(containsDigits(actual));
        assertTrue(containsSpecialChars(actual));
    }

    @Test
    public void generatePasswordFalseTest1() {
        var actual = generatePassword(6, false, false, false);

        assertEquals(false, containsUpperCase(actual));
        assertEquals(false, containsDigits(actual));
        assertEquals(false, containsSpecialChars(actual));

    }
//=> ###_____ Решение Учителя ____###
    @Test
    public void generatePasswordDefaultTest() {
        var actual = generatePassword();

        System.out.println(actual);
        assertTrue(actual.length() == 5);
        assertTrue(isLowerCaseAlphabetic(actual));
    }


    @Test
    public void testDefaultCase() {
        var actual = generatePassword();
        assertEquals(5, actual.length());
        assertTrue(TestUtils_3.isLowerCaseAlphabetic(actual), "default pass" +
                " should only include lowercase letters");
    }

    @Test
    public void testUpcaseRule() {
        var actual = generatePassword(10, true, false, false);
        assertEquals(10, actual.length());
        assertTrue(TestUtils_3.containsUpperCase(actual), "the password " +
                "must contain at least one capital letter");
    }

    @Test
    public void testDigitsRule() {
        var actual = generatePassword(10, false, true, false);
        assertEquals(10, actual.length());
        assertTrue(TestUtils_3.containsDigits(actual), "the password must " +
                "contain at least one digit");
    }

    @Test
    public void testSpecialCharRule() {
        var actual = generatePassword(10, false, false, true);
        assertEquals(10, actual.length());
        assertTrue(TestUtils_3.containsSpecialChars(actual), "the password " +
                "must contain at least one special char");
    }


}
