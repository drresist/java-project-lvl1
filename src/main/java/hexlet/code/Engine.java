package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Game;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;


public class Engine {
    public static void startGame(int gameType) {

        String userName = Cli.welcome();
        Game game = selectGame(gameType);
        assert game != null;
        System.out.println(game.getRules());
        int counter = 0;
        final int winCondition = 3;
        while (counter != winCondition) {
            System.out.println("Question: " + game.generateTask());
            System.out.print("Your answer: ");
            if (validateAnswer(game.getAnswer())) {
                counter += 1;
            } else {
                break;
            }
        }
        if (counter == winCondition) {
            System.out.printf("Congratulations, %s!%n", userName);
        }
    }

    private static Game selectGame(int gameType) {
        final String strGameType = String.valueOf(gameType);
        if (strGameType.equalsIgnoreCase("2")) {
            return new Even();
        } else if (strGameType.equalsIgnoreCase("3")) {
            return new Calc();
        } else if (strGameType.equalsIgnoreCase("4")) {
            return new GCD();
        } else if (strGameType.equalsIgnoreCase("5")) {
            return new Progression();
        } else if (strGameType.equalsIgnoreCase("6")) {
            return new Prime();
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
        System.out.printf("Let's try again, %s!%n", Cli.getUserName());
        return false;
    }
}
