package ru.gb.oop.seminar03.game;

import java.util.Random;

public class RussianGame extends AbstractGame {
    public static void main(String[] args) {
        Random random;
        random = new Random();
        char[] letters = {
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'
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
