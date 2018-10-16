package by.epam.homework.task_5_6_7.data;


import by.epam.homework.task_5_6_7.entity.*;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BouquetJsonReader implements ReadAble {

    private Bouquet bouquet;

    public BouquetJsonReader() {
        bouquet = new Bouquet();
    }

    public Bouquet read(){
        JsonObject jsonObject = new JsonParser().parse("{\n" +
                "      \"id\": 1,\n" +
                "      \"name\": \"роза\",\n" +
                "      \"price\": 4,\n" +
                "      \"color\": \"красный\",\n" +
                "      \"thorns\": true\n" +
                "    }").getAsJsonObject();
        switch (jsonObject.get("name").getAsString()) {
            case "роза":
                bouquet.addFlowerToBouquet(new Rose(
                        jsonObject.get("name").getAsString(),
                        jsonObject.get("price").getAsInt(),
                        jsonObject.get("color").getAsString(),
                        jsonObject.get("thorns").getAsBoolean()));
                break;
            case "лилия":
                bouquet.addFlowerToBouquet(new Lily(
                        jsonObject.get("name").getAsString(),
                        jsonObject.get("price").getAsInt(),
                        jsonObject.get("color").getAsString(),
                        jsonObject.get("specific").getAsBoolean()));
                break;
            case "орхидея":
                bouquet.addFlowerToBouquet(new Orchid(
                        jsonObject.get("name").getAsString(),
                        jsonObject.get("price").getAsInt(),
                        jsonObject.get("color").getAsString(),
                        jsonObject.get("specific").getAsBoolean()));
                break;
        }
        return bouquet;
    }
}
