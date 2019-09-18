package ru.ratnikoff.Course;

import ru.ratnikoff.Participant.Competitor;

public class Swimable implements Obstacle {
    private int swim;
    int type = 1;

    public Swimable(int swim) {
        this.swim = swim;
    }


    @Override
    public boolean doIt(Competitor competitor) {
        if (competitor.getSwim() >= swim) {
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
