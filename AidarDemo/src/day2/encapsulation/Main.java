package day2.encapsulation;

public class Main {
    public static void main(String[] args) {
        Date d1 = new Date();
        Date d2 = new Date(2023);
        Date d3 = new Date(5,2021);
        Date d4 = new Date(23,4,2022);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
    }
}
