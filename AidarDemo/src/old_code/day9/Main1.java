package old_code.day9;

public class Main1 {

	public static void main(String[] args) {
		
		fun1();	//5times
		System.out.println();
		fun1();	//5times
		System.out.println();
		fun1();	//5times
		System.out.println("------------------");
		
		//the information decide at here, how can we transfer it into where we define
		fun2(3); //3times
		System.out.println();
		fun2(8);	//8times
		System.out.println("------------------");
		
		fun3(2,"hi");	//hi for 2 times
		System.out.println();
		fun3(6,"hola");	//hola for 6 times
		
		
	}
	
	//R:run
	//J:jump
	//B:bullet
	//K:kick
	//RRJKBK->big and strong action
	//Q->RRJKBK
	
	//method:a separate code with logic
	//A.define methods
	/*
	public void/returnType methodName(parameterList){
		body
	}
	parameterList:  type1 name1,type2 name2,type3 name3  (parameter is the data we need to finish the method body)
	parameter - variable
	example: 		int x,double y,String z
	
	//B.call method
	methodName(value1,value2,value3);
	
	
	*/
	
	//1.void, without parameter
	public static void fun1() {//print hello for 5 times
		for(int i=1 ; i<=5 ; i++) {
			System.out.println("hello");
		}
	}
	
	//2.void, with parameter
	public static void fun2(int anyName) {//print hello for N times
		for(int i=1 ; i<=anyName ; i++) {
			System.out.println("hello");
		}
	}
	
	public static void fun3(int name1,String name2) {
		for(int i=1 ; i<=name1 ; i++) {//print something for N times
			System.out.println(name2);
		}
	}
	
}





