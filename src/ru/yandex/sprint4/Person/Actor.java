package ru.yandex.sprint4.Person;

import java.util.Objects;

public class Actor extends Person {

    private final double height;

    public Actor(String name, String surname, Gender gender, double height) {
        super(name,surname,gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + " (" +  height + ")";
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Actor actor = (Actor) object;
        return actor.getName().equals(getName()) && actor.getSurname().equals(getSurname()) && Double.compare(height,actor.height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getName()) + Objects.hashCode(getSurname()) + Objects.hashCode(height);
    }
}
