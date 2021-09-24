package iterator;
import java.util.*;
public class LaptopStore implements Computer {
	List <ComputerItem> computerItems;
	public LaptopStore() {
		computerItems = new ArrayList<ComputerItem>();
		addComputer("Razer Blade Pro 17" , "The Blade Pro is fast and provides powerful gaming performance with an Intel Core i7 processor and Nvidia GeForce RTX 30-series graphics,  " , 2600);
		addComputer("Hp Envy x360" , "makes a great pick for an older high-school or college student -- or anyone looking for a small, stylish and easy-to-travel-with two-in-one. " , 2000);
		addComputer("Asus ZenBook Duo" , "Comes with duos tilt-up second screen can act as auxiliary display " , 1600);
		
	}
	private void addComputer(String name, String description , double price ) {
		ComputerItem computerItem = new ComputerItem(name, description , price );
		computerItems.add(computerItem);
	}
	public List<ComputerItem> getComputers(){
		return computerItems;
	}
	public Iterator createIterator() {
		return new LaptopStoreIterator(computerItems);
	}
	public String toString() {
		return "Laptop Computers";
	}
	
}
