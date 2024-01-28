package thanhtrilab6;
import java.util.Scanner;
public class Bai1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ và tên: ");
        String fullName = scanner.nextLine();

        String ho, tenDem, ten;
        ho = fullName.substring(0, fullName.indexOf(' ')).toUpperCase();
        ten = fullName.substring(fullName.lastIndexOf(' ') + 1).toUpperCase();
        tenDem = fullName.substring(fullName.indexOf(' ') + 1, fullName.lastIndexOf(' '));

        System.out.println("Họ: " + ho);
        System.out.println("Tên đệm: " + tenDem);
        System.out.println("Tên: " + ten);
    }
}
