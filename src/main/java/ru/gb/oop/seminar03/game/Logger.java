package ru.gb.oop.seminar03.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger extends File {
    public Logger(String parent, String child) {
        super(parent, child);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> history = new ArrayList<>();

        while (true) {
            System.out.println("Введите число:");
            String userInput = scanner.nextLine();
            if (userInput.equals("exit")) {
                break;
            }

            System.out.println("Введите число, которое вы загадали:");
            String secretNumber = scanner.nextLine();
            if (secretNumber.equals("exit")) {
                break;
            }

            int bulls = 0;
            int cows = 0;
            for (int i = 0; i < userInput.length(); i++) {
                if (userInput.charAt(i) == secretNumber.charAt(i)) {
                    bulls++;
                } else {
                    int index = secretNumber.indexOf(userInput.charAt(i));
                    if (index != -1) {
                        cows++;
                    }
                }
            }

            System.out.println("Быки: " + bulls + ", Коровы: " + cows);
            history.add(userInput + " - " + bulls + " быков, " + cows + " коров");

            try {
                File file = new File("history.txt");
                FileWriter writer = new FileWriter(file, true);
                for (String game : history) {
                    writer.write(game + "\n");
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("История:");
        for (String game : history) {
            System.out.println(game);
        }
    }

    public static void log(String s) {

    }
}

