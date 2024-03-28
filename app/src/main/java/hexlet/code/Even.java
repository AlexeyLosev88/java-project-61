package hexlet.code;
import java.util.Scanner;
import java.util.Random;

public class Even {
    public static void startEvenGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("May I have your name? ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int valueCorrectAnswer = 0;

        while (valueCorrectAnswer !=3) {
            int randomNumber = random.nextInt(100000);
            System.out.println("Question: " + randomNumber);
            String answer = scanner.next();
            System.out.println("Your answer: " + answer);
            if ((answer.equals("yes") && randomNumber % 2 == 0) || (answer.equals("no") && randomNumber % 2 != 0)) {
                System.out.println("Correct!");
                valueCorrectAnswer = valueCorrectAnswer + 1;
            } else {
                if (randomNumber % 2 == 0) {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'yes'.\nLet's try again, " + name + "!");
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'no'.\nLet's try again, " + name + "!");
                } break;
            }
        }
        if (valueCorrectAnswer == 3) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}