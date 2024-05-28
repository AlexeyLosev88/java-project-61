package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int MAX_RANDOM_NUMBER = 100000;

    public static void startEvenGame() {
        Engine.welcome();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        String[] question = new String[Engine.QUANTITY_ANSWERS_TO_WIN];
        String[] correctAnswer = new String[Engine.QUANTITY_ANSWERS_TO_WIN];
        for (int i = 0; i < Engine.QUANTITY_ANSWERS_TO_WIN; i++) {
            int randomNumber = Utils.getRandomInt(MAX_RANDOM_NUMBER);
            question[i] = String.valueOf(randomNumber);
            if (isEven(randomNumber)) {
                correctAnswer[i] = "yes";
            } else {
                correctAnswer[i] = "no";
            }
        }
        Engine.logicGame(question, correctAnswer);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
