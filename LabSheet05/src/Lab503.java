import java.util.*;
public class Lab503 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Message : ");
		String message = scan.nextLine();
		String word = message.toLowerCase();

		if(word.indexOf("nichi")>=0) 
		{
			System.out.print("Nichi is a sentence");
		}
		else 
		{
			System.out.print(message);
		}
	}

}
