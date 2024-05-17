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

    public static void startProgressionGame() {
        Engine.welcome();
        System.out.println("What number is missing in the progression?");
        while (Engine.getValueCorrectAnswer() != Engine.getAnswersToWin()) {
            int progressionStep = Utils.getRandomInt(MIN_PROGRESSION_STEP, MAX_PROGRESSION_STEP);
            int quantityElement = Utils.getRandomInt(MIN_QUANTITY_ELEMENT, MAX_QUANTITY_ELEMENT);
            int nextNumber = Utils.getRandomInt(MAX_VALUE_NEXT_NUMBER);
            String progression = Integer.toString(nextNumber);
            while (quantityElement < CORRECTION_QUANTITY_ELEMENT_FOR_CYCLE) {
                nextNumber = nextNumber + progressionStep;
                progression = progression + " " + nextNumber;
                quantityElement = quantityElement + 1;
            }
            String[] massive = progression.split(" ");
            int massiveIndex = Utils.getRandomInt(massive.length);

            String correctAnswer = Integer.toString(solution(Integer.parseInt(massive[massiveIndex])));

            massive[massiveIndex] = "..";
            String hiddenProgression = String.join(" ", massive);

            String question = "Question: " + hiddenProgression;

            Engine.logicGame(question, correctAnswer);
        }
    }

    public static int solution(int hiddenNumber) {
        return hiddenNumber;
    }
}
