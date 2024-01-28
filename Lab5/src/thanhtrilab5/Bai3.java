package thanhtrilab5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        ArrayList<SanPham> danhSachSanPham = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Nhập danh sách sản phẩm từ bàn phím");
            System.out.println("2. Sắp xếp giảm dần theo giá và xuất ra màn hình");
            System.out.println("3. Tìm và xóa sản phẩm theo tên nhập từ bàn phím");
            System.out.println("4. Xuất giá trung bình của các sản phẩm");
            System.out.println("5. Kết thúc chương trình");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    nhap(danhSachSanPham, scanner);
                    break;
                case 2:
                    sapXepTheoGiaGiamDanVaXuat(danhSachSanPham);
                    break;
                case 3:
                    xoaSanPhamTheoTen(danhSachSanPham, scanner);
                    break;
                case 4:
                    xuatGiaTrungBinh(danhSachSanPham);
                    break;
                case 5:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ.");
            }
        } while (choice != 5);
    }

    public static void nhap(ArrayList<SanPham> danhSach, Scanner scanner) {
        System.out.print("Nhập số lượng sản phẩm: ");
        int soLuong = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhập thông tin cho sản phẩm thứ " + (i + 1) + ":");
            System.out.print("Tên sản phẩm: ");
            String tenSp = scanner.nextLine();
            System.out.print("Đơn giá: ");
            double donGia = scanner.nextDouble();
            System.out.print("Giảm giá: ");
            double giamGia = scanner.nextDouble();
            scanner.nextLine();
            SanPham sp = new SanPham(tenSp, donGia, giamGia);
            danhSach.add(sp);
        }
    }

    public static void sapXepTheoGiaGiamDanVaXuat(ArrayList<SanPham> danhSach) {
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o2.getDonGia(), o1.getDonGia());
            }
        };
        Collections.sort(danhSach, comp);
        for (SanPham sp : danhSach) {
            System.out.println(sp.getTenSp() + " - " + sp.getDonGia());
        }
    }

    public static void xoaSanPhamTheoTen(ArrayList<SanPham> danhSach, Scanner scanner) {
        System.out.print("Nhập tên sản phẩm cần xóa: ");
        String tenCanXoa = scanner.nextLine();
        danhSach.removeIf(sp -> sp.getTenSp().equals(tenCanXoa));
        for (SanPham sp : danhSach) {
            System.out.println(sp.getTenSp() + " - " + sp.getDonGia());
        }
    }

    public static void xuatGiaTrungBinh(ArrayList<SanPham> danhSach) {
        double tongGia = 0;
        for (SanPham sp : danhSach) {
            tongGia += sp.getDonGia();
        }
        double giaTrungBinh = tongGia / danhSach.size();
        System.out.println("Giá trung bình của các sản phẩm: " + giaTrungBinh);
    }
}
class SanPham {
    private String tenSp;
    private double donGia;
    private double giamGia;

    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public String getTenSp() {
        return tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }
}
