package day13_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test4 {
    public static void main(String[] args) {
        /*
        stream              input               output
        action              read                write
         */
        //writing
        try {
            OutputStream out = new FileOutputStream("/Users/parahuang/Downloads/hello.txt",true);
            out.write("\r\n--more new content--".getBytes());//String->byte[]
            out.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
