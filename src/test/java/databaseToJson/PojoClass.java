package databaseToJson;

public class PojoClass {

	//create variables with column names of the table
	//eg. table Customer, columns : Name, Address, PhNumber, Email
	
	String Name;
	String Address;
	Integer PhNumber;
	String Email;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Integer getPhNumber() {
		return PhNumber;
	}
	public void setPhNumber(Integer phNumber) {
		PhNumber = phNumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	
	
	

}
