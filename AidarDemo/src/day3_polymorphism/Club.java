package day3_polymorphism;


public class Club {
    public void party(Human c){
        System.out.println("\npart start");
        c.eat();
        System.out.println("part is over,everybody go home");
        c.sleep();
    }
    /*
    //              format parameter
    public void party(Chinese c){
        System.out.println("\npart start");
        //people eat
        c.eat();
        System.out.println("part is over,everybody go home");
        //people sleep
        c.sleep();
    }
    //    //              format parameter
    public void party(American c){
        System.out.println("\npart start");
        c.eat();
        System.out.println("part is over,everybody go home");
        c.sleep();
    }

    public void party(Indian c){
        System.out.println("\npart start");
        c.eat();
        System.out.println("part is over,everybody go home");
        c.sleep();
    }
    */
}
