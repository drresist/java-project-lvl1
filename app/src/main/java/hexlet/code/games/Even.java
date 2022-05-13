package hexlet.code.games;

public final class Even implements Game {
    private String answer;

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public String generateTask() {
        int a = (int) (Math.random() * 100);

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
