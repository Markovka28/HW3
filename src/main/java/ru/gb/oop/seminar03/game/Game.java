package ru.gb.oop.seminar03.game;

public interface Game {
    void makeGuess(String guess);
    GameStatus getStatus();
    String getSecretNumber();
    String getHistory();
    void restart();
}
