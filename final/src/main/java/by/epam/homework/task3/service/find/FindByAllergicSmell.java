package by.epam.homework.task3.service.find;

import by.epam.homework.task3.entity.Flower;
import by.epam.homework.task3.entity.Orchid;

import java.util.ArrayList;

public class FindByAllergicSmell implements FindAble {

    public ArrayList<Flower> find(ArrayList<Flower> bouquet) {
        ArrayList<Flower> bouquetWithSmell = new ArrayList<Flower>();
        for (Flower flower : bouquet) {
            if (flower instanceof Orchid) {
                if (((Orchid) flower).isAllergicSmell()) {
                    bouquetWithSmell.add(flower);
                }
            }
        }
        return bouquetWithSmell;
    }
}
