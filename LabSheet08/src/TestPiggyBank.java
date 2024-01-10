import java.util.*;
public class TestPiggyBank {
	
	static PiggyBank pb = new PiggyBank();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		/*pb.setPiggyBank(500);
		System.out.println("Money Total : "+pb.getTotal());
		pb.addTwo (34);
		System.out.println("Add 2 Bath Money : "+34);
		System.out.println("Money Total : "+pb.getTotal());
		pb.addTen (13);
		System.out.println("Add 10 Bath Money : "+13);
		System.out.println("Money Total : "+pb.getTotal());
		pb.addFive (100);*/
		inputCoin();
	}
	
	public static void inputCoin() {
		System.out.println("Money Total : " + pb.getTotal());
		System.out.print("Please define size of PiggyBank: ");
		int sizeofPiggyBank = scan.nextInt();
		pb.setPiggyBank(sizeofPiggyBank);
		System.out.println("Money Total : " + pb.getPiggyBank());
		MainMenu();
	}
	
	public static void MainMenu() {
		
		while(true) 
		{
			System.out.println("===========================");
			System.out.println("Menu of PiggyBank");
			System.out.println("===========================");
			
			System.out.println("[1] one bath.");
			System.out.println("[2] two bath.");
			System.out.println("[3] five bath.");
			System.out.println("[4] ten bath.");
			System.out.println("[5] Exit");
			
			System.out.println("===========================");
			System.out.print("Please Select Menu[1-5] : ");
			int select = scan.nextInt();
			
			if(select == 1) 
			{
				System.out.print("Insert 1 Bath Money : ");
				int insert1 = scan.nextInt();
				pb.addOne(insert1);
				System.out.println("Money Total : "+pb.getTotal());
				
			}
			else if(select == 2) 
			{
				System.out.print("Insert 2 Bath Money : ");
				int insert2 = scan.nextInt();
				pb.addTwo(insert2);
				System.out.println("Money Total : "+pb.getTotal());
			}
			else if(select == 3) 
			{
				System.out.print("Insert 5 Bath Money : ");
				int insert5 = scan.nextInt();
				pb.addFive(insert5);
				System.out.println("Money Total : "+pb.getTotal());
				
			}
			else if(select == 4) 
			{
				System.out.print("Insert 10 Bath Money : ");
				int insert10 = scan.nextInt();
				pb.addTen(insert10);
				System.out.println("Money Total : "+pb.getTotal());
			}
			else if(select == 5) 
			{
				System.out.println("Bye Bye");
				break;
			}
		}
	}

}
