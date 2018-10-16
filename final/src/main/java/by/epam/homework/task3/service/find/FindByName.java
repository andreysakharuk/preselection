package by.epam.homework.task3.service.find;


import by.epam.homework.task3.entity.Flower;

import java.util.ArrayList;

public class FindByName implements FindAble {

    private String name;

    public FindByName(String name) {
        this.name = name;
    }

    public ArrayList<Flower> find(ArrayList<Flower> bouquet) {
        ArrayList<Flower> bouquetWithName = new ArrayList<Flower>();
        for (Flower flower : bouquet) {
            if (flower.getName().equals(this.name)) {
                bouquetWithName.add(flower);
            }
        }
        return bouquetWithName;
    }

}
