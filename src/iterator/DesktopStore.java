package iterator;

public class DesktopStore implements Computer{
	ComputerItem[] computerItems;
	static final int MAX_ITEMS = 20;
	int index = 0;
	
	public DesktopStore() {
		computerItems = new ComputerItem[MAX_ITEMS];
		addComputer("Surface Studio 2 ", "A windows powered all in one that seals the deal for artists with its abilitity to tilt the 28;' ", 30000);
		addComputer("Hp Envy 32 ", "It has ninth-gen intel cpu and a gigantic 32 inch 4K display powered by Nvidia GTX 1650", 20000);
		addComputer("Mac Mini M1 ", "This is Apple's smallest desktop computer contains m1 chip and has good speed in terms of perfomance ", 1000);

	}
	private void addComputer(String name, String description, double price) {
		ComputerItem computerItem = new ComputerItem(name , description, price );
		if(index >= computerItems.length ) {
			System.err.println("Cannot add more computers to the store");
		}
		else {
			computerItems[index] = computerItem;
			index = index + 1;
		}
	}
	public String toString() {
		return "Desktop computer Store";
	}
	public Iterator createIterator() {
		return new DesktopStoreIterator(computerItems);
	}
}
