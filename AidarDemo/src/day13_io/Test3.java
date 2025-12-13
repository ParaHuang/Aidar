package day13_io;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        File target = new File("/Users/parahuang/Downloads/abcdefg");
        //find all pictures inside of this folder no matter how deep they are
        findPic(target);
    }

    public static void findPic(File folder){
        File[] fs = folder.listFiles();
        for(File f:fs){
            String name = f.getName().toLowerCase();
            if(f.isDirectory()){
                //you should open it
                //open->check every file inside->(1.folder(open->check every file inside->(1.folder(open->)  2.file-picture 3.file-others-not care))  2.file-picture  3.file-others-not care)
                findPic(f);     //recursion
            }else if(name.endsWith(".png") || name.endsWith(".jpeg") || name.endsWith(".jpg") || name.endsWith(".gif")){
                System.out.println(f.getParent()+"--"+name);
            }
        }
    }
}
