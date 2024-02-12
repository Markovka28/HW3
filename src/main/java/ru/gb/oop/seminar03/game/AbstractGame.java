package ru.gb.oop.seminar03.game;

public abstract class AbstractGame implements Game {
    protected GameNumber secretNumber;
    protected GameStatus status;
    protected StringBuilder history;

    public AbstractGame() {
        this.secretNumber = generateSecretNumber();
        this.status = GameStatus.IN_PROGRESS;
        this.history = new StringBuilder();
    }

    protected abstract GameNumber generateSecretNumber();

    @Override
    public void makeGuess(String guess) {
        Answer answer = evaluateGuess(guess);
        history.append(guess).append(" - Bulls: ").append(answer.getBulls()).append(", Cows: ").append(answer.getCows()).append("\n");

        if (answer.getBulls() == secretNumber.getNumber().length()) {
            status = GameStatus.WON;
        } else if (history.length() / 5 >= 10) {
            status = GameStatus.LOST;
        }
    }

    protected Answer evaluateGuess(String guess) {
        if (guess.length() < 5) {
            guess = String.format("%05d", Integer.parseInt(guess));
        }

        int bulls = secretNumber.getBulls(guess);
        int cows = secretNumber.getCows(guess);
        return new Answer(bulls, cows);
    }

    @Override
    public GameStatus getStatus() {
        return status;
    }

    @Override
    public String getSecretNumber() {
        return secretNumber.getNumber();
    }

    @Override
    public String getHistory() {
        return history.toString();
    }

    @Override
    public void restart() {
        secretNumber = generateSecretNumber();
        status = GameStatus.IN_PROGRESS;
        history = new StringBuilder();
    }
}
