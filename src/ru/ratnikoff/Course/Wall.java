package ru.ratnikoff.Course;

//public Animal
public class Wall extends Dolt {

    public Wall(int wall) {
        mObstacles = wall;
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
