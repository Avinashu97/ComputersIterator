package iterator;
import java.util.*;
public class LaptopStoreIterator implements Iterator{
	List<ComputerItem> computerItems;
	int index = 0;
	
	public LaptopStoreIterator( List<ComputerItem> computerItems ) {
		this.computerItems = computerItems;
	}
	public boolean hasNext() {
		if(index >= computerItems.size()) {
			return false;
		}
		else {
			return true;
		}
	}
	public ComputerItem next() {
		ComputerItem computerItem = computerItems.get(index);
		index = index + 1;
		return computerItem;
	}
	
	
}
