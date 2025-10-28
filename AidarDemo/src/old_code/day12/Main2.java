package old_code.day12;

import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//<E>  : generic , data type restriction
		ArrayList<String> list = new ArrayList<>();
		list.add("hello");		//add an element in the end
		list.add("10");
		list.add("hi");
		list.add("world");
		list.add("help");
		list.add("lunch");
		list.add("whatever");
		list.add(3, "new element");//index:0~current size
		
		
		String str = list.get(2);
		System.out.println(str);
		System.out.println(list);
		
		//remove
		String removedValue = list.remove(12);		//remove by index
		System.out.println(removedValue+" just got removed");
		boolean isSucceed = list.remove("dinner");//remove the element directly
		System.out.println(isSucceed);
		System.out.println(list);
		String str2 = list.get(2);
		System.out.println(str2);
		
	}

}

