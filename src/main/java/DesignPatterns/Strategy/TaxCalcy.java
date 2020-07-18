package DesignPatterns.Strategy;

import java.util.List;

public interface TaxCalcy {

    public double taxRate = 0.10;
    public double calculateTax(List<Product> products);




}
