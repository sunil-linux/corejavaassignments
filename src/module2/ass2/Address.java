package module2.ass2;

public class Address {

	private String street;
	private String city;
	private String state;
	private String zip;

	public Address(String street, String city, String state, String zip) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Address : [street :" + street);
		sb.append(", city :" + city);
		sb.append(", state : " + state);
		sb.append(", zip : " + zip);
		return sb.toString();
	}

}
