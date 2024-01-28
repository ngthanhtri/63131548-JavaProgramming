package thanhtrilab5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Bai2 {
	public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        ArrayList<String> danhSachHoTen = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Nhập danh sách họ và tên");
            System.out.println("2. Xuất danh sách vừa nhập");
            System.out.println("3. Xuất danh sách ngẫu nhiên");
            System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
            System.out.println("5. Tìm và xóa họ tên");
            System.out.println("6. Kết thúc");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    nhap(danhSachHoTen, scanner);
                    break;
                case 2:
                    xuat(danhSachHoTen);
                    break;
                case 3:
                    ngaunhien(danhSachHoTen);
                    break;
                case 4:
                    sapxep(danhSachHoTen);
                    break;
                case 5:
                    xoa(danhSachHoTen, scanner);
                    break;
                case 6:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ.");
            }
        } while (choice != 6);
    }

    public static void nhap(ArrayList<String> danhSach, Scanner scanner) {
        scanner.nextLine();
        while (true) {
            System.out.print("Nhập họ và tên (hoặc nhập 'KETTHUC' để kết thúc): ");
            String hoTen = scanner.nextLine();
            if (hoTen.equalsIgnoreCase("KETTHUC")) {
                break;
            }
            danhSach.add(hoTen);
        }
    }

    public static void xuat(ArrayList<String> danhSach) {
        for (String ten : danhSach) {
            System.out.println(ten);
        }
    }

    public static void ngaunhien(ArrayList<String> danhSach) {
        Collections.shuffle(danhSach);
        xuat(danhSach);
    }

    public static void sapxep(ArrayList<String> danhSach) {
        Collections.sort(danhSach, Collections.reverseOrder());
        xuat(danhSach);
    }

    public static void xoa(ArrayList<String> danhSach, Scanner scanner) {
        scanner.nextLine();
        System.out.print("Nhập tên cần xóa: ");
        String tenCanXoa = scanner.nextLine();
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).equals(tenCanXoa)) {
                danhSach.remove(i);
                break;
            }
        }
        xuat(danhSach);
    }
}
