package hexlet.code.games;

import java.util.Random;

public final class Calc implements Game {
    public Calc() {
    }

    public String getRules() {
        return "What is the result of the expression?";
    }

    private final String[] actions = new String[]{"+", "-", "*"};
    private String question;
    private String answer;

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String generateTask() {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);

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
