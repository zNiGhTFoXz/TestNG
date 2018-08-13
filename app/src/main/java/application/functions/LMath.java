package application.functions;

import application.exception.ZeroValueException;

public final class LMath {

    public static double hyperbola(long x) throws ZeroValueException {
        if(x == 0){
            throw new ZeroValueException();
        }
        return 1.0 / x;
    }
}
