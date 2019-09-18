package ru.ratnikoff.Course;

import ru.ratnikoff.Participant.Competitor;

public class Run implements Obstacle {
    private int run;
    int type = 0;

    public Run(int dist) {
        run = dist;
    }

    @Override
    public boolean doIt(Competitor competitor) {
        if (competitor.getDist() >= run) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getType() {
        return type;
    }
}

