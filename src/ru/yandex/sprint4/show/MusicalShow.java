package ru.yandex.sprint4.show;

import ru.yandex.sprint4.person.Actor;
import ru.yandex.sprint4.person.Composer;
import ru.yandex.sprint4.person.Director;

import java.util.ArrayList;

public class MusicalShow extends Show {
    private final Composer musicAuthor;
    private final String librettoText;

    public MusicalShow(String title,
                       int duration,
                       Director director,
                       ArrayList<Actor> listOfActors,
                       Composer musicAuthor,
                       String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto(){
        System.out.println(librettoText);
    }

}
