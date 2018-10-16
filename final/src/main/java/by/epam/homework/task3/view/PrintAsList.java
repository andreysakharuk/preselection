package by.epam.homework.task3.view;


import by.epam.homework.task3.entity.Flower;
import java.util.ArrayList;

public class PrintAsList implements PrintAble {

    public void print(ArrayList<Flower> bouquet){
        for (Flower flower : bouquet){
            System.out.println(flower.toString());
        }
        System.out.println(" ");
    }
}
