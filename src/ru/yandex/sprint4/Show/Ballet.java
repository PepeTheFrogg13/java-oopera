package ru.yandex.sprint4.Show;

import ru.yandex.sprint4.Person.Actor;
import ru.yandex.sprint4.Person.Choreographer;
import ru.yandex.sprint4.Person.Composer;
import ru.yandex.sprint4.Person.Director;

import java.util.ArrayList;

public class Ballet extends MusicalShow {
    private Choreographer choreographer;

    public Ballet(String title,
                  int duration,
                  Director director,
                  ArrayList<Actor> listOfActors,
                  Composer musicAuthor,
                  String librettoText,
                  Choreographer choreographer) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
