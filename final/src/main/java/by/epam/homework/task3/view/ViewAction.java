package by.epam.homework.task3.view;


import by.epam.homework.task3.entity.Flower;

import java.util.ArrayList;

public class ViewAction {

    public void print(ArrayList<Flower> bouquet, PrintAble matcher) {
        matcher.print(bouquet);
    }
}
