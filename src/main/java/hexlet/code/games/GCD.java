package hexlet.code.games;

public final class GCD implements Game {
    private String answer;

    @Override
    public String generateTask() {
        final int multyplyer = 100;
        int a = (int) (Math.random() * multyplyer);
        int b = (int) (Math.random() * multyplyer);

        setAnswer(String.valueOf(gcd(a, b)));
        return String.format("%d %d", a, b);

    }

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    @Override
    public String getRules() {
        return "Find the greatest common divisor of given numbers.";
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
