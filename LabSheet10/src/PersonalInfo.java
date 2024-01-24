
public class PersonalInfo {
	private Person name; //object name reference class Person
	private Date bDay;   //object bDay reference class Date
	private int personID;
	
	//Default constructor
	//Postcondition: firstName="" , lastName=""
	//dMonth=1, dDay=1, dYear=1990
	//personID = 0
	PersonalInfo(){
		name = new Person();
		bDay = new Date();
		personID = 0;
	}
	
	PersonalInfo(String first, String last,int month, int day, int year, int ID){
		name = new Person(first,last); //firstName=first lastName=last
		bDay = new Date(month,day,year);
		personID = ID;
	}
	
	//call set method from classPerson
	public void setPersonalInfo(String first, String last,int month, int day, int year, int ID) {
		name.setName(first, last);
		bDay.setDate(month, day, year);
		personID = ID;
	}
	
	public String toString() {
		return "Name: " + name.toString() + "\n" + "Date of birth: " + bDay.toString() + "\n" + "Personal ID: " + personID;
	}
}
