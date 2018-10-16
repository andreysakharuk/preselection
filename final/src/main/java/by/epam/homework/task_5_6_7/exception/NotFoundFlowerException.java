package by.epam.homework.task_5_6_7.exception;


public class NotFoundFlowerException extends Exception{

    private String matcher;

    public NotFoundFlowerException(String matcher){
        this.matcher = matcher;
    }

    public String getMatcher() {
        return matcher;
    }
}
