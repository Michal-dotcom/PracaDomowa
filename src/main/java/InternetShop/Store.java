package InternetShop;

import java.util.List;

public class Store {

    private List<Product> productList;

    public void Product() {

    }


    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(Product product) {
        productList.remove(product);
    }

    public int getProductQuantity(String productName) {
        int quantity = 0;
        for (int i = 0; i <= productList.size(); i++) {
            quantity++;
            if (!productList.contains(productName)) {
                return -1;
            }
        }
        return quantity;
    }

    public List<Product> getProductList() {
        return productList;
    }
}
