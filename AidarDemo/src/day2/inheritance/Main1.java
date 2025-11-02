package day2.inheritance;

public class Main1 {
    public static void main(String[] args) {
        Human human = new Human();
        human.eat();
        human.sleep();
//        human.kungFu(); //wrong
        System.out.println();

        Chinese chinese = new Chinese();
        chinese.eat();
        chinese.sleep();
        chinese.kungFu();
        System.out.println();

        American american = new American();
        american.eat();
        american.sleep();
        chinese.kungFu();
        System.out.println();

        Indian indian = new Indian();
        System.out.println(indian);
//        Object
    }
}
