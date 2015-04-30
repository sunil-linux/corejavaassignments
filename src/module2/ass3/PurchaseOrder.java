package module2.ass3;

import java.util.Date;
import java.util.Random;

public class PurchaseOrder {

	// can be generated randomly
	private int poNumber;

	private Date orderedDate;

	private Date shippingDate;

	private boolean isShipped = false;

	private StockItem[] stockItems;

	private OrderItem orderItem = new OrderItem();

	public int placeOrder() {

		for (StockItem stockItem : stockItems) {
			if (stockItem != null)
				orderItem.orderStockItem(stockItem);		
		}

		int poNumber = (new Random().nextInt() / 1000);

		createOrder(poNumber, new Date());

		return poNumber;

	}

	private void createOrder(int poNumber, Date orderDate) {
		this.poNumber = poNumber;
		this.orderedDate = orderDate;
	}

	public  void printOrderDetails() {
		System.out.println("***** Order Details **********\n");
		System.out.print(" Order No: " + poNumber);
		System.out.print("\tOrderDate : " + orderedDate.getDate());
		System.out.println("\tIs Shipped : " + isShipped);
	}

	public boolean isShipped() {
		return isShipped;
	}

	public void setShipped(boolean isShipped) {
		this.isShipped = isShipped;
	}

	public void setPoNumber(int poNumber) {
		this.poNumber = poNumber;
	}

	public void setOrderedDate(Date orderedDate) {
		this.orderedDate = orderedDate;
	}

	public int getPoNumber() {
		return poNumber;
	}

	public String getOrderedDate() {
		return orderedDate.toLocaleString();
	}

	public Date getShippingDate() {
		return shippingDate;
	}

	public void setShippingDate(Date shippingDate) {
		this.shippingDate = shippingDate;
	}

	public OrderItem getOrderItems() {
		return orderItem;
	}

	public double getSumOfItems() {
		return orderItem.getTotal();
	}

	public StockItem[] getStockItems() {
		return stockItems;
	}

	public void setStockItems(StockItem[] stockItems) {
		this.stockItems = stockItems;
	}
}
