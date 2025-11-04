package day4_polymrphism;


public class Club {
    public void party(Human h){
        System.out.println("\npart start");
        h.eat();    //polymorphism.
        System.out.println("part is over,everybody go home");
        h.sleep();
    }

}
