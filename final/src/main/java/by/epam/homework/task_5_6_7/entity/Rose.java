package by.epam.homework.task_5_6_7.entity;

import java.util.Objects;

public class Rose extends Flower {

    private boolean thorns;

    public Rose(String name, int price, String color, boolean thorns) {
        super(name, price, color);
        this.thorns = thorns;
    }

    public boolean isThorns() {
        return thorns;
    }

    public void setThorns(boolean thorns) {
        this.thorns = thorns;
    }

    public String toString() {
        return super.toString() + " ,Шипы: " + this.thorns;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rose rose = (Rose) o;
        return thorns == rose.thorns;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), thorns);
    }
}
