import java.util.*;
class ProductPriceComparison implements Comparable<ProductPriceComparison> {
     String name; 
     double price;

    ProductPriceComparison(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    @Override
    public int compareTo(ProductPriceComparison p) {
        return Double.compare(this.price, p.price);
    }
    
    public static void main(String[] args) {
        List<ProductPriceComparison> products = new ArrayList<>();
        products.add(new ProductPriceComparison("Laptop", 50000));
        products.add(new ProductPriceComparison("Tablet", 30000));
        products.add(new ProductPriceComparison("Smartphone", 20000));
        
        Collections.sort(products);
        System.out.println("Cheapest product: " + products.get(0).name);
        System.out.println("Expensive product: " + products.get(products.size()-1).name);
    }
    
    }
    