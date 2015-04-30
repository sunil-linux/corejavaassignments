package module2.ass2;

public class CustomerTest {

	public static void main(String[] args) {
	
		
		final int N = 3;
		
		Customer[] customers = new Customer[N];
		
		for(int i = 0; i < N; i++) {		
			customers[i] = new Customer(i, "Customer "+i);
			customers[i].setPhoneNumbers("9011234567", "02056789900", "02056789012");
			Address address = new Address("street"+i, "city"+i, "state"+i, "41334"+i);
			customers[i].setAddress(address);
		}
		
		//Display customer details
		for(int i = 0; i < N; i++) {		
			customers[i].printPhoneNumbers();
			customers[i].printShippingAddress();
			System.out.println("\n\n");
		}
		
	}

}
