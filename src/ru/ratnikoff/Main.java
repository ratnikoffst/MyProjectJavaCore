package ru.ratnikoff;

import ru.ratnikoff.Course.*;
import ru.ratnikoff.Participant.Cats;
import ru.ratnikoff.Participant.Dogs;
import ru.ratnikoff.Participant.Human;
import ru.ratnikoff.Team.Team;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите дистанцию забега: ");
        int dist = in.nextInt();

        System.out.print("Введите дистанцию заплыва: ");
        int swim = in.nextInt();

        System.out.print("Введите высоту стены: ");
        int heigth = in.nextInt();

        Course mCourse = new Course(new Obstacle[]{new Run(dist) ,new Swimable( swim), new Wall(heigth)}); // Создаем полосу препятствий
        Team team = new Team(new Human("Human"), new Cats("Cat"), new Dogs("Dog")); // Создаем команду
        mCourse.doIt(team); // Просим команду пройти полосу
        team.showResults(); // Показываем результаты// write your code here
    }
}
