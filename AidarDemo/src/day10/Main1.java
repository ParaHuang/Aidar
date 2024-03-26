package day10;

public class Main1 {

	public static void main(String[] args) {
		int x = fun1(4, 1, " - ");
		//if the sum is even number, then you print "hello"
		//otherwise you print "hola"
		if(x%2 == 0) {
			System.out.println("hello");
		}else {
			System.out.println("hola");
		}
	}
	//method:a separate code with logic
	//A.define methods
	/*
	public returnType methodName(parameterList){
		body
		return value; //value should be in the type of returnType
	}
	parameterList:  type1 name1,type2 name2,type3 name3  (parameter is the data we need to finish the method body)
	parameter - variable
	example: 		int x,double y,String z
	
	//B.call method
	returnType variable = methodName(value1,value2,value3);	
	*/
	//void:no return,this method has nothing needs be known outside
	//if the result of a method need be used for the rest of program
	//then we return this result 
	//return type will define in the end of method, what type of value you will return
	public static int fun1(int a, int b, String name) {
        int sum = 0;
        if(name.equals(" + ")){
            sum = a + b;
        }else if(name.equals(" - ")){
            sum = a - b;
        }else if(name.equals(" * ")){
            sum = a * b;
        }else if(name.equals(" / ")){
            sum = a / b;
        }else if(name.equals(" % ")){
            sum = a % b;
        }
        System.out.println(a + name + b + " = " + sum);
        return sum;
    }
}








