package module4.ass1;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contact {

	public Contact() {
	}

	public Contact(String firstName, String middleName, String lastName,
			String state, String city, String pincode, Date dob,
			String emailId, Gender gender, String telNumber, String phoneNumber) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
		this.dob = dob;
		this.emailId = emailId;
		this.gender = gender;
		this.telNumber = telNumber;
		this.phoneNumber = phoneNumber;
	}

	private String firstName;
	private String middleName;
	private String lastName;

	private String state;
	private String city;
	private String pincode;
	private Date dob;
	private String emailId;
	private Gender gender;
	private String telNumber;
	private String phoneNumber;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	enum Gender {
		MALE, FEMALE
	};

	public void validate() {
		if (getFirstName() == null || getFirstName().length() <= 0) {
			throw new ValidationException("First Name Should not Empty.");
		} else if (getLastName() == null || getLastName().length() <= 0) {
			throw new ValidationException("Last Name Should not Empty.");
		} else if (getDob() == null) {
			throw new ValidationException("Birth Date Should not Empty.");
		} else if (!((telNumber != null && phoneNumber != null) || (telNumber == null && phoneNumber != null) || (telNumber != null && phoneNumber == null))){
				throw new ValidationException("Please Provide the Either Telephone and Phone Number");		
		}else {
			validateEmail();
		}

	}

	private void validateEmail() {
		if (getEmailId() == null || getEmailId().length() <= 0)
			throw new ValidationException("Email Id Should not Empty.");
		else {
			if(!validateEmailId())
				throw new ValidationException("Email Id is not in proper format. ");
		}
	}

	private boolean validateEmailId() {

		final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		Matcher matcher = pattern.matcher(getEmailId());
		return matcher.matches();

	}

}
