package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Progression {

    public static void startProgressionGame() {
        Engine.welcome();
        System.out.println("What number is missing in the progression?");

        while (Engine.valueCorrectAnswer != 3) {
            Random random = new Random();
            int progressionStep = random.nextInt(1, 4);
            int quantityElement = random.nextInt(4, 10);
            int nextNumber = random.nextInt(100);
            String progression = Integer.toString(nextNumber);

            while (quantityElement < 13) {
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

            if (Engine.answer.equals(desiredNumber)) {
                System.out.println("Correct!");
                Engine.valueCorrectAnswer = Engine.valueCorrectAnswer + 1;
            } else {
                System.out.println("'" + Engine.answer + "' is wrong answer ;(. Correct answer was '"
                        + desiredNumber + "'.");
                break;
            }
        }
        Engine.victory();

    }
}
