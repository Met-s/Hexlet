package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Calc {
    public static void calculate() throws Exception {

        int result = 0;
        int correctAnswers = 0;
        String[] operators = { "+", "-", "*" };

        Cli.greeting();
//        String userName = Cli.nameUser;
        System.out.println("What is the result of the expression?");

        while (correctAnswers < 3) {
            int number1 = Engine.random(20) + 1;
            int number2 = Engine.random(20) + 1;
            int i = Engine.random(3);
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