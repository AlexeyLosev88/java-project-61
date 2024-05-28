package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final int MAX_RANDOM_NUMBER1 = 100;
    private static final int MAX_RANDOM_NUMBER2 = 100;

    public static void startGcdGame() {
        Engine.welcome();
        System.out.println("Find the greatest common divisor of given numbers.");
        String[] question = new String[Engine.QUANTITY_ANSWERS_TO_WIN];
        String[] correctAnswer = new String[Engine.QUANTITY_ANSWERS_TO_WIN];
        for (int i = 0; i < Engine.QUANTITY_ANSWERS_TO_WIN; i++) {
            int randomNumber1 = Utils.getRandomInt(MAX_RANDOM_NUMBER1);
            int randomNumber2 = Utils.getRandomInt(MAX_RANDOM_NUMBER2);
            question[i] = randomNumber1 + " " + randomNumber2;
            correctAnswer[i] = Integer.toString(calculateGcd(randomNumber1, randomNumber2));
        }
        Engine.logicGame(question, correctAnswer);
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
