package ru.gb.oop.seminar03;

public class Main {
    public static void main(String[] args) {
        Fruit fruit = Fruit.BANANA;
        switch (fruit) {
            case APPLE, PINEAPPLE, ORANGE, MANDARINE, BANANA -> System.out.println(fruit.getRuFruitName());
            default -> System.out.println("Такого фрукта нет");
        }
    }
}