package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Utils.getRandomProgression;

public class Progression {
    private static final int MIN_PROGRESSION_STEP = 1;
    private static final int MAX_PROGRESSION_STEP = 4;
    private static final int MIN_QUANTITY_ELEMENT = 4;
    private static final int MAX_QUANTITY_ELEMENT = 10;
    private static final int MAX_VALUE_NEXT_NUMBER = 100;
    private static final int CORRECTION_QUANTITY_ELEMENT_FOR_CYCLE = 13;

    public static void startProgressionGame() {
        Engine.welcome();
        System.out.println("What number is missing in the progression?");
        String[] question = new String[Engine.QUANTITY_ANSWERS_TO_WIN];
        String[] correctAnswer = new String[Engine.QUANTITY_ANSWERS_TO_WIN];
        for (int i = 0; i < Engine.QUANTITY_ANSWERS_TO_WIN; i++) {
            String[] randomProgression = getRandomProgression(MIN_PROGRESSION_STEP, MAX_PROGRESSION_STEP,
                    MIN_QUANTITY_ELEMENT, MAX_QUANTITY_ELEMENT, MAX_VALUE_NEXT_NUMBER,
                    CORRECTION_QUANTITY_ELEMENT_FOR_CYCLE);
            int progressionIndex = Utils.getRandomInt(randomProgression.length);
            correctAnswer[i] = Integer.toString(hiddenNumber(Integer.parseInt(randomProgression[progressionIndex])));
            randomProgression[progressionIndex] = "..";
            question[i] = String.join(" ", randomProgression);
        }
        Engine.logicGame(question, correctAnswer);
    }

    public static int hiddenNumber(int number) {
        return number;
    }
}
