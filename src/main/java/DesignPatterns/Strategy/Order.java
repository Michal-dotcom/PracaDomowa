package DesignPatterns.Strategy;

import java.util.List;

public class Order implements TaxCalcy, TaxCalcyUSA {

    private int orderID;
    private String orderAddress;
    private List<Product> listOfProducts;
    private TaxCalcy baseTax;
    private TaxCalcyUSA usTax;

    public Order(int orderID, String orderAddress, List<Product> listOfProducts) {
        this.orderID = orderID;
        this.orderAddress = orderAddress;
        this.listOfProducts = listOfProducts;
    }

    @Override
    public double calculateTax(List<Product> products) {
        double taxTotal = 0;
        for (Product product : listOfProducts) {
            taxTotal += product.getProductPrice() * TaxCalcy.taxRate;
        }
        return taxTotal;
    }


    @Override
    public double calculateAmericanTax(List<Product> products) {
        double taxTotal = 0;
        for (Product product : listOfProducts) {
            taxTotal += product.getProductPrice() * TaxCalcyUSA.americanTax;
        }
        return taxTotal;
    }
}
