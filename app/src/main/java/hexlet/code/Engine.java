package hexlet.code;
import java.util.Scanner;

public class Engine {
    private static String name;
    private static final int QUANTITY_ANSWERS_TO_WIN = 3;
    public static int getAnswersToWin() {
        return QUANTITY_ANSWERS_TO_WIN;
    }

    private static int valueCorrectAnswer = 0;

    public static int getValueCorrectAnswer() {
        return valueCorrectAnswer;
    }

    public static void welcome() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        System.out.println("Hello, " + name + "!");
    }

    public static void logicGame(String question, String correctAnswer) {
        System.out.println(question);
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        System.out.println("Your answer: " + answer);

        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
            valueCorrectAnswer = valueCorrectAnswer + 1;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
            System.out.println("Let's try again, " + name + "!");
            System.exit(0);
        }

        if (valueCorrectAnswer == QUANTITY_ANSWERS_TO_WIN) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
