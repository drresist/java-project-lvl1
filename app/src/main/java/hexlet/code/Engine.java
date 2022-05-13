package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Game;

import java.util.Scanner;


public class Engine {
    public static void startGame(int gameType) {

        String userName = Cli.welcome();
        Game game = selectGame(gameType);
        assert game != null;
        System.out.println(game.getRules());
        int counter = 0;
        while (counter != 3) {
            System.out.println(game.generateTask());
            System.out.print("Your answer: ");
            if (validateAnswer(game.getAnswer())) {
                counter += 1;
            } else {
                break;
            }
        }
        if (counter == 3) {
            System.out.printf("Congratulations, %s!%n", userName);
        }
    }

    private static Game selectGame(int gameType) {
        switch (gameType) {
            case 2 -> {
                return new Even();
            }
            case 3 -> {
                return new Calc();
            }
            case 4 -> {
                return new GCD();
            }
            default -> {
            }
        }
        return null;
    }

    public static boolean validateAnswer(String correctAnswer) {
        Scanner sc = new Scanner(System.in);
        String userAnswer = sc.next();
        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            System.out.println("Correct!");
            return true;
        }
        //'yes' is wrong answer ;(. Correct answer was 'no'.
        System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'%n", userAnswer, correctAnswer);
        System.out.printf("Let's try again, %s%n", Cli.getUserName());
        return false;
    }
}
