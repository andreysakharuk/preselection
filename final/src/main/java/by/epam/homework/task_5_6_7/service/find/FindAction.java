package by.epam.homework.task_5_6_7.service.find;


import by.epam.homework.task_5_6_7.entity.Flower;
import by.epam.homework.task_5_6_7.exception.NotFoundFlowerException;

import java.util.ArrayList;

public class FindAction {

    public ArrayList<Flower> find(ArrayList<Flower> bouquet, FindAble matcher) throws NotFoundFlowerException {
        return matcher.find(bouquet);
    }
}
