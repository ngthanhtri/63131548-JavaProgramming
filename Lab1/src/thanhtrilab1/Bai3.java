package thanhtrilab1;
import java.util.Scanner;
public class Bai3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh của khối lập phương: ");
        double canh = scanner.nextDouble();
        double theTich = Math.pow(canh, 3);
        System.out.printf("Thể tích của khối lập phương: %.1f\n", theTich);
    }
}
