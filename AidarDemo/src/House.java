//Each house contains its own number (int) and multiple floors (an array).
public class House {
    public int number;
    public Floor[] floors;

    public House(int number, Floor[] floors) {
        this.number = number;
        this.floors = floors;
    }

    public void print(){
        System.out.println("House "+number+", number of floors "+floors.length);
    }
}

//complex-type