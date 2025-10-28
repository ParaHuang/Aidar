package old_code.day2;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5.enter an integer number in the range of 1 to 100，print if this numbe has relationship with 7 (if this number contians 7 or it's multiples of 7, then we consider it as having relationship with 7 )
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter an integer number in the range of 1 to 100:");
		int num = scanner.nextInt();
		if(num%7==0 || num%10==7 || num/10==7) {
			System.out.println(num+" has relationship with 7");
		}else {
			System.out.println(num+" doesn't have relationship with 7");
		}
		*/
		
		//from 1 to 100, if it has relationship with 7, then "clap"
		//otherwise print it
		for(int i=1 ; i<=100 ; i++) {
			if(i%7==0 || i%10==7 || i/10==7) {
				System.out.println("clap");
			}else {
				System.out.println(i);
			}
		}
	
	}

}












