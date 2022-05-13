package hexlet.code.games;

import java.util.Random;

public final class Calc implements Game {
    public String getRules() {
        return "What is the result of the expression?";
    }
    private final String[] actions = new String[]{"+", "-", "*"};
    private String answer;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String correctAnswer) {
        this.answer = correctAnswer;
    }

    public String generateTask() {
        final int multiplier = 100;
        int a = (int) (Math.random() * multiplier);
        int b = (int) (Math.random() * multiplier);

        int randomNum = new Random().nextInt(actions.length);
        String action = actions[randomNum];
        switch (action) {
            case "*" -> setAnswer(String.valueOf(a * b));
            case "+" -> setAnswer(String.valueOf(a + b));
            case "-" -> setAnswer(String.valueOf(a - b));
            default -> throw new IllegalStateException("Unexpected value: " + action);
        }
        return String.format("%d %s %d", a, action, b);
    }
}
