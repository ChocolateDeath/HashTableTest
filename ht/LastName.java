package ht;

public class LastName {
	private String lastName;
	
	public LastName(String lastName){
		this.lastName = lastName;
	}
	public LastName(){
		lastName = "Doe";
	}
	public String getLastName(){
		return lastName;
	}
	public int hashcode(){
		int sum=0;
		for(int i=0;i<lastName.length();i++)
			sum += (lastName.charAt(i) + Math.pow(31, (i+1)));
		sum += lastName.charAt(lastName.length()-1);
		return Math.abs(sum);
	}
}
