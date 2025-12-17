package day15_io;

import java.io.*;

public class Test1 {
    public static void main(String[] args) {
        //copy + paste
        //read   write
        //read:original file ->  program
        //write:program ->  target file(desktop )

        try {
            InputStream in = new FileInputStream("/Users/parahuang/Downloads/hello.txt");
            byte[] bs = in.readAllBytes();

            OutputStream out = new FileOutputStream("/Users/parahuang/Desktop/hello.txt");
            out.write(bs);

            out.close();
            in.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
