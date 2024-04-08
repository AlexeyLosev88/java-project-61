package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Prime {

    public static void startPrimeGame() {
        Engine.welcome();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        while (Engine.valueCorrectAnswer != 3) {
            Random random = new Random();
            int randomNumber = random.nextInt(1000);
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

            if ((Engine.answer.equals("yes") && (isPrime))
                    || ((Engine.answer.equals("no") && (!isPrime)))) {
                System.out.println("Correct!");
                Engine.valueCorrectAnswer = Engine.valueCorrectAnswer + 1;
            } else {
                if (!isPrime) {
                    System.out.println("'" + Engine.answer + "' is wrong answer ;(. Correct answer was 'no'.");
                } else {
                    System.out.println("'" + Engine.answer + "' is wrong answer ;(. Correct answer was 'yes'.");
                }
                break;
            }

        }

        Engine.victory();
    }
}
