package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static void startCalcGame() {
        Engine.welcome();
        System.out.println("What is the result of the expression?");

        Engine engine = new Engine();

        while (engine.getValueCorrectAnswer() != Engine.getAnswersToWin()) {
            int solution;
            char randomSymbol;
            Random random = new Random();
            final int maxValueRandomNumber1 = 10;
            final int maxValueRandomNumber2 = 10;
            int randomNumber1 = random.nextInt(maxValueRandomNumber1);
            int randomNumber2 = random.nextInt(maxValueRandomNumber2);
            randomSymbol = (random.nextInt(2) == 0) ? '+'
                    : (random.nextInt(2) == 0) ? '-' : '*';
            System.out.println("Question: " + randomNumber1 + " " + randomSymbol + " " + randomNumber2);
            if (randomSymbol == '+') {
                solution = randomNumber1 + randomNumber2;
            } else if (randomSymbol == '-') {
                solution = randomNumber1 - randomNumber2;
            } else {
                solution = randomNumber1 * randomNumber2;
            }

            Engine.userAnswer();

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
