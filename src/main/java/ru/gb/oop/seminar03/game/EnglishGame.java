package ru.gb.oop.seminar03.game;

import java.util.Random;

public class EnglishGame extends AbstractGame {
    public static void main(String[] args) {
        Random random = new Random();
        char[] letters = {
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y', 'z'
        };
        for (int i = 0; i < 10; i++) {
            System.out.print(letters[random.nextInt(letters.length)]);
        }
    }

    @Override
    int generateCharList() {
        return 0;
    }
}
