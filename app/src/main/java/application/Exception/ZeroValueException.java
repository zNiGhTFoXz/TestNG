package application.Exception;

public class ZeroValueException extends Exception {
    private static final int DEFAULT_EXCEPTION_NUMBER = 15142;
    private static final String DEFAULT_DETAIL_MESSAGE = "Value can't be equal to '0'";

    private int number;

    public ZeroValueException(){
        super(DEFAULT_DETAIL_MESSAGE);
        this.number = DEFAULT_EXCEPTION_NUMBER;
    }

    public ZeroValueException(String message, int num){
        super(message);
        this.number = num;
    }

    public int getNumber(){
        return this.number;
    }
}
