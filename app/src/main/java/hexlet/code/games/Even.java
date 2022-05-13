package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even implements Game {
    public static void startGame() {
        try (Scanner sc = new Scanner(System.in)) {
			String name = Cli.welcome();
			System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
			boolean complete = false;
			int counter = 0;
			while (!complete) {
			    int taskNumber = generateTask();
			    System.out.println("Question: " + taskNumber);
			    System.out.print("Your answer: ");
			    String userAnswer = sc.next();
			    if (checkAnswer(userAnswer, taskNumber)) {
			        counter++;
			        System.out.println("Correct!");
			        if (counter == 3) {
			            System.out.printf("Congratulations, %s!", name);
			            complete = true;
			        }
			    } else {
			        System.out.printf("'%s' is wrong answer :(. Correct answer was '%s'\n",
			                userAnswer,
			                opositeAnswer(userAnswer));
			        System.out.printf("Let's try again, %s!", name);
			        break;
			    }
			}
		}


    }

    private static String opositeAnswer(String userAnswer) {
        if (userAnswer.equalsIgnoreCase("yes")) {
            return "no";
        } else {
            return "yes";
        }
    }

    private static boolean checkAnswer(String userAnswer, int taskNumber) {
        boolean isOdd = taskNumber % 2 == 0;
        if (userAnswer.equalsIgnoreCase("yes") && isOdd) {
            return true;
        } else {
            return userAnswer.equalsIgnoreCase("no") && !isOdd;
        }
    }

    private static int generateTask() {
        Random r = new Random();
        return r.nextInt(100) + 1; // 100 - set range from 1 to 100
    }


}
