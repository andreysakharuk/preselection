package by.epam.homework.task3.entity;

import java.util.ArrayList;

public class Bouquet {

    private ArrayList<Flower> bouquet;

    public Bouquet() {
        bouquet = new ArrayList<Flower>();
    }


    public ArrayList<Flower> getBouquet() {
        return bouquet;
    }

    public void addFlowerToBouquet(Flower flower) {
        bouquet.add(flower);
    }

    public void removeFlowerFromBouquet(Flower flower) {
        bouquet.remove(flower);
    }

}
