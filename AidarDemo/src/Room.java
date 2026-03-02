//Each room contains a field indicating whether it is a walk-through room or not (boolean).
public class Room {
	public boolean isWalkThrough;
	
	public Room(boolean isWalkThrough) {
		this.isWalkThrough = isWalkThrough;
	}
	
	public void print() {
//		System.out.println("A "+(isWalkThrough ? "" : "not ")+"passable room");
		if(isWalkThrough){
			System.out.println("\t\t\tA passable room");
		}else{
			System.out.println("\t\t\tA not passable room");
		}
	}
}
//ternary operator
//A ? B : C
