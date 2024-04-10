package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Progression {

    public static void startProgressionGame() {
        Engine.welcome();
        System.out.println("What number is missing in the progression?");

        Engine engine = new Engine();

        while (engine.getValueCorrectAnswer() != Engine.getAnswersToWin()) {
            Random random = new Random();
            final int minValueProgressionStep = 1;
            final int maxValueProgressionStep = 4;
            int progressionStep = random.nextInt(minValueProgressionStep, maxValueProgressionStep);
            final int minValueQuantityElement = 4;
            final int maxValueQuantityElement = 10;
            int quantityElement = random.nextInt(minValueQuantityElement, maxValueQuantityElement);
            final int maxValueNextNumber = 100;
            int nextNumber = random.nextInt(maxValueNextNumber);
            String progression = Integer.toString(nextNumber);
            final int correctionQuantityElementForCycle = 13;
            while (quantityElement < correctionQuantityElementForCycle) {
                nextNumber = nextNumber + progressionStep;
                progression = progression + " " + nextNumber;
                quantityElement = quantityElement + 1;
            }

            String[] massive = progression.split(" ");
            int massiveIndex = random.nextInt(massive.length);
            String desiredNumber = massive[massiveIndex];
            massive[massiveIndex] = "..";
            String hiddenProgression = String.join(" ", massive);
            System.out.println("Question: " + hiddenProgression);

            Engine.userAnswer();

            if (Engine.getAnswer().equals(desiredNumber)) {
                System.out.println("Correct!");
                engine.setValueCorrectAnswer(engine.getValueCorrectAnswer() + 1);
            } else {
                System.out.println("'" + Engine.getAnswer() + "' is wrong answer ;(. Correct answer was '"
                        + desiredNumber + "'.");
                break;
            }
        }
        Engine.victory();
    }
}
