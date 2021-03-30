package MoreOnClasses;

public class quiz1 {
    static class A {
        private void print() {

            System.out.println("a");
        }
        private void print(String str) {

            System.out.println("b");
        }
        private void print(int x) {

            System.out.println("c");
        }
        public static void main(String[ ] args) {
            quiz1.A object = new quiz1.A();
            object.print(12);
        }

    }
}
