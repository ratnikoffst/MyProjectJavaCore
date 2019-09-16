package ru.ratnikoff.Team;

import ru.ratnikoff.Course.Course;
import ru.ratnikoff.Participant.Cats;
import ru.ratnikoff.Participant.Competitor;
import ru.ratnikoff.Participant.Dogs;
import ru.ratnikoff.Participant.Human;

public class Team {
    Competitor[] mCompetitors;

    public Team(String human, String cat, String dog) {
        mCompetitors = new Competitor[]{new Human(human), new Cats(cat), new Dogs(dog)};
    }

    public void showResults() {
        mCompetitors[0].info();
        mCompetitors[1].info();
        mCompetitors[2].info();
    }

    public void getGoDistance(int dist, int swim, int heigth) {
       // for (Competi)

        mCompetitors[0].getDistance(dist,swim,heigth);
        mCompetitors[1].getDistance(dist,swim,heigth);
        mCompetitors[2].getDistance(dist,swim,heigth);
    }
}
