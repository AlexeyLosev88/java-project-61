package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final int MAX_RANDOM_NUMBER1 = 100;
    private static final int MAX_RANDOM_NUMBER2 = 100;

    public static void startGame() {
        String rules = "Find the greatest common divisor of given numbers.";
        String[][] questionEndAnswer = new String[Engine.QUANTITY_ANSWERS_TO_WIN][2];
        for (int i = 0; i < Engine.QUANTITY_ANSWERS_TO_WIN; i++) {
            int randomNumber1 = Utils.getRandomInt(MAX_RANDOM_NUMBER1);
            int randomNumber2 = Utils.getRandomInt(MAX_RANDOM_NUMBER2);
            questionEndAnswer[i][0]  = randomNumber1 + " " + randomNumber2; // вопрос
            questionEndAnswer[i][1]  = Integer.toString(calculateGcd(randomNumber1, randomNumber2)); // ответ
        }
        Engine.start(questionEndAnswer, rules);
    }

    public static int calculateGcd(int number1, int number2) {
        int result = 1;
        for (int i = 1; i <= number1 && i <= number2; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                result = i;
            }
        } return result;
    }
}
