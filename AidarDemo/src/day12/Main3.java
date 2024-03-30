package day12;

import java.util.ArrayList;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Jack");
		list.add("Alex");
		list.add("Luke");
		list.add("Jack");
		list.add("Jack");
		list.add("Jack");
		list.add("Jack");
		list.add("Jack");
		list.add("Jack");
		list.add("Jack");
		list.add("Jack");
		list.add("Jack");
		list.add("Susan");
		list.add("Lily");
		
		System.out.println(list);
//		list.remove(0);
//		System.out.println(list);
		//    A          B             C
		for(int i=0 ; i<list.size() ; i++) {
			//1.get every value from list one by one
			String name = list.get(i);
			//2.to see if the present value equals as Jack
			// if so ,remove it by index
			if(name.equals("Jack")) {
				list.remove(i);
				i--;
			}//D
		}
		//A->B->D->C->B->D->C->B->D->C->B->D->C->B(false)
		System.out.println(list);
	}

}

