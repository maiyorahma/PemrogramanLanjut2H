package ExceptionListThreadFiles;

import java.io.IOException;

public class TestEXthrow {
    public static void main(String[] args) {
        try {
            quis2 tes = new quis2();
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex);
        }
    }
}
