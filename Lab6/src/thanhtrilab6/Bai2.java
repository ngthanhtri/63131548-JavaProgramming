package thanhtrilab6;
import java.util.Scanner;
import java.util.ArrayList;
public class Bai2 {
	public static void main(String[] args) {
        ArrayList<SanPham> danhSachSanPham = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin sản phẩm thứ " + (i + 1) + ":");
            SanPham sp = new SanPham();
            sp.nhap();
            danhSachSanPham.add(sp);
        }

        System.out.println("Các sản phẩm có hãng là Nokia:");
        for (SanPham sp : danhSachSanPham) {
            if (sp.hang.equalsIgnoreCase("Nokia")) {
                sp.xuat();
            }
        }
    }
}
class SanPham {
    String tenSp;
    double donGia;
    String hang;

    public void xuat() {
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Hãng: " + hang);
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm: ");
        tenSp = scanner.nextLine();
        System.out.println("Nhập đơn giá: ");
        donGia = scanner.nextDouble();
        scanner.nextLine(); // Clear the input buffer
        System.out.println("Nhập hãng: ");
        hang = scanner.nextLine();
    }
}