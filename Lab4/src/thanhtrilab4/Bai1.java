package thanhtrilab4;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        SanPham sp = new SanPham();
        sp.nhap();
        sp.xuat();
    }

    public static class SanPham {
        private String tenSp;
        private double donGia;
        private double giamGia;

        public double getThueNhapKhau() {
            return 0.1 * donGia;
        }

        public void xuat() {
            System.out.println("Tên sản phẩm: " + tenSp);
            System.out.println("Đơn giá: " + donGia);
            System.out.println("Giảm giá: " + giamGia);
            System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
        }

        public void nhap() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập tên sản phẩm: ");
            tenSp = scanner.nextLine();
            System.out.print("Nhập đơn giá: ");
            donGia = scanner.nextDouble();
            System.out.print("Nhập giảm giá: ");
            giamGia = scanner.nextDouble();
        }
    }
}
