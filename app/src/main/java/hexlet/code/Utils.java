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
}
