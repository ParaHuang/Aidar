package day15_io;

import java.io.*;

public class Test2 {
    public static void main(String[] args) {
        try {
          /*  InputStream in = new FileInputStream("testdata.txt");
            byte[] bs = in.readAllBytes();
            String data = new String(bs);
            System.out.println(data);
            in.close();*/

            BufferedReader br = new BufferedReader(new FileReader("testdata.txt"));
            while (true){
                String line = br.readLine();
                if (line == null){
                    break;
                }
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
