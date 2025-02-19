package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Cli;
import static hexlet.code.games.MyValues.CORRECT_ANSWERS;
import static hexlet.code.games.MyValues.MAX_RANDOM_NUMBER_GCD;


public class Gcd {
    public static void divisor() {

        int correctAnswer = 0;
        Cli.greeting();
        System.out.println("Find the greatest common divisor of given "
                + "numbers.");

        while (correctAnswer < CORRECT_ANSWERS) {
            int number1 = Engine.random(MAX_RANDOM_NUMBER_GCD) + 1;
            int number2 = Engine.random(MAX_RANDOM_NUMBER_GCD) + 1;
            String outputNambers = number1 + " " + number2;

            while (number2 != 0) {
                int temp = number1 % number2;
                number1 = number2;
                number2 = temp;
            }

            System.out.println(number1);

            if (Engine.generalLogic(outputNambers, number1)) {
                correctAnswer++;
            }else {
                break;
            }
        }
        Engine.finall(correctAnswer);
    }
}



//            int answer = Integer.parseInt(Engine.answer);



//            if (number1 == answer) {
//                System.out.println("Correct!");
//                correctAnswer++;
//            } else {
//                System.out.printf("'%d' is wrong answer ;). "
//                        + "Correct answer was '%d'.\nLet`s try again, %s!",
//                        answer, number1, userName);
//                break;
//            }

