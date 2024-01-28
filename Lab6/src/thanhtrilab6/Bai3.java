package thanhtrilab6;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Bai3 {
	public static void main(String[] args) {
        ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            SinhVien sv = new SinhVien();
            sv.nhap();
            danhSachSinhVien.add(sv);
        }
    }
}
class SinhVien {
    String hoTen;
    String email;
    String soDienThoai;
    String cmnd;

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ tên: ");
        hoTen = scanner.nextLine();
        System.out.println("Nhập email: ");
        while (true) {
            email = scanner.nextLine();
            if (Pattern.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", email)) {
                break;
            } else {
                System.out.println("Email không hợp lệ. Vui lòng nhập lại: ");
            }
        }
        System.out.println("Nhập số điện thoại: ");
        while (true) {
            soDienThoai = scanner.nextLine();
            if (Pattern.matches("0\\d{9,10}", soDienThoai)) {
                break;
            } else {
                System.out.println("Số điện thoại không hợp lệ. Vui lòng nhập lại: ");
            }
        }
        System.out.println("Nhập CMND: ");
        while (true) {
            cmnd = scanner.nextLine();
            if (Pattern.matches("\\d{9,12}", cmnd)) {
                break;
            } else {
                System.out.println("CMND không hợp lệ. Vui lòng nhập lại: ");
            }
        }
    }
}