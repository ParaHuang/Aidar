package day5;

public class Main {
    public static void main(String[] args) {
        PS5 ps5 = new PS5();
        Nintendo nintendo = new Nintendo();
        XBox xbox = new XBox();

        Polaroid polaroid = new Polaroid();
        GoPro goPro = new GoPro();
        DigitalCamera digitalCamera = new DigitalCamera();

        CellPhone cellPhone = new CellPhone();

        YoungPeople young = new YoungPeople();
        young.haveFun(ps5);
        young.haveFun(nintendo);
        young.haveFun(xbox);

        young.record(polaroid);
        young.record(goPro);
        young.record(digitalCamera);

        //polymorphism
        young.haveFun(cellPhone);
        young.record(cellPhone);
    }
}
//-----------C
class YoungPeople{
    public void haveFun(GameMachine x){
        System.out.println("\n--young people need to have fun--");
        x.playGame();
    }

    public void record(Camera c){
        System.out.println("\n--time to record good moments");
        c.takePicture();
    }
}

//------------A
//abstract class = abstract methods + normal methods
//interface = abstract methods
//1.if there is only abstract methods inside an abstract class, then we can make this class into interface
//2.inside interface,all methods are abstract, so no need to add that modifier
//3.we define class to implements interface
interface GameMachine{
    void playGame();
}

class PS5 implements GameMachine{
    @Override
    public void playGame() {
        System.out.println("PS5---buy a game CD，connect with TV，there we go!");
    }
}

class Nintendo implements GameMachine{
    @Override
    public void playGame() {
        System.out.println("Nintendo---Turn it on，choose a game，playing alone，so nice");
    }
}

class XBox implements GameMachine{
    @Override
    public void playGame() {
        System.out.println("XBox---connect with TV,choose a game from game store, then play!");
    }
}

//-------------B
interface Camera{
    void takePicture();
}

class Polaroid implements Camera{

    @Override
    public void takePicture() {
        System.out.println("Polaroid---press the shutter, get an instant photo");
    }
}

class GoPro implements Camera{

    @Override
    public void takePicture() {
        System.out.println("GoPro---diving into ocean,let's memorize this beautiful world");
    }
}

class DigitalCamera implements Camera{

    @Override
    public void takePicture() {
        System.out.println("DigitalCamera---press the shutter,get an digital picture");
    }
}

class CellPhone implements GameMachine,Camera{
    @Override
    public void takePicture() {
        System.out.println("Cellphone--take my phone out, take a picture that I can watch it everyday");
    }

    @Override
    public void playGame() {
        System.out.println("Cellphone--take my phone out, login, play some online games with my teammates");
    }
}



//single extends
class A{}
class B{}
class C extends B{}
//multiple implements
interface D{}
interface E{}
class F implements D,E{}

//G only has one parent (A) , but can be more than 1 profession (D,E)
class G extends A implements D,E{


}

interface Believer{
    void pray();
}
interface X{
    void a();
    void b();
    void c();
}


