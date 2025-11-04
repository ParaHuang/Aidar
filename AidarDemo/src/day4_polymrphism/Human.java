package day4_polymrphism;

public abstract class Human {

    //1.in superclass, there is a method, all Subclass override it
    // which means this method is important, but the method body is not
    // therefore we can delete method body
    //2.a method without body is abstract
    //3.if a class has abstract method, then this class is also abstract
    //4.all SubClass are forced to override abstract method
    // polymorphism will be forced to happen
    public abstract void eat();

    public void sleep(){
        System.out.println("time to sleep");
    }
}
