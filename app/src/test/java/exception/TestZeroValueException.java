package exception;

import application.exception.ZeroValueException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestZeroValueException {
    private ZeroValueException exception;
    private int expectedNumber;
    private String expectedMessage;

    @BeforeClass
    public void setUp(){
        this.exception = new ZeroValueException();
        this.expectedNumber = 15142;
        this.expectedMessage = "Value can't be equal to '0'";
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
