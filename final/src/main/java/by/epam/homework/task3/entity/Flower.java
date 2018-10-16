package by.epam.homework.task3.entity;

import java.util.Objects;

public abstract class Flower {

    private String name;
    private int price;
    private String color;

    public Flower(String name, int price, String color) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Название: " + getName() + ", Цена: " + getPrice() + ", Цвет: " + getColor();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return price == flower.price &&
                Objects.equals(name, flower.name) &&
                Objects.equals(color, flower.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, color);
    }
}
