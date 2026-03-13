package ru.yandex.sprint4;

import ru.yandex.sprint4.Person.*;
import ru.yandex.sprint4.Show.Ballet;
import ru.yandex.sprint4.Show.Opera;
import ru.yandex.sprint4.Show.Show;

import java.util.ArrayList;

public class Theatre {

    private static final String LIBRETTO_ONEGIN = "Опера П.И. Чайковского Евгений Онегин";
    private static final String LIBRETTO_NUTCRACKER = "Балет П.И. Чайковского Щелкунчик";
    private static final String MENU_BORDER = "======================================";

    public static void main(String[] args) {
        Actor actor1 = new Actor("Иван","Петров", Gender.MALE,180.0);
        Actor actor2 = new Actor("Лариса","Иванова",Gender.FEMALE,170.0);
        Actor actor3 = new Actor("Влад","Колязин",Gender.MALE,195.0);
        Director director1 = new Director("Петр","Романов",Gender.MALE,0);
        Director director2 = new Director("Анна","Кузьмина",Gender.FEMALE,0);
        Composer composer = new Composer("Петр","Чайковский",Gender.MALE);
        Choreographer choreographer = new Choreographer("Василиса","Премудрая",Gender.FEMALE);

        Show show = new Show("Дни турбиных",150,director1, new ArrayList<>());
        Opera opera = new Opera("Евгений Онегин",135,director2,new ArrayList<>(),composer,LIBRETTO_ONEGIN,12);
        Ballet ballet = new Ballet("Щелкунчик",180,director1,new ArrayList<>(),composer,LIBRETTO_NUTCRACKER,choreographer);

        show.addActor(actor1);
        show.addActor(actor2);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor2);
        ballet.addActor(actor3);
        ballet.addActor(actor2);
        printBorder();
        show.printTitle();
        show.printDirector();
        show.printActors();
        printBorder();
        opera.printTitle();
        opera.printDirector();
        opera.printActors();
        printBorder();
        ballet.printTitle();
        ballet.printDirector();
        ballet.printActors();
        printBorder();
        show.replaceActor(actor2,"Петров");
        show.replaceActor(actor3,"Петров");
        show.replaceActor(actor1,"Петров");
        printBorder();
        show.printTitle();
        show.printActors();
        System.out.println(MENU_BORDER);
        opera.printLibretto();
        ballet.printLibretto();
    }

    static void printBorder(){
        System.out.println(MENU_BORDER);
    }
}
