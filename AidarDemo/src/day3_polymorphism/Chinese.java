package day3_polymorphism;

public class Chinese extends Human {

    @Override
    public void eat() {
        System.out.println("Chinese eat with chopsticks");
    }

    public void kungFu(){
        System.out.println("Chinese know kungFu");
    }
}

