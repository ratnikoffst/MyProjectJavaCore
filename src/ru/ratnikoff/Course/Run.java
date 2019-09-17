package ru.ratnikoff.Course;

public class Run extends Dolt {
    public Run(int dist) {
        mObstacles=dist;
    }

//    @Override
//    public void setObstacles(int obstacles) {
//        mObstacles=obstacles;
//    }

    @Override
    public boolean getCheck(int obstacles) {
        if (mObstacles > obstacles) {
            return false;
        } else {
            return true;
        }
    }
}

