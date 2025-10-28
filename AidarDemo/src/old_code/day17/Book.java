package old_code.day17;

public class Book {
	private String name;
	private String author;
	private String type;
	private double price;
	
	//this: the current object
	//when local variable is in the same name as global variable
	//use this.variable to refer to the global variable
	public void setName(String name) {
		this.name = name;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	public String getType() {
		return type;
	}
	public double getPrice() {
		return price;
	}
	//teaching						--> behavior			method/function
	public void teaching() {
		System.out.println("the price of <"+name+"> is "+price+", and it teaches us a lesson");
	}
}

