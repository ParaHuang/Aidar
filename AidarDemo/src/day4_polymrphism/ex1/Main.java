package day4_polymrphism.ex1;

public class Main {
    public static void main(String[] args) {
        PS5 ps5 = new PS5();
        Nintendo nintendo = new Nintendo();
        XBox xbox = new XBox();

        YoungPeople young = new YoungPeople();
        young.haveFun(ps5);
        young.haveFun(nintendo);
        young.haveFun(xbox);
    }
}

class YoungPeople{
    public void haveFun(GameMachine x){
        System.out.println("\n--young people need to have fun--");
        x.playGame();
    }
}


abstract class GameMachine{
    public abstract void playGame();
}

class PS5 extends GameMachine{
    @Override
    public void playGame() {
        System.out.println("PS5---buy a game CD，connect with TV，there we go!");
    }
}

class Nintendo extends GameMachine{
    @Override
    public void playGame() {
        System.out.println("Nintendo---Turn it on，choose a game，playing alone，so nice");
    }
}

class XBox extends GameMachine{
    @Override
    public void playGame() {
        System.out.println("XBox---connect with TV,choose a game from game store, then play!");
    }
}











