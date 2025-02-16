package hexlet.code;

import java.util.Random;
import java.util.Scanner;
import static hexlet.code.games.MyValues.CORRECT_ANSWERS;


public class Engine {

    private static String answer;

    public static void userInteraction(String number) {

        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
        Scanner scan = new Scanner(System.in);
        answer = scan.next();
    }

//    public String getAnswer() {
//        return answer;
//    }
//    public void setAnswer(String answer) {
//        this.answer = answer;
//    }


    public static boolean generalLogic(String number, int number1){


//        Cli nameUser = new Cli();
        String userName = Cli.getNameUser();

        userInteraction(number);

        int answers = Integer.parseInt(answer);

        if (number1 == answers) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.printf("'%s' is wrong answer ;). "
                            + "Correct answer was '%d'.\nLet`s try again, %s!",
                    answer, number1, userName);
            return false;
        }
    }

    public static boolean game(String result) throws Exception {

//        Cli nameUser1 = new Cli();
        String nameUser = Cli.getNameUser();

        if ((!answer.equals("no")) & (!answer.equals("yes"))) {
            throw new Exception();
        }
        if (result.equals("yes")) {
            if (answer.equals("yes")) {
                System.out.println("Correct!");
                return true;
            } else {
                System.out.println("'no' is wrong answer ;(. Correct "
                        + "answer was 'yes'.\nLet's try again, "
                        + nameUser + "!");
                return false;
            }
        }
        if (result.equals("no")) {
            if (answer.equals("no")) {
                System.out.println("Correct!");
                return true;
            } else {
                System.out.println("'yes' is wrong answer ;(. Correct"
                        + " answer was 'no'.\nLet's try again, "
                        + nameUser + "!");
                return false;
            }
        }
        return false;
    }

    public static int random(int maxRandom) {
        Random random = new Random();
        return random.nextInt(maxRandom);
    }

    public static void finall(int correctAnswers) {


//        Cli nameUser1 = new Cli();
        String nameUser = Cli.getNameUser();

        if (correctAnswers == CORRECT_ANSWERS) {
             System.out.println("Congratulations, " + nameUser + "!");
        }
    }
}
/**
 * Общая для всех игр логика.
 *
 * Игры общаются с пользователем,
 * выводят вопросы,
 * запрашивают и сравнивают ответы,
 * выводят результат игры.
 *
 * Эту общую логику стоит поместить в отдельный метод класса Engine
 * в файле src/main/java/hexlet/code/Engine.java). Главная задача этого
 * шага – построить архитектуру запуска игр так, чтобы эта логика была в
 * одном месте и управляла играми
 */