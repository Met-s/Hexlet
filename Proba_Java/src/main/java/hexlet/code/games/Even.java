package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;




public class Even extends Engine {
        public static void parityCheck() throws Exception {

            int correctAnswers = 0;

            Cli.greeting();
            String nameUser = Cli.nameUser;
            System.out.println("Answer 'yes' if the number is even, "
                    + "otherwise answer 'no'.");

            while (correctAnswers < 3) {
                int number = Engine.random(100);
                Engine.game(String.valueOf(number));
                if ((!answer.equals("no")) & (!answer.equals("yes"))) {
                    throw new Exception();
                }

                if (number % 2 == 0) {
                    if (answer.equals("yes")) {
                        System.out.println("Correct!");
                        correctAnswers++;
                    }
                    if (answer.equals("no")) {
                        System.out.println("'no' is wrong answer ;(. Correct "
                                + "answer was 'yes'.\nLet's try again, "
                                + nameUser + "!");
                        break;
                    }
                } else {
                    if (answer.equals("no")) {
                        System.out.println("Correct!");
                        correctAnswers++;
                    }
                    if (answer.equals("yes")) {
                        System.out.println("'yes' is wrong answer ;(. Correct"
                                + " answer was 'no'.\nLet's try again, "
                                + nameUser + "!");
                        break;
                    }
                }
            }
            Engine.finall(correctAnswers);
        }
}
