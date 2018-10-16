package by.epam.homework.task_5_6_7.entity;


import java.util.Objects;

public class Orchid extends Flower {

    private boolean allergicSmell;

    public Orchid(String name, int price, String color, boolean allergicSmell) {
        super(name, price, color);
        this.allergicSmell = allergicSmell;
    }

    public boolean isAllergicSmell() {
        return allergicSmell;
    }

    public void setAllergicSmell(boolean allergicSmell) {
        this.allergicSmell = allergicSmell;
    }

    public String toString(){
        return super.toString() + ", Аллергичен: " + this.allergicSmell;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Orchid orchid = (Orchid) o;
        return allergicSmell == orchid.allergicSmell;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), allergicSmell);
    }
}
