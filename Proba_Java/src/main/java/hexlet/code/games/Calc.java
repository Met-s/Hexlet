package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import static hexlet.code.games.MyValues.CORRECT_ANSWERS;
import static hexlet.code.games.MyValues.MAX_RANDOM_NUMBER;
import static hexlet.code.games.MyValues.MAX_RANDOM_OPERATORS;

public class Calc {
    public static void calculate() {

        int result = 0;
        int correctAnswers = 0;
        String[] operators = { "+", "-", "*" };

        Cli.greeting();

        System.out.println("What is the result of the expression?");

        while (correctAnswers < CORRECT_ANSWERS) {
            int number1 = Engine.random(MAX_RANDOM_NUMBER) + 1;
            int number2 = Engine.random(MAX_RANDOM_NUMBER) + 1;
            int i = Engine.random(MAX_RANDOM_OPERATORS);
            String outputResult =
                    number1 + " " + operators[i] + " " + number2;

            switch (i) {
                case 0 :
                    result = (number1 + number2);
                    break;

                case 1 :
                    result = (number1 - number2);
                    break;
                case 2 :
                    result = (number1 * number2);
                    break;
                default :
            }
            System.out.println("result = " + result);

            if (Engine.generalLogic(outputResult, result)) {
                correctAnswers++;
            }else {
                break;
            }
        }
        Engine.finall(correctAnswers);
    }
}
//            Engine.game(result);`
//            int answer = Integer.parseInt(Engine.answer);
//
//            if (result1 == answer) {
//                System.out.println("Correct!");
//                correctAnswers++;
//            } else {
//                System.out.println("'" + answer + "'" + "is wrong answer" +
//                        " ;(. Correct answer was " + "'" + result1 + "'" +
//                        ".\nLet`s try again, " + userName + "!");
//                break;
//            }