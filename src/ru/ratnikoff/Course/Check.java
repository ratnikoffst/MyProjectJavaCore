package ru.ratnikoff.Course;

public abstract class Check implements Obstacles {
    int mObstacles;

    public void setObstacles(int obstacles) {
        mObstacles = obstacles;
    }

    public void info() {
    }

    public boolean getCheck(int obstacles) {
        if (mObstacles > obstacles) {
            return false;
        } else {
            return true;
        }
    }
}
