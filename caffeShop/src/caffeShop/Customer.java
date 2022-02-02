package caffeShop;

public class Customer {
	
	String firstName;
	String lastName;
	String nationalId;
	int year;
	
	public Customer(String firstName, String lastName, String nationalId, int year) {
	 
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalId = nationalId;
		this.year = year;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalId() {
		return nationalId;
	}
	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
