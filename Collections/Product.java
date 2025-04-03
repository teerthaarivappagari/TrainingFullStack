import java.util.*;

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{ID=" + id + ", Name='" + name + "', Price=" + price + "}";
    }
}

class PriceComparator implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.getPrice(), p2.getPrice());
    }
}

public class ECommerceCatalog {
    public static void main(String[] args) {
        HashSet<Product> productSet = new HashSet<>();
        productSet.add(new Product(101, "Laptop", 1200.99));
        productSet.add(new Product(102, "Smartphone", 699.49));
        productSet.add(new Product(103, "Headphones", 149.99));

        System.out.println("Product List (HashSet):");
        for (Product product : productSet) {
            System.out.println(product);
        }

        TreeMap<Product, Integer> sortedProductCatalog = new TreeMap<>(new PriceComparator());
        sortedProductCatalog.put(new Product(101, "Laptop", 1200.99), 10);
        sortedProductCatalog.put(new Product(102, "Smartphone", 699.49), 20);
        sortedProductCatalog.put(new Product(103, "Headphones", 149.99), 30);

        System.out.println("\nSorted Product Catalog (TreeMap - Sorted by Price):");
        for (Map.Entry<Product, Integer> entry : sortedProductCatalog.entrySet()) {
            System.out.println(entry.getKey() + " - Stock: " + entry.getValue());
        }
    }
}
