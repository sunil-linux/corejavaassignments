package module2.ass3;

public class StockItem {

	private int itemNo;
	private String itemName;
	private String description;
	private int qty;
	private double price;

	public StockItem() {
	}

	public StockItem(String itemName, int qty) {
		super();		
		this.itemName = itemName;
		this.qty = qty;
	}
	
	public StockItem(int itemNo, String itemName, String description, int qty,
			double price) {
		super();
		this.itemNo = itemNo;
		this.itemName = itemName;
		this.description = description;
		this.qty = qty;
		this.price = price;
	}

	public int getItemNo() {
		return itemNo;
	}

	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	public int getQuantity() {
		return qty;
	}

	public void setQuantity(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("StockItem : [itemNo :" + itemNo);
		sb.append(", itemName :" + itemName);
		sb.append(", Qty : " + qty);
		sb.append(", Price : " + price+" ]");
		return sb.toString();
	}
	

}
