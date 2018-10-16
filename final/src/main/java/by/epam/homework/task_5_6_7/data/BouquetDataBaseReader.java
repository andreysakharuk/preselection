package by.epam.homework.task_5_6_7.data;

import by.epam.homework.task_5_6_7.entity.Bouquet;
import by.epam.homework.task_5_6_7.entity.Lily;
import by.epam.homework.task_5_6_7.entity.Orchid;
import by.epam.homework.task_5_6_7.entity.Rose;
import org.apache.derby.jdbc.EmbeddedDriver;

import java.sql.*;

public class BouquetDataBaseReader implements ReadAble{

    private Bouquet bouquet;

    public BouquetDataBaseReader() {
        bouquet = new Bouquet();
    }

    public Bouquet read() throws SQLException {
        DriverManager.registerDriver(new EmbeddedDriver());
        Connection connection = DriverManager.getConnection("jdbc:derby:db;user=admin;password=pass");
        Statement statement = connection.createStatement();

/* Creation of database and filling it with values. Add 'create=true' parameter in getConnection() method
        statement.executeUpdate("CREATE TABLE flowers (ID int GENERATED ALWAYS AS IDENTITY(START WITH 1, INCREMENT BY 1), NAME varchar (255), PRICE int, COLOR varchar(255), SPECIFIC varchar(255))");
        statement.addBatch("INSERT INTO flowers(NAME, PRICE, COLOR, SPECIFIC) VALUES ('роза', 2, 'красный', 'true')");
        statement.addBatch("INSERT INTO flowers(NAME, PRICE, COLOR, SPECIFIC) VALUES ('лилия', 3, 'белый', 'true')");
        statement.addBatch("INSERT INTO flowers(NAME, PRICE, COLOR, SPECIFIC) VALUES ('орхидея', 4, 'желтый', 'true')");
        statement.addBatch("INSERT INTO flowers(NAME, PRICE, COLOR, SPECIFIC) VALUES ('роза', 4, 'черный', 'false')");
        statement.addBatch("INSERT INTO flowers(NAME, PRICE, COLOR, SPECIFIC) VALUES ('лилия', 3, 'синий', 'true')");
        statement.addBatch("INSERT INTO flowers(NAME, PRICE, COLOR, SPECIFIC) VALUES ('орхидея', 5, 'синий', 'true')");
        statement.executeBatch();
*/

        ResultSet resultSet = statement.executeQuery("SELECT  NAME, PRICE, COLOR, SPECIFIC FROM flowers");
        while (resultSet.next()) {
            switch (resultSet.getString("NAME")) {
                case "роза":
                    bouquet.addFlowerToBouquet(new Rose(
                            resultSet.getString("NAME"),
                            resultSet.getInt("PRICE"),
                            resultSet.getString("COLOR"),
                            resultSet.getBoolean("SPECIFIC")));
                    break;
                case "лилия":
                    bouquet.addFlowerToBouquet(new Lily(
                            resultSet.getString("NAME"),
                            resultSet.getInt("PRICE"),
                            resultSet.getString("COLOR"),
                            resultSet.getBoolean("SPECIFIC")));
                    break;
                case "орхидея":
                    bouquet.addFlowerToBouquet(new Orchid(
                            resultSet.getString("NAME"),
                            resultSet.getInt("PRICE"),
                            resultSet.getString("COLOR"),
                            resultSet.getBoolean("SPECIFIC")));
                    break;
            }
        }
        return bouquet;
    }
}

