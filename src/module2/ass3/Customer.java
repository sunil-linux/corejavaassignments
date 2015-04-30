package module2.ass3;

public class Customer {

	private int id;
	private String name;
	private String homePhone;
	private String cellPhone;
	private String officePhone;
	private Address address;
	private PurchaseOrder[] purchaseOrders;
	
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void setPhoneNumbers(String cellPhone, String homePhone,
			String officePhone) {
		this.cellPhone = cellPhone;
		this.homePhone = homePhone;
		this.officePhone = officePhone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void printShippingAddress() {
		System.out.println(address);
	}
	
	public void printPhoneNumbers(){
		System.out.println("Home:"+homePhone+",Office:"+officePhone+",Cell:"+cellPhone);
	}
	public PurchaseOrder[] getPurchaseOrders() {
		return purchaseOrders;
	}

	public void setPurchaseOrders(PurchaseOrder[] purchaseOrders) {
		this.purchaseOrders = purchaseOrders;
	}
	
	public void placeOrder()
	{		
		for(PurchaseOrder purchaseOrder : purchaseOrders) {
			purchaseOrder.placeOrder();
		}
	}

}
