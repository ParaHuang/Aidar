package day6;

public class Main1 {

	public static void main(String[] args) {
		//1. define
//		type[] ary = new type[length];	
		//2.use
//		ary[index]    index:0~length-1
		
		int[] ary = new int[5];
		ary[0] = 22;
		ary[1] = 67;
		ary[2] = 8;
		ary[3] = 67;
		ary[4] = 5;

//		System.out.println(ary[0]);
//		System.out.println(ary[1]);
//		System.out.println(ary[2]);
//		System.out.println(ary[3]);
//		System.out.println(ary[4]);
		//for loop
		for(int i=0 ; i<ary.length ; i++) {
			System.out.println("element No."+(i+1)+": "+ary[i]);
		}
		
		
		//for-each loop(enhanced loop):to check element of array/Collections one by one
//		for(type name:ary/collections) {
//			name is the element in ary/collections one by one
//		}
		
		for(int e:ary) {
			System.out.println("element:"+e);
		}
		
	}

}









