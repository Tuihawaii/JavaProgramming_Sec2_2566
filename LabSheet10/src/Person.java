
public class Person {
	//declare 2 private attrybutes
	private String firstName;
	private String lastName;
	
	//Default constructor
	//Initialize firstName and lastName
	Person(){
		firstName = "";
		lastName = "";
	}
	
	Person(String first, String last){
		//firstName = first;
		//lastName = last;
		setName(first,last);
	}
	
	public void setName(String first, String last) {
		firstName = first;
		lastName = last;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String toString() {
		return (firstName + " " + lastName);
	}
	
	

}
