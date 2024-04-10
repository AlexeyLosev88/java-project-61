package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Prime {

    public static void startPrimeGame() {
        Engine.welcome();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        Engine engine = new Engine();

        while (engine.getValueCorrectAnswer() != Engine.getAnswersToWin()) {
            Random random = new Random();
            int maxNumber = 1000;
            int randomNumber = random.nextInt(maxNumber);
            System.out.println("Question: " + randomNumber);
            boolean isPrime = true;
            if (randomNumber < 2) {
                isPrime = false;
            } else {
                for (int i = 2; i < randomNumber / 2; i++) {
                    if (randomNumber % i == 0) {
                        isPrime = false;
                    }
                }
            }

            Engine.userAnswer();

            if ((Engine.getAnswer().equals("yes") && (isPrime))
                    || ((Engine.getAnswer().equals("no") && (!isPrime)))) {
                System.out.println("Correct!");
                engine.setValueCorrectAnswer(engine.getValueCorrectAnswer() + 1); // = ;
            } else {
                if (!isPrime) {
                    System.out.println("'" + Engine.getAnswer() + "' is wrong answer ;(. Correct answer was 'no'.");
                } else {
                    System.out.println("'" + Engine.getAnswer() + "' is wrong answer ;(. Correct answer was 'yes'.");
                }
                break;
            }

        }
        Engine.victory();
    }
}
