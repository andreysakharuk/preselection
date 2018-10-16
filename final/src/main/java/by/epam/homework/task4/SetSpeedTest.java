package by.epam.homework.task4;


import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class SetSpeedTest {

    public static void main(String[] args) {

// Добавление элеиентов в коллекцию
        HashSet<Double> setHash = new HashSet<Double>();
        long startTime = System.nanoTime();
        for (int y = 0; y < 1000000; y++) {
            Double d = new Random().nextGaussian();
            setHash.add(d);
            setHash.add(1.0);

        }
        long finishTime = System.nanoTime();
        long timeRunning = finishTime - startTime;
        System.out.println("Время добавления элементов в коллекцию HashSet: " + timeRunning);

        TreeSet<Double> setTree = new TreeSet<Double>();
        long startTime1 = System.nanoTime();
        for (int y = 0; y < 1000000; y++) {
            Double d = new Random().nextGaussian();
            setTree.add(d);
            setTree.add(1.0);
        }
        long finishTime1 = System.nanoTime();
        long timeRunning1 = finishTime1 - startTime1;
        System.out.println("Время добавления элементов в коллекцию TreeSet: " + timeRunning1);

        if (timeRunning < timeRunning1) {
            System.out.println("HashSet быстрее при добавлении элементов в коллекцию");
        } else if (timeRunning > timeRunning1) {
            System.out.println("TreeSet быстрее при добавлении элементов в коллекцию");
        }

// Поиск элемента в коллекции
        long startTime4 = System.nanoTime();
        setHash.contains(1.0);
        long finishTime4 = System.nanoTime();
        long timeRunning4 = finishTime4 - startTime4;
        System.out.println("\nВремя поиска элемента в коллекции HashSet: " + timeRunning4);

        long startTime5 = System.nanoTime();
        setHash.contains(1.0);
        long finishTime5 = System.nanoTime();
        long timeRunning5 = finishTime5 - startTime5;
        System.out.println("Время поиска элемента в коллекции TreeSet:  " + timeRunning5);

        if (timeRunning4 < timeRunning5) {
            System.out.println("HashSet быстрее при поиске элемента в коллекции");
        } else if (timeRunning4 > timeRunning5) {
            System.out.println("TreeSet быстрее при поиске элемента в коллекции");
        }

// Удаление элемента из коллекции
        long startTime6 = System.nanoTime();
        setHash.remove(1.0);
        long finishTime6 = System.nanoTime();
        long timeRunning6 = finishTime6 - startTime6;
        System.out.println("\nВремя удаления элемента из коллекции HashSet: " + timeRunning6);

        long startTime7 = System.nanoTime();
        setTree.remove(1.0);
        long finishTime7 = System.nanoTime();
        long timeRunning7 = finishTime7 - startTime7;
        System.out.println("Время удаления элемента из коллекции из коллекции TreeSet:  " + timeRunning7);

        if (timeRunning6 < timeRunning7) {
            System.out.println("HashSet быстрее при удалении элемента из коллекции");
        } else if (timeRunning6 > timeRunning7) {
            System.out.println("TreeSet быстрее при удалении элемента из коллекции");
        }
    }
}
