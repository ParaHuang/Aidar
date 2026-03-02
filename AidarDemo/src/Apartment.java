//Each apartment contains its own number (int) and multiple rooms (an array).
public class Apartment {
    public int number;
    public Room[] rooms;

    public Apartment(int number, Room[] rooms) {
        this.number = number;
        this.rooms = rooms;
    }

    public void print(){
        System.out.println("\t\tApartment "+number+", number of rooms "+rooms.length);
    }
}

//complex-type