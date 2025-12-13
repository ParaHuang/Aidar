package day13_io;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) {
        //1.create a File object
        File file = new File("/Users/parahuang/Downloads/test.txt");
        //2.operations
        //a.delete file
//        file.delete();
        /* /*
        try {
            //b.create file
            file.createNewFile();   //have exception because the path might be wrong
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
        //c.create folder
//        file.mkdir();

        //d.rename
        file.renameTo(new File("/Users/parahuang/Downloads/hello.txt"));
    }
}
