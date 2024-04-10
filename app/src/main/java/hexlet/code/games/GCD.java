package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class GCD {

    public static void startGcdGame() {
        Engine.welcome();
        System.out.println("Find the greatest common divisor of given numbers.");

        Engine engine = new Engine();

        while (engine.getValueCorrectAnswer() != Engine.getAnswersToWin()) {
            int solution = 1;
            Random random = new Random();
            int maxValueRandomNumber1 = 100;
            int maxValueRandomNumber2 = 100;
            int randomNumber1 = random.nextInt(maxValueRandomNumber1);
            int randomNumber2 = random.nextInt(maxValueRandomNumber2);
            System.out.println("Question: " + randomNumber1 + " " + randomNumber2);

            Engine.userAnswer();

            for (int i = 1; i <= randomNumber1 && i <= randomNumber2; i++) {
                if (randomNumber1 % i == 0 && randomNumber2 % i == 0) {
                    solution = i;
                }
            }

            if (Engine.getAnswer().equals(Integer.toString(solution))) {
                System.out.println("Correct!");
                engine.setValueCorrectAnswer(engine.getValueCorrectAnswer() + 1);
            } else {
                System.out.println("'" + Engine.getAnswer() + "' is wrong answer ;(. Correct answer was '"
                        + solution + "'.");
                break;
            }
        }
        Engine.victory();
    }
}
