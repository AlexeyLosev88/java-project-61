package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int MIN_PROGRESSION_STEP = 1;
    private static final int MAX_PROGRESSION_STEP = 4;
    private static final int MIN_QUANTITY_ELEMENT = 4;
    private static final int MAX_QUANTITY_ELEMENT = 10;
    private static final int MAX_VALUE_NEXT_NUMBER = 100;
    private static final int CORRECTION_QUANTITY_ELEMENT_FOR_CYCLE = 13;

    public static void startGame() {
        String rules = "What number is missing in the progression?";
        String[] question = new String[Engine.QUANTITY_ANSWERS_TO_WIN];
        String[] correctAnswer = new String[Engine.QUANTITY_ANSWERS_TO_WIN];
        for (int i = 0; i < Engine.QUANTITY_ANSWERS_TO_WIN; i++) {
            int progressionStep = Utils.getRandomInt(MIN_PROGRESSION_STEP, MAX_PROGRESSION_STEP);
            int quantityElement = Utils.getRandomInt(MIN_QUANTITY_ELEMENT, MAX_QUANTITY_ELEMENT);
            int nextNumber = Utils.getRandomInt(MAX_VALUE_NEXT_NUMBER);
            String[] randomProgression = getRandomProgression(progressionStep, quantityElement,
                    nextNumber, CORRECTION_QUANTITY_ELEMENT_FOR_CYCLE);
            int progressionIndex = Utils.getRandomInt(randomProgression.length);
            correctAnswer[i] = Integer.toString(Integer.parseInt(randomProgression[progressionIndex]));
            randomProgression[progressionIndex] = "..";
            question[i] = String.join(" ", randomProgression);
        }
        Engine.start(question, correctAnswer, rules);
    }

    public static String[] getRandomProgression(int progressionStep, int quantityElement,
                                                int nextNumber, int correctionQuantityElementForCycle) {
        String progression = Integer.toString(nextNumber);
        while (quantityElement < correctionQuantityElementForCycle) {
            nextNumber = nextNumber + progressionStep;
            progression = progression + " " + nextNumber;
            quantityElement = quantityElement + 1;
        }
        return progression.split(" ");
    }
}
