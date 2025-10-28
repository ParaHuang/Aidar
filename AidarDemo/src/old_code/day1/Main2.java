package old_code.day1;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//prime number:it's only divisible by 1 or itself
		//not prime number: divisible by some number which is from 2 to itself-1
		//2 3 5 7  11 13  17  19....
		int num = 121;	//73  
		
		int i=2;//2~72    //71 numbers to test
		while(i<num) {
			if(num%i==0) {
				//not prime number
				System.out.println(num+" is not prime number");
//				return;	//solution 1:stop the program
				break;	//solution 2:stop the loop
			}
			i++;
		}
		//⬆this whole process above can prove a number is not a prime number
		//solution 1
//		System.out.println(num+" is a prime number");
//		System.out.println("the end of the program");
//		System.out.println(i);
//		if in the end, i is the same as num, the num is prime
//		because i never got chance to stop in the middle
//		solution 2
		if(i==num) {
			System.out.println(num+" is a prime number");
		}
	}

}









