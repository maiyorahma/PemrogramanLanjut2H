package ConditionalAndLoops;
import java.util.Scanner;
public class Loan {
    public static void main(String[] args) {
      Scanner masuk = new Scanner(System.in);
      int amount = masuk.nextInt();
      int a;
        for(int i=1;i<=4;i++){
            a = amount / 10;
            amount = amount - a;
            if(i==3) {
                System.out.println(amount);
            }
    }
    }
}
