package productt;
	import jakarta.persistence.*;
	import org.hibernate.annotations.Cache;
	import org.hibernate.annotations.CacheConcurrencyStrategy;
	@Entity

	@Cacheable

	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE,region = "productCache")

	public class Product {

	    @Id

	    @GeneratedValue(strategy = GenerationType.IDENTITY)

	    private Long id;
	 
	    private String name;

	    private double price;
	 
	    public Product() {}

	    public Product(String name, double price) {

	        this.name = name;

	        this.price = price;

	    }
	 
	    public Long getId() { return id; }

	    public String getName() { return name; }

	    public void setName(String name) { this.name = name; }

	    public double getPrice() { return price; }

	    public void setPrice(double price) { this.price = price; }

	}
