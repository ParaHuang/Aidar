package day12;

import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//<E>  : generic , data type restriction
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("10");
		list.add("hi");
		list.add("world");
		list.add("help");
		list.add("lunch");
		list.add("whatever");
		
		String str = list.get(2);
		System.out.println(str);
		System.out.println(list);
		
		//remove
		list.remove(2);		//remove by index
		list.remove("lunch");//remove the element directly
		System.out.println(list);
		String str2 = list.get(2);
		System.out.println(str2);
		
	}

}

