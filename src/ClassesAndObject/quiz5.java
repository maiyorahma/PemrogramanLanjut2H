package ClassesAndObject;

public class quiz5 {
    public static void main(String[] args) {
        int a =mintFunc (4, 2);
        System.out.println(a);
    }
    public static int mintFunc(int n1, int n2) {
                int min;
                if (n1 > n2)
                    min = n2;
                else
                    min = n1;
                return min;
            }
        }
