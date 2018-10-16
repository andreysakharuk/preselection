package by.epam.homework.task_5_6_7.view;

import by.epam.homework.task_5_6_7.entity.Flower;

import java.util.ArrayList;

public class PrintAsTable implements PrintAble {

    public void print(ArrayList<Flower> bouquet) {
        System.out.printf("| %-20s | %-20s | %-20s\n", "НАЗВАНИЕ", "ЦВЕТ", "ЦЕНА");
        for (Flower flower : bouquet) {
            System.out.printf("| %-20s | %-20s | %-20d\n", flower.getName(), flower.getColor(),
                    flower.getPrice());
        }
        System.out.println(" ");
    }
}
