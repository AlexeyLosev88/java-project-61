package hexlet.code;
import java.util.Random;

public class Utils {
    public static int getRandomInt(int number) {
        Random random = new Random();
        return random.nextInt(number);
    }
    public static int getRandomInt(int number1, int number2) {
        Random random = new Random();
        return random.nextInt(number1, number2);
    }

    public static String[] getRandomProgression(int minProgressionStep, int maxProgressionStep,
                                           int minQuantityElement, int maxQuantityElement,
                                           int maxValueNextNumber, int correctionQuantityElementForCycle) {
        int progressionStep = getRandomInt(minProgressionStep, maxProgressionStep);
        int quantityElement = getRandomInt(minQuantityElement, maxQuantityElement);
        int nextNumber = getRandomInt(maxValueNextNumber);
        String progression = Integer.toString(nextNumber);
        while (quantityElement < correctionQuantityElementForCycle) {
            nextNumber = nextNumber + progressionStep;
            progression = progression + " " + nextNumber;
            quantityElement = quantityElement + 1;
        }
        return progression.split(" ");
    }
}
