package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import static hexlet.code.games.MyValues.CORRECT_ANSWERS;
import static hexlet.code.games.MyValues.MAX_RANDOM_NUMBER;


public class Even {
        public static void parityCheck() throws Exception {

            int correctAnswers = 0;

            Cli.greeting();

            System.out.println("Answer 'yes' if the number is even, "
                    + "otherwise answer 'no'.");

            while (correctAnswers < CORRECT_ANSWERS) {
                int number = Engine.random(MAX_RANDOM_NUMBER);

                Engine.userInteraction(String.valueOf(number));

                String result = (number % 2 == 0) ? "yes" : "no";
                if (Engine.game(result)) {
                    correctAnswers++;
                } else {
                    break;
                }
            }
            Engine.finall(correctAnswers);
        }
}
