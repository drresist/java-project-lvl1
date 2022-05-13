package hexlet.code.games;

public final class Even implements Game {
    private String answer;

    public void setAnswer(String correctAnswer) {
        this.answer = correctAnswer;
    }

    public String getAnswer() {
        return answer;
    }

    public String generateTask() {
        final int multiplyer = 100;
        int a = (int) (Math.random() * multiplyer);

        if (a % 2 == 0) {
            setAnswer("Yes");
        } else {
            setAnswer("No");
        }
        return String.valueOf(a);
    }

    @Override
    public String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
}
