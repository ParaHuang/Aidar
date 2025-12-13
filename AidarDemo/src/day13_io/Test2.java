package day13_io;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {

        File file = new File("/Users/parahuang/Downloads/abcdefg");
        //1.get basic information
        System.out.println("file name:"+file.getName());
        System.out.println("get the outside folder"+file.getParent());
        System.out.println("is it folder?"+file.isDirectory());
        System.out.println("is it file?"+file.isFile());
        System.out.println("the abosulte path:"+file.getAbsolutePath());
        System.out.println();

        //2.if it's a folder, we can get the files inside
        File[] fs = file.listFiles();
        /*
        System.out.println("everything inside:");
        for (File f:fs){
            System.out.println(f.getName());
        }
        */
        System.out.println("the pictures inside are:");
        for (File f:fs){
            String name = f.getName().toLowerCase();
            if(name.endsWith(".png") || name.endsWith(".jpeg") || name.endsWith(".jpg") || name.endsWith(".gif")){
                System.out.println(name);
            }
        }

    }
}
