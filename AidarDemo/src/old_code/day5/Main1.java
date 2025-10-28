package old_code.day5;

import java.util.Scanner;

public class Main1 {

	//check if one number is a narcissistic number
	public static void main(String[] args) {
		//every 3-digit number
		for(int i=100 ; i<1000 ; i++) {
			int number = i;
			int ones = number%10;
			int tens = number%100/10;
			int hundreds = number/100;
			int sum = ones*ones*ones + tens*tens*tens + hundreds*hundreds*hundreds;
			//num:153     1     5    	3
			//        	  1  +  125 +  27 = 153->sum
			//num:123	  1		2		3
			//            1	 +	8	+	27 = 36->sum
	
			if(number == sum){
				System.out.println(number+" is a narcissistic number");
			}
		}
		
		//initial value, condition , increment
		int i=100;
		while(i<1000) {
			
			int number = i;
			int ones = number%10;
			int tens = number%100/10;
			int hundreds = number/100;
			int sum = ones*ones*ones + tens*tens*tens + hundreds*hundreds*hundreds;
			//num:153     1     5    	3
			//        	  1  +  125 +  27 = 153->sum
			//num:123	  1		2		3
			//            1	 +	8	+	27 = 36->sum
	
			if(number == sum){
				System.out.println(number+" is a narcissistic number");
			}
			
			
			i++;
		}
		
		
		
		
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("enter a 3-digit number:");
//		int number = scanner.nextInt();
//		int ones = number%10;
//		int tens = number%100/10;
//		int hundreds = number/100;
//		int sum = ones*ones*ones + tens*tens*tens + hundreds*hundreds*hundreds;
//		//num:153     1     5    	3
//		//        	  1  +  125 +  27 = 153->sum
//		//num:123	  1		2		3
//		//            1	 +	8	+	27 = 36->sum
//
//		if(number == sum){
//			System.out.println(number+" is a narcissistic number");
//		}
	}

}

