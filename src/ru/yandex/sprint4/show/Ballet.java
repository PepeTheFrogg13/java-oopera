package ru.yandex.sprint4.show;

import ru.yandex.sprint4.person.Actor;
import ru.yandex.sprint4.person.Choreographer;
import ru.yandex.sprint4.person.Composer;
import ru.yandex.sprint4.person.Director;

import java.util.ArrayList;

public class Ballet extends MusicalShow {
    private final Choreographer choreographer;

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
