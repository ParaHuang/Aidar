package day6.a;
//current class
public class Self {
    private int a;              //private: only visible inside current class
    int b;                      //absent:only visible inside same package
    protected int c;            //protected:visible as long as there is any relationship
    public int d;               //public:visible everywhere

    public void test(){
        a = 10;
        b = 10;
        c = 10;
        d = 10;
    }
}

// the visibility of different modifier
//                                  private         absent          protected       public
//current class                         ✅           ✅               ✅               ✅
//subclass of same package              ❌           ✅               ✅               ✅
//other class of same package           ❌           ✅               ✅               ✅
//subclass of different package         ❌           ❌               ✅               ✅
//other class of different package      ❌           ❌               ❌               ✅
