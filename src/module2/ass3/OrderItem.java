package module2.ass3;

public class OrderItem {
	
	private  int numberOfItems = 0;

	public  StockItem[] orderedItems = new StockItem[5];

	public void orderStockItem(StockItem stockItem) {

		StockItemStore stockItemStore = new StockItemStore();

		for (StockItem tempStockItem : stockItemStore.getStockItems()) {

			if (tempStockItem.getItemName().equals(stockItem.getItemName())) {

				// Check if it available or not. IF available decrease the quantity of itemStore.
				if (tempStockItem.getQuantity() > 0) {
					stockItem.setPrice(tempStockItem.getPrice());
					orderedItems[numberOfItems++] = stockItem;
					tempStockItem.setQuantity(tempStockItem.getQuantity() - stockItem.getQuantity());
					break;
				}
			}
		}

	}

	public double getTotal() {
		double total = 0.0;
		for (StockItem stockItem : orderedItems) {
			if(stockItem != null)
			total += (stockItem.getPrice() * stockItem.getQuantity());
		}
		return total;
	}

	public int getNumOfItems() {
		return numberOfItems;
	}

	public StockItem[] getOrderedItems() {
		return orderedItems;
	}

}
