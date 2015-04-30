package module2.ass3;

public class StockItemStore {

	private static StockItem[] stockItems = new StockItem[5];

	static {
		System.out.println("\nInventory is loaded\n");
		loadStockItems();
	}
	
	public static void loadStockItems() {
		StockItem stockItem1 = new StockItem(1, "apple", "Must eat apple", 20, 50);
		StockItem stockItem2 = new StockItem(2, "milk", "Must take milk", 20,20);
		StockItem stockItem3 = new StockItem(3, "chicken", "Must eat chicken",20, 250);
		StockItem stockItem4 = new StockItem(4, "eggs", "Must eat eggs", 20, 10);
		StockItem stockItem5 = new StockItem(5, "orange", "Must eat orange",20, 40);

		stockItems[0] = stockItem1;
		stockItems[1] = stockItem2;
		stockItems[2] = stockItem3;
		stockItems[3] = stockItem4;
		stockItems[4] = stockItem5;
	}

	public StockItem[] getStockItems() {
		return stockItems;
	}

	public void printStockItemStoreInformation() {
		for (StockItem stockItem : stockItems) {
			System.out.println(stockItem);
		}
	}

}
