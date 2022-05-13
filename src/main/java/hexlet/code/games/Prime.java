package hexlet.code.games;

import java.util.Random;

public final class Prime implements Game {
    private String answer;

    @Override
    public String generateTask() {
        final int maxBound = 100;
        Random random = new Random();
        int randomInt = random.nextInt(maxBound);
        boolean flag = false;
        setAnswer("Yes");
        for (int i = 2; i <= randomInt / 2; ++i) {
            if (randomInt % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            setAnswer("Yes");
        }
        if (flag) {
            setAnswer("No");
        }
        return String.valueOf(randomInt);
    }

    @Override
    public String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
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
