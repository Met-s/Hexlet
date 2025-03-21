package hexlet.code.games;

import hexlet.code.Utils;
import org.apache.commons.lang3.ArrayUtils;
import hexlet.code.Engine;
import static hexlet.code.Constants.CORRECT_ANSWERS;
import static hexlet.code.Constants.MAX_RANDOM_NUMBER;
import static hexlet.code.Constants.MAX_PROGRESSION_VALUE;
import static hexlet.code.Constants.MIN_PROGRESSION_VALUE;


public class Aprogression {
    public static void progression() {

        int correctAnswer = 0;
        String gameCondition = "What number is missing in the progression?";
        String[][] example = new String[CORRECT_ANSWERS][2];

        while (correctAnswer < CORRECT_ANSWERS) {
            int number = Utils.random(MAX_RANDOM_NUMBER) + 1;
            int progressionValue = Utils.random(MAX_PROGRESSION_VALUE) + 1;
            String[] numbers = {};

            int i = 0;
            while (i < progressionValue + MIN_PROGRESSION_VALUE) {
                number = number + progressionValue;
                String numberStr = String.valueOf(number);
                numbers = ArrayUtils.add(numbers, numberStr);
                i++;
            }

            int lengthAr = numbers.length - 2;
            int numberIndex = Utils.random(lengthAr) + 2;
            int numberSkipped = Integer.parseInt(numbers[numberIndex]);
            numbers[numberIndex] = "..";

            String result = String.join(" ",numbers);
            example[correctAnswer] = new String[] {result,
                    String.valueOf(numberSkipped)};
            correctAnswer++;
        }
        Engine.generalLogic(example, gameCondition);
    }
}

