package day2;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3.enter a 4 figure integer number，print if this number is palindromic number or not
//		samples
//		enter: 1234 　　　　 print: 1234 is not a palindromic number
//		enter: 2332 　　　　print: 2332 is a palindromic number
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a 4 figure integer number:");
		int num = scanner.nextInt();
		//seperate this number into ones,tens,hundreds,thousands
		int ones = num%10;			//4
		int tens = num%100/10;		//3
		int hundreds = num%1000/100;//2
		int thousand = num/1000;	//1
		if(ones==thousand && tens==hundreds) {
			System.out.println(num + " is palindromic number");
		}else {
			System.out.println(num + " is not palindromic number");
		}
		*/
		//print all 4 digits palindromic number
		//
		
		for(int i=1000 ; i<=9999 ; i++) {
			int ones = i%10;			//4
			int tens = i%100/10;		//3
			int hundreds = i%1000/100;//2
			int thousand = i/1000;	//1
			if(ones==thousand && tens==hundreds) {
				System.out.println(i);
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}

