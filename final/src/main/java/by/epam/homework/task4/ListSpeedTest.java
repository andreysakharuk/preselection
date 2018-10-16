package by.epam.homework.task4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;


public class ListSpeedTest {

    public static void main(String[] args) {

// Добавление объектов
        LinkedList<Double> listLink = new LinkedList<Double>();
        long startTime = System.nanoTime();
        for (int y = 0; y < 1000000; y++) {
            Double d = new Random().nextGaussian();
            listLink.add(d);
        }
        long finishTime = System.nanoTime();
        long timeRunning = finishTime - startTime;
        System.out.println("Время добавления элементов в коллекцию LinkedList: " + timeRunning);

        ArrayList<Double> listArray = new ArrayList<Double>();
        long startTime1 = System.nanoTime();
        for (int y = 0; y < 1000000; y++) {
            Double d = new Random().nextGaussian();
            listArray.add(d);
        }

        long finishTime1 = System.nanoTime();
        long timeRunning1 = finishTime1 - startTime1;
        System.out.println("Время добавления элементов в коллекцию ArrayList:  " + timeRunning1);

        if (timeRunning < timeRunning1) {
            System.out.println("LinkedList быстрее при добавлении элементов в коллекцию");
        } else if (timeRunning > timeRunning1) {
            System.out.println("ArrayList быстрее при добавлении элементов в коллекцию");
        }

// Вставка в середину
        long startTime2 = System.nanoTime();
        listLink.set(500000, 8888.8888);
        long finishTime2 = System.nanoTime();
        long timeRunning2 = finishTime2 - startTime2;
        System.out.println("\nВремя вставки элемента в середину коллекции LinkedList: " + timeRunning2);

        long startTime3 = System.nanoTime();
        listArray.set(500000, 8888.888);
        long finishTime3 = System.nanoTime();
        long timeRunning3 = finishTime3 - startTime3;
        System.out.println("Время вставки элемента в середину коллекции ArrayList:  " + timeRunning3);

        if (timeRunning2 < timeRunning3) {
            System.out.println("LinkedList быстрее при вставке элемента в середину коллекции");
        } else if (timeRunning2 > timeRunning3) {
            System.out.println("ArrayList быстрее при вставке элемента в середину коллекции");
        }

// Поиск элемента
        long startTime4 = System.nanoTime();
        listLink.contains(8888.888);
        long finishTime4 = System.nanoTime();
        long timeRunning4 = finishTime4 - startTime4;
        System.out.println("\nВремя поиска элемента в коллекции LinkedList: " + timeRunning4);

        long startTime5 = System.nanoTime();
        listArray.contains(8888.888);
        long finishTime5 = System.nanoTime();
        long timeRunning5 = finishTime5 - startTime5;
        System.out.println("Время поиска элемента в коллекции ArrayList:  " + timeRunning5);

        if (timeRunning4 < timeRunning5) {
            System.out.println("LinkedList быстрее при поиске элемента в коллекции");
        } else if (timeRunning4 > timeRunning5) {
            System.out.println("ArrayList быстрее при поиске элемента в коллекции");
        }

// Удаление элемента
        long startTime6 = System.nanoTime();
        listLink.remove(500000);
        long finishTime6 = System.nanoTime();
        long timeRunning6 = finishTime6 - startTime6;
        System.out.println("\nВремя удаления элемента из коллекции LinkedList: " + timeRunning6);

        long startTime7 = System.nanoTime();
        listArray.remove(500000);
        long finishTime7 = System.nanoTime();
        long timeRunning7 = finishTime7 - startTime7;
        System.out.println("Время удаления элемента из коллекции из коллекции ArrayList:  " + timeRunning7);

        if (timeRunning6 < timeRunning7) {
            System.out.println("LinkedList быстрее при удалении элемента из коллекции");
        } else if (timeRunning6 > timeRunning7) {
            System.out.println("ArrayList быстрее при удалении элемента из коллекции");
        }
    }

}
