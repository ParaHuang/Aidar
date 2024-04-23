package day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Main1 {

	public static void main(String[] args) {
		/*
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		//some information about a student
		list.add("male");//gender
		list.add("American");//nationality
		list.add("Jack");//name
		list.add(15);//age
		list.add(1.67);//height
		
		//output the name and age of this student
		System.out.println("Name:"+list.get(0));
		System.out.println("Age:"+list.get(1));
		*/
		//information not in the same type, not as the same meaning,order doesn't matter
		//we shouldn't use List
		
		//Map: use key-value pair to save information
		HashMap<String, Object> map = new HashMap<String, Object>();
		//save data with map:key-value pair
		map.put("height", 1.67);
		map.put("age", 15);
		map.put("name", "Jack");
		map.put("gender", "male");
		map.put("age", 18);//key is same, new value will replace old value
		
		//get data out of map by key
		System.out.println("Name:"+map.get("name"));
		System.out.println("Age:"+map.get("age"));
		
		//get all the key,save them in a Set
		Set<String> set = map.keySet();
		for(String key:set) {
			System.out.println(key+":"+map.get(key));
		}
	}

}
















