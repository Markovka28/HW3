package ru.gb.oop.seminar03.game;

public class Answer {
    private final int cowCounter;
    private final int bullCounter;
    private final Integer tryCount;


    @Override
    public String toString() {
        return cowCounter + " коровы " + bullCounter + " быков, осталось попыток : " + tryCount;
    }

    public Answer(int cowCounter, int bullCounter, Integer tryCount) {
        this.cowCounter = cowCounter;
        this.bullCounter = bullCounter;
        this.tryCount = tryCount;
    }
}
