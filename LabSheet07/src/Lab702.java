import java.util.*;
public class Lab702 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] score = new double[5];
		double Average = 0;
		
		for(int i=0;i<score.length;i++) {
			System.out.print("Input score of student "+(i+1)+" : ");
			score[i] = scan.nextDouble();
			Average += score[i];
		}
		Average = Average/score.length;
		
		System.out.println();
		System.out.print("Average of "+score.length+" is "+String.format("%.2f", Average));
		
		int i = 0;
		
		for(double _score:score)
			if(_score>Average) {
				System.out.println("> Student "+(i+1)+" ("+_score+")");
			}

	}

}
