package day12;

import java.util.ArrayList;

public class Main4 {

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
//		System.out.println(list.contains("Mike"));
		/*
		while(list.contains("Jack")) {
			list.remove("Jack");
//			System.out.println(list);
		}*/
		
		
		//keep removing until it returns false
		//because when it returns false, that means there is no Jack anymore
		while(list.remove("Jack")) {}

		System.out.println(list);
		
		
	}

}

