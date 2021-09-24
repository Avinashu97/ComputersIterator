package iterator;

public class StoreKeeper {
	Computer laptopStore = new LaptopStore();
	Computer desktopStore = new DesktopStore();
	
	public StoreKeeper(Computer laptopStore, Computer desktopStore ) {
		this.laptopStore = laptopStore;
		this.desktopStore = desktopStore;
	}
	public void printComputers() {
		
		Iterator latopStoreIterator = laptopStore.createIterator();
		Iterator desktopStoreIterator = desktopStore.createIterator();
		System.out.println("\n -------- Laptop Store ---------\n ");
		printComputers(latopStoreIterator);
		System.out.println("\n -------- Desktop Store ---------\n ");
		printComputers(desktopStoreIterator);
		
	}
	public void printComputers(Iterator iterator) {
		while(iterator.hasNext()) {
			ComputerItem computerItem = iterator.next();
			System.out.print(computerItem.getName() + ", ");
			System.out.print(computerItem.getDescription() + ", ");
			System.out.println(computerItem.getPrice());
		}
	}
}
