
public class Main2 {
	public static void main(String[] args) {
		Room room1_1 = new Room(true);
		Room room1_2 = new Room(false);
		Room room2_1 = new Room(false);
		Room room2_2 = new Room(true);
		Room room2_3 = new Room(false);

		Room[] arr_room1 = {room1_1,room1_2};	//apartment1
		Room[] arr_room2 = {room2_1,room2_2,room2_3};	//apartment2

		Apartment apartment1 = new Apartment(1,arr_room1);
		Apartment apartment2 = new Apartment(2,arr_room2);

		Apartment[] apartments = {apartment1,apartment2};

		Floor floor = new Floor(1,apartments);

		Floor[] floors = {floor};

		House house = new House(1,floors);

		printAllInformation(house);
	}

	public static void printAllInformation(House house){
		//print all information
		house.print();
		//get all floors of house
		Floor[] floors = house.floors;
		for (Floor f:floors) {
			f.print();
			//get all apartments of this floor
			Apartment[] apartments = f.apartments;
			for (Apartment a:apartments){
				a.print();
				//get all rooms of this apartment
				Room[] rooms = a.rooms;
				for(Room r:rooms){
					r.print();
				}
			}
		}
	}
}
