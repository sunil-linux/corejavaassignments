package module2.ass3;

public class InventoryTest {

	public static void main(String[] args) {
		
		//1.Create the three customers
		Customer customer1 = new Customer(1, "Jammie");
		Customer customer2 = new Customer(2, "Bill");
		Customer customer3 = new Customer(3, "JOe");
		
		//2. This class holds the list of stockItems ( Inventory )
		StockItemStore store = new StockItemStore();
		
		System.out.println("************ Inventory Status Before Purchase Order *********************\n");
		store.printStockItemStoreInformation();
		System.out.println("\n**************************************************************************\n");
		
				
		//3.Create three purchase orders	
		PurchaseOrder[] purchaseOrders1 = new PurchaseOrder[2];
		for(int i = 0; i< purchaseOrders1.length;i++)
			purchaseOrders1[i] = new PurchaseOrder();
		
		StockItem[] firstOrder = new StockItem[3];
		firstOrder[0] = new StockItem("chicken",2);
		firstOrder[1] = new StockItem("milk",2);
		firstOrder[2] = new StockItem("eggs",12);
		
		StockItem[] secondOrder = new StockItem[2];
		secondOrder[0] = new StockItem("apple",5);
		secondOrder[1] = new StockItem("orange",10);
				
		purchaseOrders1[0].setStockItems(firstOrder);
		purchaseOrders1[1].setStockItems(secondOrder);
				
		customer1.setPurchaseOrders(purchaseOrders1);
		

		PurchaseOrder[] purchaseOrder2 = new PurchaseOrder[1];
		
		StockItem[] thirdOrder = new StockItem[2];
		thirdOrder[0] = new StockItem("chicken",5);
		thirdOrder[1] = new StockItem("apple",10);
		
		purchaseOrder2[0] = new PurchaseOrder();
		purchaseOrder2[0].setStockItems(thirdOrder);
		
		customer2.setPurchaseOrders(purchaseOrder2);
		
		
		//4. place the orders of customers.
		customer1.placeOrder();
		customer2.placeOrder();
		
		
		//5.  Print Invoice of Each Customer & Total Invoice.
		
		System.out.println("Cust Name :"+customer1.getName());
		System.out.println("*********************************************************");
		
		double  total = 0;
		double totalSale = 0;
		for(PurchaseOrder po : customer1.getPurchaseOrders()){
			
			System.out.println("Order No : "+po.getPoNumber()+"\t"+"Order Date: "+po.getOrderedDate());
			
			for(StockItem stockItem : po.getStockItems()) {
				System.out.println("Item :"+stockItem.getItemName()+"\t"+"Qty :"+stockItem.getQuantity()+"\t"+"Price :"+stockItem.getPrice());	
			}
			System.out.println("\nTotal :"+po.getSumOfItems()+" Rs.");
			total += po.getSumOfItems();
			System.out.println("---------------------------------------------------------------");			
		}
		
		totalSale += total;	
		System.out.println("Total Sale By "+customer1.getName()+" is:"+total+" Rs.");		
		System.out.println("\n********************************************************");
		
		
		
		
		
		
		
		System.out.println("\nCust Name :"+customer2.getName());
		System.out.println("******************************************************");
				
		total = 0;
		for(PurchaseOrder po : customer2.getPurchaseOrders()){
			
			System.out.println("Order No : "+po.getPoNumber()+"\t"+"Order Date: "+po.getOrderedDate());
			
			for(StockItem stockItem : po.getStockItems()) {
				System.out.println("Item :"+stockItem.getItemName()+"\t"+"Qty :"+stockItem.getQuantity()+"\t"+"Price :"+stockItem.getPrice());	
			}
			System.out.println("\nTotal :"+po.getSumOfItems()+" Rs.");
			total += po.getSumOfItems();
			System.out.println("---------------------------------------------------------------");			
		}
		
		totalSale += total;
		System.out.println("Total Sale By "+customer2.getName()+" is:"+total+" Rs.");	
		System.out.println("\n********************************************************");
		
		System.out.println("\nTotal Overall Sale :"+totalSale);
		
		
		System.out.println("\n************ Inventory Status After Purchase Order *********************\n");
		store.printStockItemStoreInformation();
		System.out.println("\n**************************************************************************\n");
	}
}
