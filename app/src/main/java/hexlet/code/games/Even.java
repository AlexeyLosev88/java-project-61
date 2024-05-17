package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int MAX_RANDOM_NUMBER = 100000;

    public static void startEvenGame() {
        Engine.welcome();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (Engine.getValueCorrectAnswer() != Engine.getAnswersToWin()) {
            int randomNumber = Utils.getRandomInt(MAX_RANDOM_NUMBER);
            String question = "Question: " + randomNumber;
            String correctAnswer = solution(randomNumber);
            Engine.logicGame(question, correctAnswer);
        }
    }

    public static String solution(int number) {
        if (number % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}
