package ru.ratnikoff.Course;

public class Swim extends Dolt {
    public Swim(int swim) {
        mObstacles = swim;
    }

    @Override
    public boolean getCheck(int obstacles) {
        if (mObstacles > obstacles) {
            return false;
        } else {
            return true;
        }
    }
}
