package hexlet.code;
import hexlet.code.Cli;
import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Cli.nameUser;

public class Engine {

    public static String answer;
    protected static String mess;


    public static void generalLogic(String message) {

        Cli.greeting();

    }


    public static void game(String number) throws Exception {
        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
        Scanner scan1 = new Scanner(System.in);
        answer = scan1.next();
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