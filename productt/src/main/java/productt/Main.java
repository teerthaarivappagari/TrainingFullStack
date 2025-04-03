package productt;

public class Main {

	public static void main(String[] args) {
		ProductService productService = new ProductService();
		 
        // Adding Products
        productService.addProduct("Laptop", 999.99);
        productService.addProduct("Smartphone", 499.99);

        // Fetch Product (First time - DB Hit)
        System.out.println("Fetching product for the first time...");
        Product p1 = productService.getProductById(1L);
        System.out.println("Product Name: " + p1.getName());

        // Fetch Product Again (Should be from Cache)
        System.out.println("Fetching product for the second time...");
        Product p2 = productService.getProductById(1L);
        System.out.println("Product Name: " + p2.getName());
        

	}

}