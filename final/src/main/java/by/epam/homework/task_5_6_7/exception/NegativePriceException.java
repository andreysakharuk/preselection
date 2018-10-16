package by.epam.homework.task_5_6_7.exception;

public class NegativePriceException extends Exception {

// отлавливает ситуации , когда указана
    private String typeOfFlower;

    public NegativePriceException(String typeOfFlower){
        this.typeOfFlower = typeOfFlower;
    }

    public String getTypeOfFlower() {
        return typeOfFlower;
    }
}
