package by.epam.homework.task3.service.count;


import by.epam.homework.task3.entity.Flower;

import java.util.ArrayList;

public class BouquetService {

    public BouquetService() {
    }

    public int countBouquetPrice(ArrayList<Flower> bouquetFilled) {
        int cost = 0;
        for (Flower flower : bouquetFilled) {
            cost = cost + flower.getPrice();
        }
        return cost;
    }

    public int countAverageFlowerPrice(ArrayList<Flower> bouquetFilled) {
        int cost = 0;
        int numberOfFlowers = 0;
        for (Flower flower : bouquetFilled) {
            cost = cost + flower.getPrice();
            numberOfFlowers++;

        }
        return cost / numberOfFlowers;
    }


}
