package iterator;

public class DesktopStoreIterator implements Iterator{
	ComputerItem[] computerItems;
	int index = 0;
	public DesktopStoreIterator(ComputerItem[] computerItems) {
		this.computerItems = computerItems;
	}
	public boolean hasNext() {
		if(index >= computerItems.length || computerItems[index] == null ) {
			return false;
		}
		else {
			return true;
		}
	}
	public ComputerItem next() {
		ComputerItem computerItem = computerItems[index];
		index = index + 1;
		return computerItem;
	}
	
}
