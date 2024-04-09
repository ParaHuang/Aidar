package day12;

import java.util.ArrayList;

public class Main1 {

	public static void main(String[] args) {
		/*
		Collection
		|------List
		|		|----ArrayList
		|		|----LinkedList
		|
		|------Set
				｜----HashSet
		*/
		/*
		//define an int array, to save 5 element
		int[] ary = new int[5];	//using default value to keep memory space
		for(int x:ary) {
			System.out.println(x);
		}
		ary[0] = 11;
		ary[1] = 12;
		ary[2] = 8;
		ary[3] = 90;
		ary[4] = 3;
		System.out.println();
		for(int x:ary) {
			System.out.println(x);
		}*/
		//List
		//ArrayList:   dynamic array
		//1.create an ArrayList object
		ArrayList list = new ArrayList();	//new: create
		//2.the size of list
		int size = list.size();
		System.out.println(size);
		//3.add value into list
		list.add(67);	
		list.add(22);
		list.add(1);
		list.add("hello");
		list.add(true);
		System.out.println(list);
		//4.get value out by index
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
		for(int i=0 ; i<list.size() ; i++) {
			System.out.println(list.get(i));
		}
		//object:everything in java is object
		
		
	}

}







