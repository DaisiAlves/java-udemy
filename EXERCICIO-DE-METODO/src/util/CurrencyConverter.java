package util;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double ValueInReal(double dollar, double quantity) {
        return quantity * dollar * (1.0 + IOF);
    }
}
   

