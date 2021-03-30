package ExceptionListThreadFiles;

public class thread2 {
    static class A implements Runnable{
        public void run(){
            System.out.println("bye");
        }
    }
    public static class App{
        public static void main(String[] args) {
            Thread ob = new Thread(new A());
            ob.start();
        }
    }
}
