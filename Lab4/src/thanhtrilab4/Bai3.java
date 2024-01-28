package thanhtrilab4;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham("Sản phẩm 1", 100.0, 10.0);
        SanPham sp2 = new SanPham("Sản phẩm 2", 150.0);

        System.out.println("Thông tin sản phẩm 1:");
        sp1.xuat();

        System.out.println("Thông tin sản phẩm 2:");
        sp2.xuat();
    }

    public static class SanPham {
        private String tenSp;
        private double donGia;
        private double giamGia;

        public SanPham(String tenSp, double donGia, double giamGia) {
            this.tenSp = tenSp;
            this.donGia = donGia;
            this.giamGia = giamGia;
        }

        public SanPham(String tenSp, double donGia) {
            this(tenSp, donGia, 0);
        }

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
