package module4.ass1;

import java.util.Date;

import module4.ass1.Contact.Gender;

public class ContactTest {

	public static void main(String[] args) {
		
		Contact contact = new Contact("sunil", "Maruti", "patil", "MH", "Pune", "411033", new Date(), "sunilgmail.com", Gender.MALE, "8055812181",null);
		contact.validate();
	}
}
