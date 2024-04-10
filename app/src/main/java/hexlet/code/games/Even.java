package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Even {
    public static void startEvenGame() {
        Engine.welcome();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Engine engine = new Engine();

        while (engine.getValueCorrectAnswer() != Engine.getAnswersToWin()) {
            Random random = new Random();
            int maxValueRandomNumber = 100000;
            int randomNumber = random.nextInt(maxValueRandomNumber);
            System.out.println("Question: " + randomNumber);

            Engine.userAnswer();

            if ((Engine.getAnswer().equals("yes") && randomNumber % 2 == 0)
                    || (Engine.getAnswer().equals("no") && randomNumber % 2 != 0)) {
                System.out.println("Correct!");
                engine.setValueCorrectAnswer(engine.getValueCorrectAnswer() + 1);
            } else {
                if (randomNumber % 2 == 0) {
                    System.out.println("'" + Engine.getAnswer() + "' is wrong answer ;(. Correct answer was 'yes'.");
                } else {
                    System.out.println("'" + Engine.getAnswer() + "' is wrong answer ;(. Correct answer was 'no'.");
                }
                break;
            }
        }
        Engine.victory();
    }
}
