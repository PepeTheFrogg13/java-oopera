package ru.yandex.sprint4.show;

import ru.yandex.sprint4.person.Actor;
import ru.yandex.sprint4.person.Director;

import java.util.ArrayList;

public class Show {
    private final String title;
    private final int duration;
    private final Director director;
    private final ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        //Добавляем у руководителя кол-во спектаклей
        this.director.addShow();
        this.listOfActors = listOfActors;
    }

    public void printDirector() {
        System.out.println(director);
    }

    public void printTitle() {
        System.out.println(title);
    }

    public void printActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Такой актёр уже есть в списке!");
        } else {
            listOfActors.add(actor);
        }
    }

    public void replaceActor(Actor actorReplacing, String surname) {
        int index = -1;
        //Ищем актёра с такой фамилией в списке
        for (Actor actor : listOfActors) {
            if (actor.getSurname().equals(surname)) {
                index = listOfActors.indexOf(actor);
            }
        }

        if (index == -1) {
            System.out.println("Актер с такой фамилией не найден!");
        } else if (listOfActors.contains(actorReplacing)) {
            /*
               В ТЗ не написано, что делать, если актёр замены есть в списке,
               и при этом актёр, которого необходимо заменить тоже есть в списке,
               поэтому оставляем список как есть
            */
            System.out.println("Актёр замены уже есть в списке!");
        } else {
            listOfActors.set(index, actorReplacing);
        }

    }

}
