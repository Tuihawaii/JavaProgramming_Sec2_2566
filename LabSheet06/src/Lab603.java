import java.util.*;
public class Lab603 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space.\n:");
		String fullName = scan.nextLine();	
		int result = fullName.indexOf(' ');
		String firstName = fullName.substring(0,result);
		System.out.print(abbreviatName(fullName).toUpperCase()+firstName);
	}
	
	public static String abbreviatName(String fullName) 
	{
		String charName = "";
		for(int i=0 ; i < fullName.length(); i++) 
		{
			if(fullName.charAt(i)== ' ') 
			{
				charName = charName+fullName.charAt(i+1) + ".";
			}
		}
		return charName;
	}

}
