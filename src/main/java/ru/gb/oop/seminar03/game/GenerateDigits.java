package ru.gb.oop.seminar03.game;

import java.util.Random;

public class GenerateDigits extends AbstractGame {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.printf("%02d%n", random.nextInt(10));
        }
    }

    @Override
    int generateCharList() {
        return 0;
    }
}
