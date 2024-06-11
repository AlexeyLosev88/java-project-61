package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int MAX_RANDOM_NUMBER1 = 10;
    private static final int MAX_RANDOM_NUMBER2 = 10;

    public static void startGame() {
        String rules = "What is the result of the expression?";
        String[][] questionEndAnswer = new String[Engine.QUANTITY_ANSWERS_TO_WIN][2];
        for (int i = 0; i < Engine.QUANTITY_ANSWERS_TO_WIN; i++) {
            char randomSymbol;
            int randomNumber1 = Utils.getRandomInt(MAX_RANDOM_NUMBER1);
            int randomNumber2 = Utils.getRandomInt(MAX_RANDOM_NUMBER2);
            randomSymbol = (Utils.getRandomInt(2) == 0) ? '+'
                    : (Utils.getRandomInt(2) == 0) ? '-' : '*';
            questionEndAnswer[i][0]  = randomNumber1 + " " + randomSymbol + " " + randomNumber2; // вопрос
            questionEndAnswer[i][1]  = Integer.toString(calculateSolution(randomSymbol, randomNumber1, randomNumber2));
            // ответ
        }
        Engine.start(questionEndAnswer, rules);
    }

    public static int calculateSolution(char symbol, int number1, int number2) {
        return switch (symbol) {
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            case '*' -> number1 * number2;
            default -> throw new Error("Unknown symbol to calculateSolution()");
        };
    }
}
