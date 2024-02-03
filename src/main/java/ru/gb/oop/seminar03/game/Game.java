package ru.gb.oop.seminar03.game;

public interface Game {
    void start(Integer wordSize, Integer tryCount);
    Answer inputValue(String value);
    GameStatus getGameStatus();
}
