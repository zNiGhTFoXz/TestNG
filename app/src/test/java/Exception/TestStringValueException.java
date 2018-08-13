package Exception;

import application.Exception.StringValueException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestStringValueException {
    private StringValueException exception;
    private int expectedNumber;
    private String expectedMessage;

    @BeforeClass
    public void setUp(){
        this.exception = new StringValueException();
        this.expectedNumber = 15143;
        this.expectedMessage = "None Integer value!";
    }

    /*
     * Check that the default number value has not changed
     */
    @Test(groups = {"exception"})
    public void testExceptionNumberValue(){
        Assert.assertEquals(this.exception.getNumber(), this.expectedNumber);
    }

    /*
     * Check that the default message value has not changed
     */
    @Test(groups = {"exception"})
    public void testExceptionMessageValue(){
        Assert.assertEquals(this.exception.getMessage(), this.expectedMessage);
    }
}
