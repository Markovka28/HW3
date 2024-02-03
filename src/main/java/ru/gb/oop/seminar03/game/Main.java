package ru.gb.oop.seminar03.game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AbstractGame ag = new GenerateDigits();
        ag.start(5, 3);
        System.out.println("Введите значение ");
        Scanner value = new Scanner(System.in);
        while (ag.getGameStatus().equals(GameStatus.START)) {
            Answer answer = ag.inputValue(value.nextLine());
            System.out.println(answer);
        }
        if (ag.getGameStatus().equals(GameStatus.WIN)) {
            System.out.println("Вы победили");
        } else if (ag.getGameStatus().equals(GameStatus.LOOSE)) {
            System.out.println("Вы проиграли");
        } else {
            System.out.println("Неопознанный статус");
        }

        int[] secretNumber = new int[5];
        int attempts = 0;
        int bulls = 0;
        int cows = 0;
        do {
            bulls = 0;
            cows = 0;
            attempts++;
            int guessNumber = value.nextInt();
            for (int k : secretNumber) {
                if (guessNumber % 10 == k % 10) {
                    bulls++;
                } else {
                    for (int i : secretNumber) {
                        if (guessNumber % 10 == i % 10) {
                            cows++;
                        }
                    }
                }
            }
            System.out.println("Попытка " + attempts + ": быков " + bulls + ", коров " + cows);
        } while (bulls != secretNumber.length);
        System.out.println("Вам потребовалось " + attempts + " попыток");
        System.out.println("Быков: " + bulls);
        System.out.println("Коров: " + cows);
    }
}

