package io.hexlet;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.console.ConsoleLauncher;

import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class Test_ParameterizedTest {

    boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < (n/2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    @ParameterizedTest
    @ValueSource(strings = {"racecar", "radar", "able was I ere I saw elba"})
    void palindromes(String candidate) {
        assertTrue(isPalindrome(candidate));
    }

    @ParameterizedTest
    @ValueSource(strings = {"JANUARY", "MARCH", "MAY", "NOVEMBER"})
    void isOddTest(String monthName) {
        Month month = Month.valueOf(monthName);
        boolean actualResult = OddMonthDetector.isOdd(month);
        Assertions.assertTrue(actualResult);
    }
}
