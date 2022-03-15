package Program;

import entities.Product;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<Product,Double> stock = new HashMap<>();

        Product p1 = new Product("TV", 900.0);
        Product p2 = new Product("Notebook", 10000.0);
        Product p3 = new Product("Microondas", 150.0);

        stock.put(p1, 1000.0);
        stock.put(p2, 1000.0);
        stock.put(p3, 300.0);
        for(Product p : stock.keySet()){
            System.out.println(p + "; Quantities in stock: " + stock.get(p));
        }
    }
}
