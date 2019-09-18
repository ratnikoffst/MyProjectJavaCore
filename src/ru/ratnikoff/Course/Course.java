package ru.ratnikoff.Course;

import ru.ratnikoff.Participant.Competitor;
import ru.ratnikoff.Team.Team;

public class Course {
    Obstacle[] mObstacles;

    public Course(Obstacle[] obstacles) {
        mObstacles = obstacles;
    }

    public void doIt(Team team) {
        for (Competitor mComp : team.mCompetitors) {
            for (Obstacle obstacle : mObstacles) {
                Boolean ok = obstacle.doIt(mComp);
                if (ok) {
                    mComp.isOnDistance(obstacle.getType(), obstacle.doIt(mComp));
                } else {
                    break;
                }
            }
        }
    }
}

