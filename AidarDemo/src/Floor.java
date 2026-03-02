//Each floor contains a floor number (int) and multiple apartments (an array).
public class Floor {
    public int number;
    public Apartment[] apartments;

    public Floor(int number, Apartment[] apartments) {
        this.number = number;
        this.apartments = apartments;
    }
    public void print(){
        System.out.println("\tFloor "+number+", number of apartments "+apartments.length);
    }
}
