package ru.gb.oop.seminar03.game;

import java.util.Random;

public class BullsAndCowsGame extends AbstractGame {
    @Override
    protected GameNumber generateSecretNumber() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            sb.append(random.nextInt(10));
        }
        return new GameNumber(sb.toString());
    }
}
