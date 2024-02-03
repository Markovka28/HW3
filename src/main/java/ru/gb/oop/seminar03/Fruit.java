package ru.gb.oop.seminar03;

public enum Fruit {
    APPLE("яблоко"),
    PINEAPPLE("ананас"),
    ORANGE("апельсин"),
    MANDARINE("мандарин"),
    BANANA("банан");
    private final String ruFruitName;

    Fruit(String ruFruitName) {
        this.ruFruitName = ruFruitName;
    }

    public String getRuFruitName() {
        return ruFruitName;
    }
}
