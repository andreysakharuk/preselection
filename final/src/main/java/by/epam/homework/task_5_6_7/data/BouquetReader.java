package by.epam.homework.task_5_6_7.data;

import by.epam.homework.task_5_6_7.entity.Bouquet;
import by.epam.homework.task_5_6_7.entity.Lily;
import by.epam.homework.task_5_6_7.entity.Orchid;
import by.epam.homework.task_5_6_7.entity.Rose;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class BouquetReader implements ReadAble{

    private Bouquet bouquet;

    public BouquetReader() {
        bouquet = new Bouquet();
    }

    public Bouquet read() throws IOException {
        Scanner scanner = new Scanner(new FileReader("src\\main\\java\\by\\epam\\homework\\task_5_6_7\\data\\BouquetData.txt"));
        ArrayList<String> line = new ArrayList<String>();
        while (scanner.hasNextLine()) {
            line.add(scanner.nextLine());
        }
        for (String parameter : line) {
            String[] parameters = parameter.split(", ");
            switch (parameters[0]) {
                case "роза":
                    bouquet.addFlowerToBouquet(new Rose(
                            parameters[0],
                            Integer.parseInt(parameters[1]),
                            parameters[2],
                            Boolean.parseBoolean(parameters[3])));
                    break;
                case "лилия":
                    bouquet.addFlowerToBouquet(new Lily(
                            parameters[0],
                            Integer.parseInt(parameters[1]),
                            parameters[2],
                            Boolean.parseBoolean(parameters[3])));
                    break;
                case "орхидея":
                    bouquet.addFlowerToBouquet(new Orchid(
                            parameters[0],
                            Integer.parseInt(parameters[1]),
                            parameters[2],
                            Boolean.parseBoolean(parameters[3])));
                    break;
            }
        }
        scanner.close();
        return bouquet;
    }


}
