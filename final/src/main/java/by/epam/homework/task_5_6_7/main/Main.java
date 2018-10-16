package by.epam.homework.task_5_6_7.main;

import by.epam.homework.task_5_6_7.data.*;
import by.epam.homework.task_5_6_7.entity.Bouquet;
import by.epam.homework.task_5_6_7.entity.Flower;
import by.epam.homework.task_5_6_7.entity.Lily;
import by.epam.homework.task_5_6_7.entity.Orchid;
import by.epam.homework.task_5_6_7.entity.Rose;
import by.epam.homework.task_5_6_7.service.count.BouquetService;
import by.epam.homework.task_5_6_7.exception.EmptyBouquetException;
import by.epam.homework.task_5_6_7.exception.NegativePriceException;
import by.epam.homework.task_5_6_7.exception.NotFoundFlowerException;
import by.epam.homework.task_5_6_7.service.find.FindAction;
import by.epam.homework.task_5_6_7.service.find.FindByAllergicSmell;
import by.epam.homework.task_5_6_7.service.find.FindByName;
import by.epam.homework.task_5_6_7.view.PrintAsList;
import by.epam.homework.task_5_6_7.view.PrintAsTable;
import by.epam.homework.task_5_6_7.view.ViewAction;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;


public class Main {

// Цветочница
    public static void main(String[] args) {

// Создаем букет, добавляем в него цветы и выводим результат в виде таблицы
        Bouquet bouquet = new Bouquet();
        Rose rose = new Rose("роза", 5, "красный", true);
        bouquet.addFlowerToBouquet(rose);
        bouquet.addFlowerToBouquet(new Lily("лилия", 4, "белый", true));
        bouquet.addFlowerToBouquet(new Orchid("орхидея", 3, "белый", true));
        ArrayList<Flower> bouquetFilled = bouquet.getBouquet();
        ViewAction viewAction = new ViewAction();
        System.out.println("Букет создан:");
        viewAction.print(bouquetFilled, new PrintAsTable());

// Считаем цену букета и выводим результат
        BouquetService bouquetService = new BouquetService();
        try {
            System.out.println("Цена Букета: " + bouquetService.countBouquetPrice(bouquetFilled) + "\n");
        } catch (NegativePriceException e) {
            System.out.println("Цена не может быть отрицательной. Измените цену для: " + e.getTypeOfFlower());
        }

// Считаем среднюю цену одного цветка в букете и выводим результат
        try {
            System.out.println("Средняя цена одного цветка в букете: " + bouquetService.countAverageFlowerPrice(bouquetFilled) + "\n");
        } catch (EmptyBouquetException e) {
            System.out.println("Букет пустой. Добавьте цветы в букет.");
        } catch (NegativePriceException e) {
            System.out.println("Цена не может быть отрицательной. Измените цену для: " + e.getTypeOfFlower());
        }

        FindAction findAction = new FindAction();

// Ищем в букете розы и выводим результат в виде таблицы
        try {
            System.out.println("Все розы в букете:");
            ArrayList<Flower> bouquetWithRose = findAction.find(bouquetFilled, new FindByName("роза"));
            viewAction.print(bouquetWithRose, new PrintAsTable());
        } catch (NotFoundFlowerException e) {
            System.out.println("В букете нет искомого цветка по заданному параметру: " + e.getMatcher());
        }
// Ищем цветок с аллергическим запахом и выводим результат в виде списка
        try {
            System.out.println("Цветок с аллергическим запахом:");
            ArrayList<Flower> bouquetWithSmell = findAction.find(bouquetFilled, new FindByAllergicSmell());
            viewAction.print(bouquetWithSmell, new PrintAsList());
        } catch (NotFoundFlowerException e) {
            System.out.println("В букете нет искомого цветка по заданному параметру: " + e.getMatcher());
        }
// Удаляем розу из букета и выводим результат
        System.out.println("Букет с удаленной розой:");
        bouquet.removeFlowerFromBouquet(new Rose("роза", 5, "красный", true));
        viewAction.print(bouquet.getBouquet(), new PrintAsTable());

// Считываем данные из TXT файла и выводим в виде таблицы
        try {
            System.out.println("Букет считан из TXT файла:");
            Bouquet bouquetReader = new BouquetReader().read();
            viewAction.print(bouquetReader.getBouquet(), new PrintAsList());
        } catch (IOException e) {
            System.out.println("Файл для считывания данных не найден");
        }

// Записываем данные в TXT файл
        try {
            new BouquetWriter(bouquetFilled).writeBouquetToFile();
        } catch (IOException e) {
            System.out.println("Файл с данными уже создан");
        }

// Считываем данные из базы данных и выводим в виде таблицы
        try {
            System.out.println("Букет считан из базы данных Derby:");
            Bouquet bouquetFromDataBase = new BouquetDataBaseReader().read();
            viewAction.print(bouquetFromDataBase.getBouquet(), new PrintAsTable());
        } catch (SQLException e) {
            System.out.println("Неверный запрос к базе данных");
        }

// Считываем данные из JSON файла и выводим в виде списка
        System.out.println("Букет считан из Json файла:");
        Bouquet bouquetJson = new BouquetJsonReader().read();
        viewAction.print(bouquetJson.getBouquet(), new PrintAsList());
    }


}
