package by.epam.homework.task_5_6_7.view;


import by.epam.homework.task_5_6_7.entity.Flower;

import java.util.ArrayList;

public class ViewAction {

    public void print(ArrayList<Flower> bouquet, PrintAble matcher) {
        matcher.print(bouquet);
    }
}
