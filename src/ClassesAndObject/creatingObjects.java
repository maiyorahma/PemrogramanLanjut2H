package ClassesAndObject;

public class creatingObjects {
     static class A{
        public void test(){
            System.out.println("hi");
        }
    }
    static class B{
        public static void main(String[] args) {
        A obj = new A();
        obj.test();
        }
    }
}

