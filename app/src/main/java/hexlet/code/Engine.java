package hexlet.code;
import java.util.Scanner;

public class Engine {
    private static String name;
    public static final int QUANTITY_ANSWERS_TO_WIN = 3;

    public static void welcome() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        System.out.println("Hello, " + name + "!");
    }

    public static void start(String[][] questionEndAnswer, String rules) {
        int valueCorrectAnswer = 0;
        Engine.welcome();
        System.out.println(rules);
        for (int i = 0; i < QUANTITY_ANSWERS_TO_WIN; i++) {
            System.out.println("Question: " + questionEndAnswer[i][0]);
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.next();
            System.out.println("Your answer: " + answer);

            if (answer.equals(questionEndAnswer[i][1])) {
                System.out.println("Correct!");
                valueCorrectAnswer = valueCorrectAnswer + 1;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + questionEndAnswer[i][1]
                            + "'.");
                System.out.println("Let's try again, " + name + "!");
                System.exit(0);
            }
        }
        if (valueCorrectAnswer == QUANTITY_ANSWERS_TO_WIN) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
