import java.text.DecimalFormat;
import java.util.*;
public class SalespersonSalary {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner scan = new Scanner(System.in);
		// Declare constants
		final double COMMISSION_RATE = 0.15;
		final int SENTINEL = -1; // Terminating value for input
		// Declare variables
		int sales; // Input gross sales double salary; // Salary to be computed
		double salary;
		
		while(true) 
		{
			System.out.print("Enter sales in dollar (or -1 to end): ");
			sales = scan.nextInt();
			salary = 1000+(sales*COMMISSION_RATE);
			System.out.print("Salary is: " + frm.format(salary) + "\n");
			if(sales==SENTINEL) 
			{
				System.out.print("bye");
				break;
			}
		}
	}

}
