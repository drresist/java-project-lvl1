package hexlet.code.games;

import java.util.Random;

public final class Progression implements Game {
    private String answer;

    @Override
    public String generateTask() {
        Random random = new Random();
        final int minBound = 7;
        final int maxBound = 7;
        int progressionLen = random.nextInt(minBound, maxBound);
        int diff = random.nextInt(maxBound);
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
    public void setAnswer(String correctAnswer) {
        this.answer = correctAnswer;
    }
}
