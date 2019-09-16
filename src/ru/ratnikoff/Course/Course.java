package ru.ratnikoff.Course;

import ru.ratnikoff.Participant.Competitor;
import ru.ratnikoff.Team.Team;

public class Course {
    Obstacles[] mObstacles;

    public Course(int dist, int swim, int heigth) {
        mObstacles = new Obstacles[]{new Run(dist), new Swim(swim), new Wall(heigth)};
    }

    public void doIt(Team team) {
        for (Competitor mComp : team.mCompetitors) {
            mComp.setIsDistance(mObstacles[0].getCheck(mComp.getDistance()));
            mComp.setIsSwim(mObstacles[1].getCheck(mComp.getSwim()));
            mComp.setIsWall(mObstacles[2].getCheck(mComp.getWall()));
        }
    }
}

