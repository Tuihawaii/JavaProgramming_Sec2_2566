import java.util.*;

public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X,Y,Z;
		
		System.out.print("Input value of X : ");
		X = scan.nextInt();
		System.out.print("Input value of Y : ");
		Y = scan.nextInt();
		
			while(X>Y) 
		{
				System.out.print("Input value of Y, again : ");
				Y = scan.nextInt();
			
		}
		System.out.println();
		Z = X;
		
			while(X<Y) 
		{
			int All = Z+X+1;
			System.out.println(""+Z+" + "+(X+1)+" = "+""+All);
			Z = All;
			X++;
		}

	}
}
