package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int MAX_RANDOM_NUMBER1 = 10;
    private static final int MAX_RANDOM_NUMBER2 = 10;

    public static void startCalcGame() {
        Engine.welcome();
        System.out.println("What is the result of the expression?");
        while (Engine.getValueCorrectAnswer() != Engine.getAnswersToWin()) {
            char randomSymbol;
            int randomNumber1 = Utils.getRandomInt(MAX_RANDOM_NUMBER1);
            int randomNumber2 = Utils.getRandomInt(MAX_RANDOM_NUMBER2);
            randomSymbol = (Utils.getRandomInt(2) == 0) ? '+'
                    : (Utils.getRandomInt(2) == 0) ? '-' : '*';
            String correctAnswer = Integer.toString(solution(randomSymbol, randomNumber1, randomNumber2));
            String question = "Question: " + randomNumber1 + " " + randomSymbol + " " + randomNumber2;
            Engine.logicGame(question, correctAnswer);
        }
    }

    public static int solution(char symbol, int number1, int number2) {
        if (symbol == '+') {
            return number1 + number2;
        } else if (symbol == '-') {
            return number1 - number2;
        } else {
            return number1 * number2;
        }
    }
}
