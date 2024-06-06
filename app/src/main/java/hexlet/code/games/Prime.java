package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int MAX_RANDOM_NUMBER = 1000;

    public static void startGame() {
        //Engine.welcome();
        // System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] question = new String[Engine.QUANTITY_ANSWERS_TO_WIN];
        String[] correctAnswer = new String[Engine.QUANTITY_ANSWERS_TO_WIN];
        for (int i = 0; i < Engine.QUANTITY_ANSWERS_TO_WIN; i++) {
            int randomNumber = Utils.getRandomInt(MAX_RANDOM_NUMBER);
            question[i] = String.valueOf(randomNumber);
            if (isPrime(randomNumber)) {
                correctAnswer[i] = "yes";
            } else {
                correctAnswer[i] = "no";
            }
        }
        Engine.start(question, correctAnswer, rules);
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return true;
        } else {
            for (int i = 2; i < number / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
