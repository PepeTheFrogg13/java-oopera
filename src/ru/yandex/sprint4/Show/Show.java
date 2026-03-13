package ru.yandex.sprint4.Show;

import ru.yandex.sprint4.Person.Actor;
import ru.yandex.sprint4.Person.Director;

import java.util.ArrayList;

public class Show {
    private final String title;
    private final int duration;
    private final Director director;
    private  final ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        //Добавляем у руководителя кол-во спектаклей
        this.director.addShow();
        this.listOfActors = listOfActors;
    }

    public void printDirector(){
        System.out.println(director);
    }

    public void printTitle() {System.out.println(title);}

    public void printActors(){
        for (Actor actor : listOfActors){
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor){
        if (listOfActors.contains(actor)) return;
        listOfActors.add(actor);
    }

    public void replaceActor(Actor actorReplacing, String surname){
        if (listOfActors.contains(actorReplacing)){
            System.out.println("Актёр замены уже есть в списке!");
            return;
        }
        for (Actor actor : listOfActors){
            if (actor.getSurname().equals(surname)){
                listOfActors.remove(actor);
                listOfActors.add(actorReplacing);
                return;
            }
        }
        System.out.println("Актер с такой фамилией не найден!");
    }


}
