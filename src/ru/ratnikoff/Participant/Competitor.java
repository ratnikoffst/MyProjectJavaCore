package ru.ratnikoff.Participant;

public interface Competitor {
    void info();

    int getDistance();
    int getSwim();
    int getWall();
    void setIsDistance(Boolean check);
    void setIsSwim(Boolean check);
    void setIsWall(Boolean check);
}
