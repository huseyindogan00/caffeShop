package gameStoreProject;

public class Gamer {
	int gamerId;
	String firstName;
	String lastName;
	String nationalId;
	int dateOfBirthYear;  
	
	public Gamer(int gamerId, String firstName, String lastName, String nationalId, int dateOfBirthYear) { 
		this.gamerId = gamerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalId = nationalId;
		this.dateOfBirthYear = dateOfBirthYear;
	}
	
	public int getGamerId() {
		return gamerId;
	}
	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
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
	public int getDateOfBirthYear() {
		return dateOfBirthYear;
	}
	public void setDateOfBirthYear(int dateOfBirthYear) {
		this.dateOfBirthYear = dateOfBirthYear;
	}
}
