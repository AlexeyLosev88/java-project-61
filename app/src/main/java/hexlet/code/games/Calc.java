package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static void startCalcGame() {
        Engine.welcome();
        System.out.println("What is the result of the expression?");

        while (Engine.valueCorrectAnswer != 3) {
            int solution = 0;
            int randomNumber1 = 0;
            int randomNumber2 = 0;
            char randomSymbol = 0;
            Random random = new Random();
            randomNumber1 = random.nextInt(10);
            randomNumber2 = random.nextInt(10);
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

            if (Engine.answer.equals(Integer.toString(solution))) {
                System.out.println("Correct!");
                Engine.valueCorrectAnswer = Engine.valueCorrectAnswer + 1;
            } else {
                System.out.println("'" + Engine.answer + "' is wrong answer ;(. Correct answer was '"
                        + solution + "'.");
                break;
            }
        }
        Engine.victory();
    }
}
