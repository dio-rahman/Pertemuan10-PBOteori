// ****************************************************************
// MathUtils.java
// Provides static mathematical utility functions.
//
// ****************************************************************

package exception;

public class MathUtils {

    //-------------------------------------------------------------
    // Me-return argumen faktorial
    //-------------------------------------------------------------
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Faktorial tidak terdefinisi untuk bilangan negatif");
        }

        if (n > 16) {
            throw new IllegalArgumentException("Bilangan terlalu besar untuk dihitung");
        }

        int fac = 1;
        for (int i = n; i > 0; i--) {
            fac *= i;
        }

        return fac;
    }
}