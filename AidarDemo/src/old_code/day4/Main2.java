package old_code.day4;

public class Main2 {

	public static void main(String[] args) {
		/*
		for(int i=1 ; i<=5 ; i++) {
			if(i==3) {
//				continue;	//1 2 4 5 hello    skip 3
//				break;		//1 2 hello
				return;		//1 2
			}
			System.out.println(i);
		}
		System.out.println("hello");
		*/
		
		for(int i=1 ; i<=5 ; i++) {
			for(int j=1 ; j<=5 ; j++) {
				if(j==3) {
//					continue;	//
//					break;		//
					return;		//
				}
				System.out.print(j+"  ");
			}
			System.out.println();
		}
		System.out.println("hello");
	}
	
	public int fun1() {
		
		return 10;
	}
	
	public void fun2() {
		
		return;//stop the program
	}
	
	public String fun3() {
		
		return "hello";
	}

}















