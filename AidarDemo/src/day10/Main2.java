package day10;

import java.util.Random;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//call the method here
		//if the result is even, then print "we got an even result"
		//otherwise print "we got an odd result"
		double result = fun();
		if(result%2==0) {
			System.out.println("we got an even result");
		}else {
			System.out.println("we got an odd result");
		}
		
		double result2 = fun(3,4);
		if(result2%2==0) {
			System.out.println("we got an even result");
		}else {
			System.out.println("we got an odd result");
		}
		
				
	}
	
	int a=10;
//	wrong:we can't have same method in the same class
	public static double fun(int a,String b){
		System.out.println("same method");
		return 10;
	}
	public static double fun(String a,int b){
		System.out.println("same method");
		return 10;
	}
	//pow   2^3 = 8
	//define a method,inside of this method, generate 2 random number
	//number1 : 1~10
	//number2 : 1~4
	//calculate the result of number1^number2
	public static double fun() {
		//generate 2 random number
		Random random = new Random();
//      int rand = random.nextInt(100); 	//0~99
//		int rand = random.nextInt(0,100);	//0~99
		int number1 = random.nextInt(1, 11);	//5
		int number2 = random.nextInt(1, 5);		//3
		double sum = Math.pow(number1, number2);
//		int sum = 1;
//		for(int i=1 ; i<=number2 ; i++) {
//			sum*=number1;
//		}
		System.out.println(number1+"^"+number2+"="+sum);
		return sum;
	}
	//methods overloading:in the same class, methods are in the same name but with different parameters
	//different parameter: different amount,different type,different order(barely use)
	//it gives us more ways to use methods
	public static double fun(int number1,int number2) {
		double sum = Math.pow(number1, number2);
		System.out.println(number1+"^"+number2+"="+sum);
		return sum;
	}
	
}










