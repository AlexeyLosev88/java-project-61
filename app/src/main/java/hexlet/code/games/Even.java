package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int MAX_RANDOM_NUMBER = 100000;

    public static void startGame() {
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questionEndAnswer = new String[Engine.QUANTITY_ANSWERS_TO_WIN][2];
        for (int i = 0; i < Engine.QUANTITY_ANSWERS_TO_WIN; i++) {
            int randomNumber = Utils.getRandomInt(MAX_RANDOM_NUMBER);
            questionEndAnswer[i][0] = String.valueOf(randomNumber); // вопрос
            if (isEven(randomNumber)) { // ответ
                questionEndAnswer[i][1] = "yes";
            } else {
                questionEndAnswer[i][1] = "no";
            }
        }
        Engine.start(questionEndAnswer, rules);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
