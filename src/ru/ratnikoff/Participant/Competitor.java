package ru.ratnikoff.Participant;

public interface Competitor {
    void run(int dist);
    void swim(int height);
    void jump(int heigth);
    boolean isOndistance();
    void info();

    void getDistance(int dist, int swim, int heigth);
}
