public class Product 
{	
	private String name;
	private String brand;
	private int price;
	public Product(String name, String brand, int price) 
	{
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	public String toString() {
		return "Product [name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	
}
