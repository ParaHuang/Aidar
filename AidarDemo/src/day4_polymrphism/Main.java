package day4_polymrphism;


public class Main {
    public static void main(String[] args) {
        Chinese chinese = new Chinese();
        American american = new American();
        Indian indian = new Indian();

        Club club = new Club();
//                actual parameter
        club.party(chinese);
        club.party(american);
        club.party(indian);
    }

}
