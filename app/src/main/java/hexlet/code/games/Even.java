package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Even {
    public static void startEvenGame() {
        Engine.welcome();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (Engine.valueCorrectAnswer != 3) {
            Random random = new Random();
            int randomNumber = random.nextInt(100000);
            System.out.println("Question: " + randomNumber);

            Engine.userAnswer();

            if ((Engine.answer.equals("yes") && randomNumber % 2 == 0)
                    || (Engine.answer.equals("no") && randomNumber % 2 != 0)) {
                System.out.println("Correct!");
                Engine.valueCorrectAnswer = Engine.valueCorrectAnswer + 1;
            } else {
                if (randomNumber % 2 == 0) {
                    System.out.println("'" + Engine.answer + "' is wrong answer ;(. Correct answer was 'yes'.");
                } else {
                    System.out.println("'" + Engine.answer + "' is wrong answer ;(. Correct answer was 'no'.");
                }
                break;
            }
        }
        Engine.victory();
    }
}
