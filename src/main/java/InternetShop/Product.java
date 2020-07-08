package InternetShop;

public class Product {

    private double price;
    private String name;
    private boolean isDiscounted;
    private double tax;
    private int numberInStock;
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public Product() { }

    public Product(double price, String name, boolean isDiscounted, double tax, int numberInStock) {
        this.price = price;
        this.name = name;
        this.isDiscounted = isDiscounted;
        this.tax = tax;
        this.numberInStock = numberInStock;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDiscounted() {
        return isDiscounted;
    }

    public void setDiscounted(boolean discounted) {
        isDiscounted = discounted;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public int getNumberInStock() {
        return numberInStock;
    }

    public void setNumberInStock(int numberInStock) {
        this.numberInStock = numberInStock;
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
