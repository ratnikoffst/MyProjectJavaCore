package ru.ratnikoff.Course;

import ru.ratnikoff.Team.Team;

public class Course {
    int dist;
    int swim;
    int heigth;

    public Course(int dist, int swim, int heigth) {
        this.dist = dist;
        this.swim = swim;
        this.heigth = heigth;
    }

    public void doIt(Team team) {
        team.getGoDistance(dist,swim,heigth);

    }
}
