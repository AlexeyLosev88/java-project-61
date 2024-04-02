package hexlet.code;
import java.util.Scanner;

public class Engine {

    public static String name;
    public static int valueCorrectAnswer = 0;
    public static String answer;
    public static void welcome() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        System.out.println("Hello, " + name + "!");
    }

    public static void userAnswer() {
        Scanner scanner = new Scanner(System.in);
        answer = scanner.next();
        System.out.println("Your answer: " + answer);
    }

    public static void victory() {
        if (valueCorrectAnswer == 3) {
            System.out.println("Congratulations, " + name + "!");
        } else {
            System.out.println("Let's try again, " + name + "!");
        }
    }
}
