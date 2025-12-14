package day14_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Test2 {
    public static void main(String[] args) {

        try {
            InputStream in = new FileInputStream("/Users/parahuang/Downloads/ideaIU-2025.1.3-aarch64.dmg");
//              < 10 MB（recommend）
//              < 50 MB（be careful）
//              > 100 MB（no）
            byte[] bs = in.readAllBytes();
            String msg = new String(bs);        //when you read text file
            System.out.println(msg);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
