package by.epam.homework.task4;


import java.util.HashMap;
import java.util.Random;
import java.util.TreeMap;

public class MapSpeedTest {

    public static void main(String[] args) {

// Добавление элеиентов в коллекцию
        HashMap<Double, Double> mapHash = new HashMap<Double, Double>();
        long startTime = System.nanoTime();
        for (int y = 0; y < 1000000; y++) {
            Double key = new Random().nextGaussian();
            Double value = new Random().nextGaussian();
            if (y == 500000){
                mapHash.put(1.0, 1.0);
            }
            mapHash.put(key, value);

        }
        long finishTime = System.nanoTime();
        long timeRunning = finishTime - startTime;
        System.out.println("Время добавления элементов в коллекцию HashMap: " + timeRunning);

        TreeMap<Double, Double> mapTree = new TreeMap<Double, Double>();
        long startTime1 = System.nanoTime();
        for (int y = 0; y < 1000000; y++) {
            Double d = new Random().nextGaussian();
            Double key = new Random().nextGaussian();
            Double value = new Random().nextGaussian();
            if (y == 500000){
                mapTree.put(1.0, 1.0);
            }
            mapTree.put(key, value);

        }
        long finishTime1 = System.nanoTime();
        long timeRunning1 = finishTime1 - startTime1;
        System.out.println("Время добавления элементов в коллекцию TreeMap: " + timeRunning1);

        if (timeRunning < timeRunning1) {
            System.out.println("HashMap быстрее при добавлении элементов в коллекцию");
        } else if (timeRunning > timeRunning1) {
            System.out.println("TreeMap быстрее при добавлении элементов в коллекцию");
        }

// Поиск элемента в коллекции
        long startTime4 = System.nanoTime();
        mapHash.containsKey(1.0);
        long finishTime4 = System.nanoTime();
        long timeRunning4 = finishTime4 - startTime4;
        System.out.println("\nВремя поиска элемента в коллекции HashMap: " + timeRunning4);

        long startTime5 = System.nanoTime();
        mapTree.containsKey(1.0);
        long finishTime5 = System.nanoTime();
        long timeRunning5 = finishTime5 - startTime5;
        System.out.println("Время поиска элемента в коллекции TreeMap:  " + timeRunning5);

        if (timeRunning4 < timeRunning5) {
            System.out.println("HashMap быстрее при поиске элемента в коллекции");
        } else if (timeRunning4 > timeRunning5) {
            System.out.println("TreeMap быстрее при поиске элемента в коллекции");
        }

// Удаление элемента из коллекции
        long startTime6 = System.nanoTime();
        mapHash.remove(1.0);
        long finishTime6 = System.nanoTime();
        long timeRunning6 = finishTime6 - startTime6;
        System.out.println("\nВремя удаления элемента из коллекции HashMap: " + timeRunning6);

        long startTime7 = System.nanoTime();
        mapTree.remove(1.0);
        long finishTime7 = System.nanoTime();
        long timeRunning7 = finishTime7 - startTime7;
        System.out.println("Время удаления элемента из коллекции из коллекции TreeMap:  " + timeRunning7);

        if (timeRunning6 < timeRunning7) {
            System.out.println("HashMap быстрее при удалении элемента из коллекции");
        } else if (timeRunning6 > timeRunning7) {
            System.out.println("TreeMap быстрее при удалении элемента из коллекции");
        }

    }
}
