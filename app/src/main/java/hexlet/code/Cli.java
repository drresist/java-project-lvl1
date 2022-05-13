package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String userName;

    public static String getUserName() {
        return userName;
    }

    public static String welcome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.next();
        userName = name;
        System.out.println("Hello, " + name + "!");

        return userName;
    }

    public static void initialWelcome() {
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                0 - Exit
                Your choice:\s""");
        try (Scanner scanner = new Scanner(System.in)) {
            int gameVariant = scanner.nextInt();
            switch (gameVariant) {
                case 1 -> Cli.welcome();
                case 2 -> Engine.startGame(2);
                case 3 -> Engine.startGame(3);
                default -> {
                }
            }
        }
    }
}
