package ru.ratnikoff.Team;

import ru.ratnikoff.Participant.Cats;
import ru.ratnikoff.Participant.Competitor;
import ru.ratnikoff.Participant.Dogs;
import ru.ratnikoff.Participant.Human;

public class Team {
    public Competitor[] mCompetitors;

    public Team(Human human, Cats cat, Dogs dog) {
        mCompetitors = new Competitor[]{human, cat, dog};
    }

    public void showResults() {
        for (Competitor mComp : mCompetitors) {
            mComp.info();
        }
    }
}
