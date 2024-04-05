package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {

    public static void startGcdGame() {
        Engine.welcome();
        System.out.println("Find the greatest common divisor of given numbers.");

        while (Engine.valueCorrectAnswer != 3) {
            int solution = 1;
            int randomNumber1 = 0;
            int randomNumber2 = 0;
            Random random = new Random();
            randomNumber1 = random.nextInt(100);
            randomNumber2 = random.nextInt(100);
            System.out.println("Question: " + randomNumber1 + " " + randomNumber2);

            Engine.userAnswer();

            for (int i = 1; i <= randomNumber1 && i <= randomNumber2; i++) {
                if (randomNumber1 % i == 0 && randomNumber2 % i == 0) {
                    solution = i;
                }
            }

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
