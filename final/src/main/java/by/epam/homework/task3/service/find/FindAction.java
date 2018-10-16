package by.epam.homework.task3.service.find;


import by.epam.homework.task3.entity.Flower;

import java.util.ArrayList;

public class FindAction {

    public ArrayList<Flower> find(ArrayList<Flower> bouquet, FindAble matcher) {
        return matcher.find(bouquet);
    }

}
