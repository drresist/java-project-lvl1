package hexlet.code.games;

import java.util.Random;

public final class Progression implements Game {
    private String answer;

    @Override
    public String generateTask() {
        Random random = new Random();
        int progressionLen = random.nextInt(7, 10);
        int diff = random.nextInt(10);
        int answerIndex = random.nextInt(0, progressionLen - 1); // task index
        StringBuilder task = new StringBuilder();
        int base = diff;
        for (int i = 0; i < progressionLen; i++) {
            base += diff;
            if (answerIndex != i) {
                task.append(base);
            } else {
                setAnswer(String.valueOf(base));
                task.append("..");
            }
            task.append(" ");
        }
        return task.toString();
    }

    @Override
    public String getRules() {
        return "What number is missing in the progression?";
    }

    @Override
    public String getAnswer() {
        return answer;
    }

    @Override
    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
