package by.epam.homework.task_5_6_7.data;

import by.epam.homework.task_5_6_7.entity.Bouquet;

import java.io.IOException;
import java.sql.SQLException;

public interface ReadAble {

    Bouquet read() throws SQLException, IOException;
}
