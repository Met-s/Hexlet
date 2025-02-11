package hexlet.code;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Cli.nameUser;

public class Engine {

    public static String answer;

    public static void userInteraction(String number) {
        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
        Scanner scan = new Scanner(System.in);
        answer = scan.next();
    }


    public static boolean generalLogic(String number, int number1){

        userInteraction(number);

        int answers = Integer.parseInt(answer);
        String userName = Cli.nameUser;

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

    public static int random(int maxRandom) {
        Random random = new Random();
        return random.nextInt(maxRandom);
    }

    public static void finall(int correctAnswers) {
        if (correctAnswers == 3) {
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