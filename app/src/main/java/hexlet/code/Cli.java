package hexlet.code;
import java.util.Scanner;

public class Cli {

    public static void userName() {
        System.out.println("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        scanner.close();
    }
}