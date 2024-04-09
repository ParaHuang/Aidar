package day13;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Jack-18-male";
		String[] arr = str.split("-");
		String name = arr[0];
		String ageStr = arr[1];
		int ageInt = Integer.parseInt(ageStr);
		String gender = arr[2];
		System.out.println(name);
		System.out.println(ageInt);
		System.out.println(gender);
		//Jack just had his birthday
		ageInt = ageInt+1;
		System.out.println(ageInt);
		
		
		int x = 100;
		x+=1;
		System.out.println(x);
		
		String y = x+"";
		y+=1;
		System.out.println(y);
		
	}

}











