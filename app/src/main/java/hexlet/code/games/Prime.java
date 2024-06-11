package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int MAX_RANDOM_NUMBER = 1000;

    public static void startGame() {
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionEndAnswer = new String[Engine.QUANTITY_ANSWERS_TO_WIN][2];
        for (int i = 0; i < Engine.QUANTITY_ANSWERS_TO_WIN; i++) {
            int randomNumber = Utils.getRandomInt(MAX_RANDOM_NUMBER);
            questionEndAnswer[i][0]  = String.valueOf(randomNumber); // вопрос
            if (isPrime(randomNumber)) { // ответ
                questionEndAnswer[i][1]  = "yes";
            } else {
                questionEndAnswer[i][1]  = "no";
            }
        }
        Engine.start(questionEndAnswer, rules);
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
