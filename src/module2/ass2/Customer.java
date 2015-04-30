package module2.ass2;

public class Customer {

	private int id;
	private String name;
	private String homePhone;
	private String cellPhone;
	private String officePhone;
	private Address address;

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

	public void setAddress(Address address) {
		this.address = address;
	}

	public void printShippingAddress() {
		System.out.println(address);
	}
	
	public void printPhoneNumbers()
	{
		System.out.println("Home:"+homePhone+",Office:"+officePhone+",Cell:"+cellPhone);
	}
	

}
