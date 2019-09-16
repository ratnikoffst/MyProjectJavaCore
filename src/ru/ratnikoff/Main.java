package ru.ratnikoff;

import ru.ratnikoff.Course.Course;
import ru.ratnikoff.Team.Team;

public class Main {

    public static void main(String[] args) {
        Course mCourse = new Course(300, 300, 300); // Создаем полосу препятствий
        Team team = new Team("Human", "Cat", "Dog"); // Создаем команду
        mCourse.doIt(team); // Просим команду пройти полосу
        team.showResults(); // Показываем результаты// write your code here
    }
}
