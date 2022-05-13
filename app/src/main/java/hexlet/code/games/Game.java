package hexlet.code.games;

public interface Game {

    String ANSWER = null;

    String generateTask();
    String getRules();
    String getAnswer();
    void setAnswer(String answer);
}
