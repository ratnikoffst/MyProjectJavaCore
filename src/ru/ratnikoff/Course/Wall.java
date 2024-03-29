package ru.ratnikoff.Course;

import ru.ratnikoff.Participant.Competitor;

//public Animal
public class Wall implements Obstacle {
    private int jump;
    int type = 2;

    public Wall(int jump) {
        this.jump = jump;
    }


    @Override
    public boolean doIt(Competitor competitor) {
        if (competitor.getWall() >= jump) {
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
