package ht;
/*
 * N00803604
 * Kevin Perez
 */
public class Person {
	// will need instance vars for first name, last name, email
		// gets and sets for all, param constructor methods as well
		
	private String first_Name,email;
	private LastName last_Name;
	
	public Person(String first_Name, LastName last_Name, String email){
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.email = email;
		
	}
	
	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public LastName getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(LastName last_Name) {
		this.last_Name = last_Name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	// will need a hashcode method which gets called from put and get in hashtable
	// return the hashcode of last name, use the alogrithm discussed in class
	public int hashcode(){
		
		return last_Name.hashcode();
	}
	

}
