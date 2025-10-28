package old_code.day16;

//1.define a class
public class Book {
	//									object			--	class
	//name author   type   price    --> feature				attribute/field/instance variable
	private String name;
	private String author;
	private String type;
	private double price;
	//every variable has a default value
	//int->0   double->0.0   boolean->false   String->null
	
	//assign/set a value to name
	public void setName(String n) {
		name = n;
	}
	
	public void setPrice(double p) {
		if(p<=0) {
			System.out.println("invalid price");
		}else {
			price = p;
		}
	}
	
	//teaching						--> behavior			method/function
	public void teaching() {
		System.out.println("the price of <"+name+"> is "+price+", and it teaches us a lesson");
	}
}

