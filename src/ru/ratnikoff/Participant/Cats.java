package ru.ratnikoff.Participant;

public class Cats extends Animal {
    public Cats(String cat) {
        super("Кошара " + cat, 50, 3, 30);
        mName = "Кошара " + cat;
        dist = 50;
        jump = 3;
        swim = 30;
    }
}
