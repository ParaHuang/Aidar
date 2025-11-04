package day3_polymorphism;

public class Main1 {
    public static void main(String[] args) {
        //1.initialize
        //ClassName reference = new ClassName();

        //2.reference type change
        //A.the type of reference decides which methods we can use
        //B.the type of object decides how to use the methods
        //SuperClass reference = new SubClass();
        Human h1 = new Chinese();//after = is creating an object
        h1.eat();
        h1.sleep();
//        h1.kungFu();//wrong, look at him as Human,human doesn't have kungFu
        //Chinese c = new Human();  //wrong
        System.out.println();

        Human h2 = new American();
        h2.eat();
        h2.sleep();
    }
}

//2 precondition of polymorphism:
//1.reference type change
//2.override