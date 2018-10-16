package by.epam.homework.task_5_6_7.data;

import by.epam.homework.task_5_6_7.entity.Flower;
import by.epam.homework.task_5_6_7.entity.Lily;
import by.epam.homework.task_5_6_7.entity.Orchid;
import by.epam.homework.task_5_6_7.entity.Rose;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class BouquetWriter {

    public ArrayList<Flower> bouquet;

    public BouquetWriter(ArrayList<Flower> bouquet) {
        this.bouquet = bouquet;
    }

    public void writeBouquetToFile() throws IOException {
        BufferedWriter
            writer =
            new BufferedWriter(
                new FileWriter("src\\main\\java\\by\\epam\\homework\\task_5_6_7\\data\\BouquetExportData.txt",
                               true));
        for (Flower flower : bouquet) {
            if (flower instanceof Rose) {
                writer.write(flower.getName() + ", " + flower.getPrice() + ", " + flower.getColor() + ", " + ((Rose) flower).isThorns() + System
                    .getProperty("line.separator"));
            } else if (flower instanceof Lily) {
                writer.write(flower.getName() + ", " + flower.getPrice() + ", " + flower.getColor() + ", " + ((Lily) flower).isPot() + System
                    .getProperty("line.separator"));
            } else if (flower instanceof Orchid) {
                writer.write(flower.getName() + ", " + flower.getPrice() + ", " + flower.getColor() + ", " + ((Orchid) flower).isAllergicSmell() + System
                    .getProperty("line.separator"));
            }
        }
        writer.close();
    }
}
