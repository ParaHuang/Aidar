package day13;

import java.util.ArrayList;

public class Main1 {

	public static void main(String[] args) {
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("hello");
		

		//java data type
		//primitive type : short int long       double  float      char     boolean    byte
		//objective type: String,Scanner,Random,Main1,ArrayList,System    +   Wrapper class
		
		//generic: it can only be objective type
		ArrayList<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(55);
		list.add(3);
		list.add(22);
		list.add(6);
		list.add(19);
		
		System.out.println(list);
		
		list.remove(1);		//by index
		System.out.println("after removed element at index 1: "+list);
		
		
		
//		list.remove(19);	//by Object,but it's not gonna work, it will take 19 as index
//		
			
		list.remove((Integer)19);
		System.out.println("after removed element 19: "+list);
	}

}













