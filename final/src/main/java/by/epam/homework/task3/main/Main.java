package by.epam.homework.task3.main;

import by.epam.homework.task3.entity.Bouquet;
import by.epam.homework.task3.entity.Flower;
import by.epam.homework.task3.entity.Lily;
import by.epam.homework.task3.entity.Orchid;
import by.epam.homework.task3.entity.Rose;
import by.epam.homework.task3.service.count.BouquetService;
import by.epam.homework.task3.service.find.FindAction;
import by.epam.homework.task3.service.find.FindByAllergicSmell;
import by.epam.homework.task3.service.find.FindByName;
import by.epam.homework.task3.view.PrintAsList;
import by.epam.homework.task3.view.PrintAsTable;
import by.epam.homework.task3.view.ViewAction;

import java.util.ArrayList;


public class Main {

// Цветочница
    public static void main(String[] args) {

// Создаем букет и добавляем в него цветы
        Bouquet bouquet = new Bouquet();
        Rose rose = new Rose("роза", 4, "белый", true);
        bouquet.addFlowerToBouquet(rose);
        bouquet.addFlowerToBouquet(new Lily("лилия", 5, "красный", true));
        bouquet.addFlowerToBouquet(new Orchid("орхидея", 3, "белый", true));

// Выводим созданный букет в виде таблицы
        ArrayList<Flower> bouquetFilled = bouquet.getBouquet();
        ViewAction viewAction = new ViewAction();
        viewAction.print(bouquetFilled, new PrintAsTable());

// Считаем цену букета и выводим результат
        BouquetService bouquetService = new BouquetService();
        System.out.println("Стоимость букета: " + bouquetService.countBouquetPrice(bouquetFilled) + "\n");

// Считаем среднюю цену одного цветка в букете и выводим результат
        System.out.println("Средняя цена одного цветка в букете: " + bouquetService.countAverageFlowerPrice(bouquetFilled) + "\n");

// Ищем в букете розы и выводим результат в виде таблицы
        FindAction findAction = new FindAction();
        System.out.println("Все розы в букете:");
        ArrayList<Flower> bouquetWithRose = findAction.find(bouquetFilled, new FindByName("роза"));
        viewAction.print(bouquetWithRose, new PrintAsTable());

// Ищем в букете цветы с аллергическим запахом и выводим результат в виде списка
        System.out.println("Цветок с аллергическим запахом:");
        ArrayList<Flower> bouquetWithSmell = findAction.find(bouquetFilled, new FindByAllergicSmell());
        viewAction.print(bouquetWithSmell, new PrintAsList());

// Удаляем цветок роза из букета и выводим результат в виде списка
        System.out.println("Букет с удаленной розой");
        bouquet.removeFlowerFromBouquet(rose);
        viewAction.print(bouquetFilled, new PrintAsTable());
    }
}
