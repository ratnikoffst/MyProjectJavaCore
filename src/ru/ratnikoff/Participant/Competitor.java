package ru.ratnikoff.Participant;

public interface Competitor { //  extends Runnable, Swimable, Wall
    void isOnDistance(int type, boolean b);

    void info();

    int getSwim();

    int getDist();

    int getWall();
}
