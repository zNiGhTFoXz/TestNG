package application.exception;

import java.util.InputMismatchException;

public class StringValueException extends InputMismatchException {
    private static final int DEFAULT_EXCEPTION_NUMBER = 15143;
    private static final String DEFAULT_DETAIL_MESSAGE = "None Integer value!";

    private int number;

    public StringValueException(){
        super(DEFAULT_DETAIL_MESSAGE);
        this.number = DEFAULT_EXCEPTION_NUMBER;
    }

    public StringValueException(String message, int num){
        super(message);
        this.number = num;
    }

    public int getNumber(){
        return this.number;
    }
}
