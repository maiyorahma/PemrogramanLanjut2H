package Array;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        //convert String to char menggunakan toCharArray
        char[] arr = text.toCharArray();

        for (int i = arr.length-1; i>=0;i--)
            System.out.print(arr[i]);
    }

}
