package iterator;

public class ComputerItem {
	String name;
	String description;
	double price;
	
	public ComputerItem( String name, String description , double price ) {
		this.name = name;
		this.description = description;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public double getPrice() {
		return price;
	}
	public String toString() {
		return (name + " , " + description + " , " + price);
	}
}
