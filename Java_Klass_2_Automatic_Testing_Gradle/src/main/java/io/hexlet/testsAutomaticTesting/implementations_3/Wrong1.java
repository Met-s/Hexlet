package io.hexlet.testsAutomaticTesting.implementations_3;


import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;

import java.util.ArrayList;
import java.util.List;

public class Wrong1 {

    public static String generatePassword(
            int length, boolean includeUpcase, boolean includeDigits, boolean includeSpecial) {

        var generator = new PasswordGenerator();
        var generalRule = new CharacterRule(EnglishCharacterData.LowerCase);
        List<CharacterRule> rules = new ArrayList<>();
        rules.add(generalRule);

        if (includeUpcase) {
            rules.add(new CharacterRule(EnglishCharacterData.UpperCase));
        }

        if (includeDigits) {
            rules.add(new CharacterRule(EnglishCharacterData.Digit));
        }

        if (includeSpecial) {
            rules.add(new CharacterRule(EnglishCharacterData.SpecialAscii));
        }

        return generator.generatePassword(length, rules);
    }

    public static String generatePassword() {
        return generatePassword(8, true, false, false);
    }
}

