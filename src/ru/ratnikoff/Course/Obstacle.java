package ru.ratnikoff.Course;

import ru.ratnikoff.Participant.Competitor;

public interface Obstacle {
    boolean doIt(Competitor competitor);
    int getType();
}