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

        String[] options = {"Exit", "Greet", "Even", "Calc", "Gcd",
                "Progression", "PrimeN"};


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
            try {
            int number = choice.nextInt();
            if (QUANTITY_GAME < number || number < 0) {
                throw new Exception();
            }


            switch (options[number]) {
                case "Exit" -> System.out.println("Goodbye!");
                case "Greet" -> Cli.greeting();
                case "Even" -> Even.parityCheck();
                case "Calc" -> Calc.calculate();
                case "Gcd" -> Gcd.divisor();
                case "Progression" -> Aprogression.progression();
                case "PrimeN" -> PrimeN.primeNumber();
                default -> System.out.println("Invalid number");
            }

//            switch (number) {
//                case 0:
//                    System.out.println("Goodbye!");
//                    break;
//                case 1:
//                    Cli.greeting();
//                    break;
//                case 2:
//                    Even.parityCheck();
//                    break;
//                case 3:
//                    Calc.calculate();
//                    break;
//                case 4:
//                    Gcd.divisor();
//                    break;
//                case 5:
//                    Aprogression.progression();
//                    break;
//                case 6:
//                    PrimeN.primeNumber();
//                default:
//            }

        } catch (Exception e) {
            System.out.println(("Incorrect input!"));
        }
    }
}
