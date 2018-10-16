package by.epam.homework.task_5_6_7.view;


import by.epam.homework.task_5_6_7.entity.Flower;

import java.util.ArrayList;

public class PrintAsList implements PrintAble {

    public void print(ArrayList<Flower> bouquet) {
        for (Flower flower : bouquet) {
            System.out.println(flower.toString());
        }
        System.out.println(" ");
    }
}
