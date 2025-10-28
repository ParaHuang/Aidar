package old_code.day4;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		//limit times of loop
		//A. certain times of loop:   1.initial value 2.condition  3.increment  --for
		//B. limit but uncertain times of loop	--while
		
		//break;
		
		//Jack wants to open an pet shop
		//he firstly needs to buy puppies and cats
		//the condition is that he need 5 cats
		//for puppies, no requirements
		
		//process likes:
		//what do you want to buy? 1-puppy  2-cat
		//enter:1/2
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		/*
		while(true) {
//		for(;;) {
			System.out.println("what do you want to buy? 1-puppy  2-cat");
			int pet = scanner.nextInt();
			if(pet==2) {
				count++;
			}
			
			if(count==5) {
				break;
			}
		}
		*/
		
		while(count!=5) {
			System.out.println("what do you want to buy? 1-puppy  2-cat");
			int pet = scanner.nextInt();
			if(pet==2) {
				count++;
			}
		}
		
	}

}











