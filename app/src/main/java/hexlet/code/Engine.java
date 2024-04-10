package hexlet.code;
import java.util.Scanner;

public class Engine {
    private static String name;
    private static final int ANSWERSWIN = 3;
    public static int getAnswersToWin() {
        return ANSWERSWIN;
    }

    private static int valueCorrectAnswer = 0;

    public static int getValueCorrectAnswer() {
        return valueCorrectAnswer;
    }

    public static void setValueCorrectAnswer(int sumCorrectAnswer) {
        valueCorrectAnswer = sumCorrectAnswer;
    }

    private static String answer;

    public static String getAnswer() {
        return answer;
    }

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
        if (valueCorrectAnswer == ANSWERSWIN) {
            System.out.println("Congratulations, " + name + "!");
        } else {
            System.out.println("Let's try again, " + name + "!");
        }
    }
}
