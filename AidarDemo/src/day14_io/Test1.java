package day14_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        /*
        stream              input               output
        action              read                write
         */

        //reading
        try {
            InputStream in = new FileInputStream("/Users/parahuang/Downloads/hello.txt");
//              < 10 MB（recommend）
//              < 50 MB（be careful）
//              > 100 MB（no）
            byte[] bs = in.readAllBytes();
//            System.out.println(Arrays.toString(bs));
            String msg = new String(bs);        //when you read text file
            System.out.println(msg);

//            byte[] arr = new byte[10*1024*11024];
//            in.read(arr);           //you can limit how much you read for 1 single time
//            in.read(arr);           //next time you will read from where you stop last time
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
