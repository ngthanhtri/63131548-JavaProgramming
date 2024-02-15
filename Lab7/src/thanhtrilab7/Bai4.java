package thanhtrilab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai4 {
    static ArrayList<SinhVienPoly> danhSachSinhVien = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Nhap thong tin sinh vien");
            System.out.println("2. Xuat danh sach sinh vien");
            System.out.println("3. Xuat danh sach sinh vien gioi");
            System.out.println("4. Sap xep danh sach sinh vien theo diem");
            System.out.println("5. Ket thuc chuong trinh");
            System.out.print("Lua chon cua ban: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    xuatSinhVienGioi();
                    break;
                case 4:
                    sapXep();
                    break;
                case 5:
                    System.out.println("Ket thuc chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        } while (choice != 5);
    }

    public static void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1));
            System.out.print("Ho ten: ");
            String hoTen = scanner.next();
            System.out.print("Nganh (IT/Biz): ");
            String nganh = scanner.next();
            if (nganh.equals("IT")) {
                System.out.print("Diem Java: ");
                double diemJava = scanner.nextDouble();
                System.out.print("Diem HTML: ");
                double diemHtml = scanner.nextDouble();
                System.out.print("Diem CSS: ");
                double diemCss = scanner.nextDouble();
                SinhVienIT svIT = new SinhVienIT(hoTen, diemJava, diemHtml, diemCss);
                danhSachSinhVien.add(svIT);
            } else if (nganh.equals("Biz")) {
                System.out.print("Diem Marketing: ");
                double diemMarketing = scanner.nextDouble();
                System.out.print("Diem Sales: ");
                double diemSales = scanner.nextDouble();
                SinhVienBiz svBiz = new SinhVienBiz(hoTen, diemMarketing, diemSales);
                danhSachSinhVien.add(svBiz);
            } else {
                System.out.println("Nganh khong hop le");
            }
        }
    }

    public static void xuat() {
        for (SinhVienPoly sv : danhSachSinhVien) {
            sv.xuat();
            System.out.println("Diem: " + sv.getDiem());
            System.out.println("Hoc luc: " + sv.getHocLuc());
            System.out.println("--------------------");
        }
    }

    public static void xuatSinhVienGioi() {
        for (SinhVienPoly sv : danhSachSinhVien) {
            if (sv.getHocLuc().equals("Gioi")) {
                sv.xuat();
                System.out.println("Diem: " + sv.getDiem());
                System.out.println("Hoc luc: " + sv.getHocLuc());
                System.out.println("--------------------");
            }
        }
    }

    public static void sapXep() {
        Collections.sort(danhSachSinhVien, (sv1, sv2) -> {
            if (sv1.getDiem() < sv2.getDiem()) {
                return 1;
            } else if (sv1.getDiem() > sv2.getDiem()) {
                return -1;
            }
            return 0;
        });
        xuat();
    }
}

class SinhVienPoly {
    String hoTen;
    String nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public double getDiem() {
        return 0.0;
    }

    public String getHocLuc() {
        return "Hoc luc";
    }

    public void xuat() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Nganh: " + nganh);
    }
}

class SinhVienIT extends SinhVienPoly {
    double diemJava;
    double diemCss;
    double diemHtml;

    public SinhVienIT(String hoTen, double diemJava, double diemCss, double diemHtml) {
        super(hoTen, "IT");
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    @Override
    public double getDiem() {
        return (2 * diemJava + diemHtml + diemCss) / 4;
    }
}

class SinhVienBiz extends SinhVienPoly {
    double diemMarketing;
    double diemSales;

    public SinhVienBiz(String hoTen, double diemMarketing, double diemSales) {
        super(hoTen, "Biz");
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public double getDiem() {
        return (2 * diemMarketing + diemSales) / 3;
    }
}
