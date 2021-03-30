package BasicConsept;
import java.util.Scanner;
public class timeConveter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        //merubah hari ke detik
        int ubah = days*24*60*60;
        System.out.println(ubah);
    }
}
