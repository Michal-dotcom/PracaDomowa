package DesignPatterns.Strategy;

public class Product {

    private String productName;
    private double productPrice;
    private String[] countries = {"Poland", "USA"};

    public Product() {
    }

    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    private String getCountry(String string) {
        String country = "";
        if (string.equalsIgnoreCase(countries[0])) {
            country = "Poland";
        }
        country = "USA";
        return country;

    }

}
