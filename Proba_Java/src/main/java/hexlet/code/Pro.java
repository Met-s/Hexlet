//package hexlet.code;
//
//import java.util.Scanner;
//
//public class Pro {
//    public static void extra() {
//        int min = 1;
//        int max = 100;
//        int result = 0;
//        String name = Cli.name;
//        System.out.println("Answer 'yes' if the number is even, otherwise " +
//                "answer 'no'.");
//
//        while (result < 3) {
//            int number = min + (int)(Math.random() * ((max - min) + 1));
//            System.out.println("Question: " + number);
//            System.out.print("Your answer: ");
//            Scanner scan1 = new Scanner(System.in);
//            String answer = scan1.next();
//
//            if ((!answer.equals("no")) & (!answer.equals("yes"))) {
//                System.out.println("The answer can be \"yes\" or \"no\".\n" +
//                        "Let's try again," + name + "!");
//                break;
//            }
//
//            if (number % 2 == 0) {
//                if (answer.equals("yes")) {
//                    System.out.println("Correct!");
//                    result ++;
//                }
//                if (answer.equals("no")) { // ok
//                    System.out.println("'no' is wrong answer ;(. Correct " +
//                            "answer was 'yes'.\n" +
//                            "Let's try again, " + name + "!");
//                    break;
//                }
//            } else {
//                if (answer.equals("no")) {
//                    System.out.println("Correct!");
//                    result ++;
//                }
//                if (answer.equals("yes")) { // ok
//                    System.out.println("'yes' is wrong answer ;(. Correct " +
//                            "answer was 'no'.\n" +
//                            "Let's try again, " + name + "!");
//                    break;
//                }
//            }
//        }
//        if (result == 3) {
//            System.out.println("Congratulations, " + name + "!");
//        }
//    }
//
//
//
//
//
//
//
//}
//
