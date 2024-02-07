import java.util.*;
import java.io.*;

public class Lab1202 {

	public static void main(String[] args) throws IOException {
		Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		Scanner input = new Scanner(System.in);
		System.out.print("Input Email : ");
		int emailInput = input.nextInt();
		boolean check = false;
		String tmp = "";
		while(readFile.hasNext()) {
			readFile.next();
			readFile.next();
			String password = readFile.next();
			String email = readFile.next().toUpperCase();
			
			if(email.equalsIgnoreCase(email)) 
			{
				System.out.print("Your password is : ");
				check = true;
				if(check) {
					break;
				}
			}
			
			else {
				check = false;
			}
		}
		
		if(check == false) {
			System.out.println("The data not found...");
		}
		readFile.close();
	}
	

}
