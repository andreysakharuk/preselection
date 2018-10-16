package by.epam.homework.task_5_6_7.service.find;

import by.epam.homework.task_5_6_7.entity.Flower;
import by.epam.homework.task_5_6_7.entity.Orchid;

import java.util.ArrayList;

public class FindByAllergicSmell implements FindAble {

    @Override
    public ArrayList<Flower> find(ArrayList<Flower> bouquet) {
        ArrayList<Flower> bouquetNew = new ArrayList<Flower>();
        for (Flower flower : bouquet) {
            if (flower instanceof Orchid) {
                if (((Orchid) flower).isAllergicSmell()) {
                    bouquetNew.add(flower);
                }
            }
        }
        return bouquetNew;
    }
}
