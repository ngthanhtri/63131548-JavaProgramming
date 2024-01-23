package thanhtrilab1;
import java.util.Scanner;
public class Bai4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("Delta là số âm, không thể tính căn bậc 2");
        } else {
            double canDelta = Math.sqrt(delta);
            System.out.printf("Căn delta: %.1f\n", canDelta);
        }
    }
}
