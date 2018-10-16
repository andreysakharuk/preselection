package by.epam.homework.task3.entity;

import java.util.Objects;

public class Lily extends Flower {

    private boolean pot;

    public Lily(String name, int price, String color, boolean pot) {
        super(name, price, color);
        this.pot = pot;
    }

    public boolean isPot() {
        return pot;
    }

    public void setPot(boolean pot) {
        this.pot = pot;
    }

    public String toString() {
        return super.toString() + ", Горшок: " + this.pot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Lily lily = (Lily) o;
        return pot == lily.pot;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pot);
    }
}
