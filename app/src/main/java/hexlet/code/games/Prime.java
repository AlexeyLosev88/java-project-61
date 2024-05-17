package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int MAX_RANDOM_NUMBER = 1000;

    public static void startPrimeGame() {
        Engine.welcome();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        while (Engine.getValueCorrectAnswer() != Engine.getAnswersToWin()) {
            int randomNumber = Utils.getRandomInt(MAX_RANDOM_NUMBER);
            String question = "Question: " + randomNumber;
            String correctAnswer = solution(randomNumber);
            Engine.logicGame(question, correctAnswer);
        }
    }

    public static String solution(int number) {
        if (number < 2) {
            return "yes";
        } else {
            for (int i = 2; i < number / 2; i++) {
                if (number % i == 0) {
                    return "no";
                }
            }
        }
        return "yes";
    }
}
