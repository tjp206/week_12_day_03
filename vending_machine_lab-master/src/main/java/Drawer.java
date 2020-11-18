import java.util.ArrayList;

public class Drawer {

    Code code;
    private double price;
    ArrayList<Product> products;

    public Drawer(Code code, double price) {
        this.code = code;
        this.price = price;
        products = new ArrayList<Product>();
    }

    public Code getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
    
    public String addProductToDrawer(Product product) {
        this.products.add(product);
        return product.getName();
    }
    
    
}
