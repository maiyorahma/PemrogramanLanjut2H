package ClassesAndObject;

public class Static {

    static class test {
        public static int pCount;
        public static void main(String[] args) {
            test.pCount = 1;
            test.pCount++;
            System.out.println(test.pCount);
        }
    }
}