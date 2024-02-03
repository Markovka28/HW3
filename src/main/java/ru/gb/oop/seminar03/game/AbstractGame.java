package ru.gb.oop.seminar03.game;

import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game {
    abstract int generateCharList();

    private String word;
    Integer tryCount;
    GameStatus gameStatus = GameStatus.INIT;

    @Override
    public void start(Integer wordSize, Integer tryCount) {
        word = RussianGame(wordSize);
        this.tryCount = tryCount;
        gameStatus = GameStatus.START;
    }



    private String RussianGame(Integer wordSize) {
        int alphabet = generateCharList();
        Random rnd = new Random();
        StringBuilder result = new StringBuilder(" ");
        for (int i = 0; i < wordSize; i++) {
            rnd.nextInt(alphabet);
            result.append(alphabet);

        }
        return result.toString();
    }

    @Override
    public Answer inputValue(String value) {
        if (!getGameStatus().equals(GameStatus.START)) {
            throw new RuntimeException("Игра не запущена");
        }
        int cowCounter = 0;
        int bullCounter = 0;
        for (int i = 0; i < word.length(); i++) {
            if (value.charAt(i) == word.charAt(i)) {
                cowCounter++;
                bullCounter++;
            } else if (word.contains(String.valueOf(value.charAt(i)))) {
                cowCounter++;
            }
        }
        tryCount--;
        if (tryCount == 0){
            gameStatus = GameStatus.LOOSE;
        }
        if (bullCounter == word.length()){
            gameStatus = GameStatus.WIN;
        }
        return new Answer(cowCounter, bullCounter, tryCount);
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }
}
