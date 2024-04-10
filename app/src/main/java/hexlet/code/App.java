package hexlet.code;
import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {

    public static void main(String[] args) {
        int gameNumberEven = 2;
        int gameNumberCalc = 3;
        int gameNumberGCD = 4;
        int gameNumberProgression = 5;
        int gameNumberPrime = 6;

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Your choice: " + choice + "\n");
            System.out.println("Welcome to the Brain Games!");
            Cli.userName();
        } else if (choice == gameNumberEven) {
            System.out.println("Your choice: " + choice);
            Even.startEvenGame();
        } else if (choice == gameNumberCalc) {
            System.out.println("Your choice: " + choice);
            Calc.startCalcGame();
        } else if (choice == gameNumberGCD) {
            System.out.println("Your choice: " + choice);
            GCD.startGcdGame();
        } else if (choice == gameNumberProgression) {
            System.out.println("Your choice: " + choice);
            Progression.startProgressionGame();
        } else if (choice == gameNumberPrime) {
            System.out.println("Your choice: " + choice);
            Prime.startPrimeGame();
        } else if (choice == 0) {
            System.out.println("Exit");
        } else {
            System.out.println("Incorrect value.");
        }
    }
}
