package iterator;

public class ComputersIterator {

	public static void main(String[] args) {
		Computer laptop = new LaptopStore();
		Computer desktop = new DesktopStore();
		
		StoreKeeper storeKeeper = new StoreKeeper( laptop, desktop );
		
		storeKeeper.printComputers();
		
		

	}

}
