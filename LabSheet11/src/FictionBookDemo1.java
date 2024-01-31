import java.util.*;
public class FictionBookDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input Title : ");
		String title = scan.nextLine();
		
		System.out.print("Input Year : ");
		int publicYear = scan.nextInt();
		scan.nextLine();
		FictionBook book = new FictionBook(title,publicYear);
		
		System.out.print("Input Name : ");
		String author_name = scan.nextLine();
		book.setAuthorName(author_name);
		while(book.checkFormatName()) {
			System.out.print("Input Name : ");
			author_name = scan.nextLine();
			book.setAuthorName(author_name);
		}
		
		System.out.print("Input Email : ");
		String email = scan.nextLine();
		book.setEmail(email);
		while(!book.checkEmail()) {
			System.out.print("Input Email : ");
			email = scan.nextLine();
			book.setEmail(email);
		}
		
		System.out.println(book);

	}

}
