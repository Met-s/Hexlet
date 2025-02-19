package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Cli;
import static hexlet.code.games.MyValues.CORRECT_ANSWERS;
import static hexlet.code.games.MyValues.MAX_RANDOM_NUMBER;


public class PrimeN {
    public static void primeNumber() throws Exception {

        int correctAnswers = 0;

        Cli.greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise "
                + "answer 'no'.");

        while (correctAnswers < CORRECT_ANSWERS) {
            int number = Engine.random(MAX_RANDOM_NUMBER);
            String result = "yes";
            Engine.userInteraction(String.valueOf(number));

            if (number < 2) result = "no";
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    result = "no";
                    break;
                }
            }
            if (Engine.game(result)){
                correctAnswers++;
            } else {
                break;
            }
        }
        Engine.finall(correctAnswers);
    }
}



//            if (result.equals("yes")) {
//                if (answer.equals("yes")) {
//                    System.out.println("Correct!");
//                    correctAnswers++;
//                } else {
//                    System.out.println("'no' is wrong answer ;(. Correct "
//                            + "answer was 'yes'.\nLet's try again, "
//                            + nameUser + "!");
//                    break;
//                }
//            }
//            if (result.equals("no")) {
//                if (answer.equals("no")) {
//                    System.out.println("Correct!");
//                    correctAnswers++;
//                } else {
//                    System.out.println("'yes' is wrong answer ;(. Correct"
//                            + " answer was 'no'.\nLet's try again, "
//                            + nameUser + "!");
//                    break;
//                }
//
//            }

//            System.out.println("number: " + number + " result: " + result);