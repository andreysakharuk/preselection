package by.epam.homework.task_5_6_7.service.count;


import by.epam.homework.task_5_6_7.entity.Flower;
import by.epam.homework.task_5_6_7.exception.EmptyBouquetException;
import by.epam.homework.task_5_6_7.exception.NegativePriceException;

import java.util.ArrayList;

public class BouquetService {


    public BouquetService() {
    }

    public int countBouquetPrice(ArrayList<Flower> bouquetFilled) throws NegativePriceException {
        int cost = 0;
        for (Flower flower : bouquetFilled) {
            if (flower.getPrice() < 0) {
                throw new NegativePriceException(flower.toString());
            } else {
                cost = cost + flower.getPrice();
            }
        }
        return cost;
    }

    public int countAverageFlowerPrice(ArrayList<Flower> bouquetFilled) throws NegativePriceException,
            EmptyBouquetException {
        int cost = 0;
        int numberOfFlowers = 0;
        for (Flower flower : bouquetFilled) {
            if (flower.getPrice() < 0) {
                throw new NegativePriceException(flower.toString());
            } else {
                cost = cost + flower.getPrice();
                numberOfFlowers++;
            }
        }
        if (numberOfFlowers == 0) {
            throw new EmptyBouquetException();
        }
        return cost / numberOfFlowers;
    }
}



