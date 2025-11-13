package day6.a;

public class Neighbor {
    public void test(){
        //when you want to use the fields of other class, you firstly need an object of other class
        Self self = new Self();
//        self.a = 10;  //wrong
        self.b = 10;
        self.c = 10;
        self.d = 10;
    }
}
