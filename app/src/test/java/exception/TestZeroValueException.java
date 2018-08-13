package exception;

import application.exception.ZeroValueException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestZeroValueException {
    private ZeroValueException exception;

    @BeforeClass
    public void setUp(){
        this.exception = new ZeroValueException();
    }

    /*
     * Check that the default number value has not changed
     */
    @Parameters({"number"})
    @Test(groups = {"exception"})
    public void testExceptionNumberValue(int number){
        Assert.assertEquals(this.exception.getNumber(), number);
    }

    /*
     * Check that the default message value has not changed
     */
    @Parameters({"message"})
    @Test(groups = {"exception"})
    public void testExceptionMessageValue(String message){
        Assert.assertEquals(this.exception.getMessage(), message);
    }
}
