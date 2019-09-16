package ru.ratnikoff.Participant;

public class Human extends Animal {
    public Human(String human) {
        this.mName = "Человек " + human;
        dist = 100;
        jump = 3;
        swim = 30;
    }
}
