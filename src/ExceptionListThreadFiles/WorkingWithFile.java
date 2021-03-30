package ExceptionListThreadFiles;

import java.io.File;

public class WorkingWithFile {
    public static void main(String[] args) {
        File file =new File("a.text");
        if (file.exists()){
            System.out.println("yes");
        }
    }
}
