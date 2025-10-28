package old_code.day1;

public class Main1 {

	public static void main(String[] args) {
		//if...else...
		//leap year:
		//1.this year is divisible by 400
		//2.divisible by 4 but not divisible by 100
		int year = 2023;
		
		if(year%400==0 || year%4==0 && year%100!=0) {
			System.out.println(year+" is leap year");
		}else {
			System.out.println(year+" is not a leap year");
		}
		
		//loop:repeating 
		//print hello for 5 times
		int x=1;
		while(x<=5) {
			System.out.println("hello");
			x++;
		}
		
		//print 1 to 100
		/*
		int i=1;
		while(i<=100) {
			//print all the even number from 1 to 100
			if(i%2==0)
				System.out.println(i);
			i++;
		}
		*/
		
		int i=2;
		while(i<=100) {
			System.out.println(i);
			i+=2;
		}
		
		//prime number:it's only divisible by 1 or itself
		//2 3 5 7  11 13  17  19....
		
		
		
		
		
	}

}











