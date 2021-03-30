package ExceptionListThreadFiles;

public class thread {
    static class a extends Thread{
        public void run(){
            System.out.println("hello");
        }

        public static void main(String[] args) {
            thread.a object = new thread.a();
            object.start();
        }
    }
}
