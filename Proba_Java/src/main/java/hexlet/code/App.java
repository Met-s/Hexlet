package hexlet.code;
import static hexlet.code.games.MyValues.QUANTITY_GAME;
import java.util.Scanner;
import hexlet.code.games.Aprogression;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.PrimeN;


final

public class App {
    public static void main(String[] args) {

        System.out.print("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Game Even\n"
                + "3 - Game Calc\n"
                + "4 - GCD\n"
                + "5 - Arithmetic progression\n"
                + "6 - Prime number\n"
                + "0 - Exit\n"
                + "Your choice: ");

        Scanner choice = new Scanner(System.in);
        String number = choice.nextLine();
            try {

            switch (number) {
                case "0" -> System.out.println("Goodbye!");
                case "1" -> Cli.greeting();
                case "2" -> Even.parityCheck();
                case "3" -> Calc.calculate();
                case "4" -> Gcd.divisor();
                case "5" -> Aprogression.progression();
                case "6" -> PrimeN.primeNumber();
                default -> System.out.println("Invalid number");
            }
        } catch (Exception e) {
            System.out.println(("Incorrect input!"));
        }
    }
}
