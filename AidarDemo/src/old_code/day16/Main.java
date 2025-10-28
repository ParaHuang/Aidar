package old_code.day16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		//use a class
		//1. initialize an object of class
		Student stu = new Student();
		//2. objectName.member
		stu.name = "Jack";
		stu.age = -18;
		stu.study();
		 */
		
		
		//2.use the class you defined
		//2.1 instantiate:the process of creating an object/instance
		//Class obj = new Class();
		Book book1 = new Book();	//new = create
		//2.2 assign values to instance variables by obj.attribute = value;
		// .  ->   's  ,    of
//		book1.name = "Little Princess";
//		book1.author = "No one";
//		book1.type = "romantic";
//		book1.price = 58;
//		double p1 = 5.8;
//		if(p1<=0) {
//			System.out.println("invalid price");
//		}else {
//			book1.price = p1;
//		}
		
		//2.3 call the method of a object by obj.methodName();
		book1.teaching();
		
		Book book2 = new Book();
//		book2.name = "Harry Potter";
//		book2.price = 6;
//		double p2 = -6;
//		if(p2<=0) {
//			System.out.println("invalid price");
//		}else {
//			book2.price = p2;
//		}
		book2.teaching();

	}

}










