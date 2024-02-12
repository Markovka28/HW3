package ru.gb.oop.seminar03.game;

public class GameNumber {
    private String number;

    public GameNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public int getBulls(String guess) {
        int bulls = 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == guess.charAt(i)) {
                bulls++;
            }
        }
        return bulls;
    }

    public int getCows(String guess) {
        int cows = 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.contains(String.valueOf(guess.charAt(i))) && number.charAt(i) != guess.charAt(i)) {
                cows++;
            }
        }
        return cows;
    }
}
