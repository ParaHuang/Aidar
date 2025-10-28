package old_code.day14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(33);
		list.add(22);
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println();
		
		//1.only save unique data
		//2.those data are not in order
		//3.doesn't have index
		//instantiate
//		HashSet<Integer> set = new HashSet<Integer>();
//		TreeSet<Integer> set = new TreeSet<Integer>();		//in natural order
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();		//in add order
		
		//add data
		set.add(11);
		set.add(22);
		set.add(33);
		set.add(44);
		set.add(33);
		set.add(22);
		set.add(1);
		set.add(3);
		System.out.println(set.size());	//size
			
		for(int x:set) {		//check every element
			System.out.println(x);
		}
		
		boolean f = set.remove(88);
		System.out.println(f);
		System.out.println(set);
		
		boolean f2 = set.contains(33);
		System.out.println(f2);
	}

}







