package ExceptionListThreadFiles;

public class quiz3 {
    static class B implements Runnable {
        public void run() {
            System.out.println("B");
        }
    }
    static class A extends Thread {
        public void run() {
            System.out.println("A");
            Thread t = new Thread(new B());
            t.start();
        }
        public static void main(String[ ] args) {
            A object = new A();
            object.start();
        }

    }
}