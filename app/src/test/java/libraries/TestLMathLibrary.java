package libraries;

import application.exception.ZeroValueException;
import application.functions.LMath;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestLMathLibrary {

    @DataProvider(name = "integerProvider")
    public static Object[][] integerProvider() {
        /*{denominator, expected}*/
        return new Object[][] {
                { 1, 1.0 },
                { -1, -1.0},
                { 3, 0.3333333333333333},
                { 999999, 1.000001000001e-6},
                { 999999999, 1.000000001e-9},
                {-999999999, -1.000000001e-9},
                {0.3, 3.3333333333333335},
                {0.9712381, 1.0296136446871267}
        };
    }

    @Test(dataProvider = "integerProvider")
    public void testDevideByAnInteger(double denominator, double expected) throws ZeroValueException {
        Assert.assertEquals(LMath.hyperbola(denominator), expected);
    }

    @Test(expectedExceptions = ZeroValueException.class)
    public void testDevideByAZero() throws ZeroValueException{
        LMath.hyperbola(0);
    }
}
