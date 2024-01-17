import java.util.*;
public class BookDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Book b1 = new Book();
		System.out.println(b1);
		
		System.out.print("Input book title    : ");
		String title = scan.next();
		System.out.print("Input book price    : ");
		float price = scan.nextFloat();
		System.out.print("Input public year   : ");
		int year = scan.nextInt();
		
		b1.setTitle(title);
		b1.setPrice(price);
		b1.setPublishyear(year);
		
		System.out.println();
		System.out.println(b1);

	}

}
