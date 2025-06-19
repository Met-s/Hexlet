package io.hexlet.modul;

import org.junit.jupiter.api.Test;

import static io.hexlet.Methods.makeValidator;
import static org.assertj.core.api.Assertions.assertThat;

public class MethodsTest_44 {

    @Test
    public void testValidator() {

        var validator = makeValidator();
        assertThat(validator.isValid(null)).isTrue();
        assertThat(validator.isValid("some")).isFalse();

        validator.required();
        assertThat(validator.isValid(null)).isFalse();
        validator.positive();
        assertThat(validator.isValid(5)).isTrue();
        assertThat(validator.isValid(0)).isFalse();
    }
}

/**
 * Сопуствующие файлы:
 * implementations/
 *                  Right
 *                  Validator
 *                  Wrong1
 *                  Wrong2
 *                  Wrong3
 *                  Wrong4
 * main.java.io.hexlet/
 *            Methods
 * test.jama.io.hexlet/
 *            TestsTest
 */
