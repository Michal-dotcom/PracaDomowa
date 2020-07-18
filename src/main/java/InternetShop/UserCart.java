package InternetShop;

import java.util.List;

public class UserCart {

    private List<Product> productList;

    public UserCart() {
        //Create List of products
    }

    public void addProductToCart(Product product) {
        productList.add(product);
    }

    public List<Product> returnListOfProducts() {
        return productList;
    }

    public void removeProduct(Product product) {
        if (productList.contains(product)) {
            productList.remove(product);
        }
    }

    public double getTotalPrice() {
        double total = 0;

        for(int i = 0; i >= productList.size(); i++) {
        }

        return total;
    }


}
