package application;

import application.exception.StringValueException;
import application.exception.ZeroValueException;
import application.functions.LMath;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    private final String MESSAGE_ENTER_VALUE = "Please enter 'x' value: ";
    private final String MESSAGE_RESULT_TEMPLATE = "Result: %f";

    public void run(){
        while(true){
            System.out.println(MESSAGE_ENTER_VALUE);
            try {
                System.out.format(MESSAGE_RESULT_TEMPLATE, LMath.hyperbola(consoleReader()));
                break;
            }catch (ZeroValueException|StringValueException ex){
                System.out.println(ex.getMessage());
            }catch (Exception ex){
                ex.printStackTrace();
                break;
            }
        }
    }

    private long consoleReader() throws StringValueException {
        Scanner in = new Scanner(System.in);
        try {
            return in.nextLong();
        }catch (InputMismatchException exp){
            throw new StringValueException();
        }
    }
}
