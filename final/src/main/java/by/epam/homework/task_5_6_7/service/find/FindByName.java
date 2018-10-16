package by.epam.homework.task_5_6_7.service.find;


import by.epam.homework.task_5_6_7.entity.Flower;
import by.epam.homework.task_5_6_7.exception.NotFoundFlowerException;

import java.util.ArrayList;

public class FindByName implements FindAble{

    private String name;

    public FindByName(String name){
        this.name = name;
    }

    public ArrayList<Flower> find(ArrayList<Flower> bouquet) throws NotFoundFlowerException {
        ArrayList<Flower> bouquetNew = new ArrayList<Flower>();
        int number = 0;
        for(Flower flower: bouquet){
            if (flower.getName().equals(this.name)){
                bouquetNew.add(flower);
                number++;
            }
        }
        if (number == 0){
            throw new NotFoundFlowerException(name + " ");
        }
        return bouquetNew;
    }

}
