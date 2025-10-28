package old_code.day6;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		//define an array, to save the scores of 5 student
		//enter score for them one by one
		//print every score out, then print the sum and average score
		int[] scores = new int[5];
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0 ; i<scores.length ; i++) {
			//enter socre, and save it in array
			System.out.println("enter score:");
			scores[i] = scanner.nextInt();
		}
		
		System.out.println("the socres for those students are:");
//		for(int i=0 ; i<scores.length ; i++) {
//			System.out.println(scores[i]);
//		}
		int sum = 0;
		for(int e:scores) {
			System.out.println(e);
			sum+=e;
		}
		System.out.println("the total score is:"+sum);
		double avg = (double)sum/scores.length; 
		System.out.println("the average score is:"+avg);
		
	}

}









