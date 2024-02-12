package ru.gb.oop.seminar03.game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new BullsAndCowsGame();

        while (game.getStatus() == GameStatus.IN_PROGRESS) {
            System.out.print("Введите предполагаемые 4 цифры: ");
            String guess = scanner.nextLine();
            game.makeGuess(guess);
        }

        System.out.println("Игра окончена! Секретный номер был: " + game.getSecretNumber());
    }
}

