package day2.inheritance;
//OOP:object-oriented programing
//encapsulation:to keep your code/information safe(make fields private, access privates fields by public function)
//          define fields->generate 2 constructors->generate getters and setters->generate toString
//inheritance:to reuse your code
//polymorphism:

public class Human {
    public void eat(){
        System.out.println("time to eat");
    }
    public void sleep(){
        //this:current Human object
        //super:the object of Object
        System.out.println("time to sleep");
    }
}
