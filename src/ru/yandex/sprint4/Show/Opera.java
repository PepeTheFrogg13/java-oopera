package ru.yandex.sprint4.Show;

import ru.yandex.sprint4.Person.Actor;
import ru.yandex.sprint4.Person.Composer;
import ru.yandex.sprint4.Person.Director;

import java.util.ArrayList;

public class Opera extends MusicalShow{
    private int choirSize;

    public Opera(String title,
                 int duration,
                 Director director,
                 ArrayList<Actor> listOfActors,
                 Composer musicAuthor,
                 String librettoText,
                 int choirSize) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
