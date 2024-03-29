package hexlet.code;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Your choice: " + choice + "\n");
            System.out.println("Welcome to the Brain Games!");
            Cli.userName();
        } else if (choice == 2) {
            System.out.println("Your choice: " + choice + "\n");
            System.out.println("Welcome to the Brain Games!");
            Even.startEvenGame();
        } else if (choice == 0) {
            System.out.println("Exit");
        } else {
            System.out.println("Incorrect value.");
        }
    }
}
