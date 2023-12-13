import java.util.*;
public class Lab501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full name: ");
		String fullName = scan.nextLine();
		int Name = fullName.indexOf(' ');
		
		if(Name == -1) 
		{
			System.out.print("Incorrect name");
		}
		else 
		{
			String firstName = fullName.substring(0,Name);
			String lastName = fullName.substring(Name);
			System.out.println("First Name: "+firstName.toUpperCase());
			System.out.println("Last Name: "+lastName);
		}

	}

}
