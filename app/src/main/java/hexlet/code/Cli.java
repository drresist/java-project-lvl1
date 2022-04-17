package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String welcome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    public static void initialWelcome() {
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit
                Your choice:\s""");
        Scanner scanner = new Scanner(System.in);
        int gameVariant = scanner.nextInt();

        switch (gameVariant) {
            case 1 -> Cli.welcome();
            case 2 -> Even.startGame();
            default -> {
            }
        }
    }
}
