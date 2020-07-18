package DesignPatterns.Strategy;

import java.util.List;

public interface TaxCalcyUSA {

    public double americanTax = 0.06;

    double calculateAmericanTax(List<Product> products);
}
