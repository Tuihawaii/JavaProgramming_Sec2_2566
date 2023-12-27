import java.util.*;
public class Lab701 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[7];
		int numsOdd = 0;
		for(int i = 0; i< nums.length;i++) {
			System.out.print("Input number "+(i+1)+" = " );
			int num = scan.nextInt();
			
			if(!(num%2==1)) {
				numsOdd++;
			}
		}
		System.out.println();
		System.out.println("There are "+numsOdd+" of odd number.");
		int j = 0;
		System.out.print("\nList of odd number : " );
		for(int _number:nums) {
			if(_number%2 !=0)
			{
				System.out.print(" "+_number);
			}
		}
	}

}
