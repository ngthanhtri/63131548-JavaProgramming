package thanhtrilab3;
import java.util.Scanner;
public class Bai4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();

        String[] hoTen = new String[n];
        double[] diem = new double[n];
        String[] hocLuc = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập họ tên sinh viên thứ %d: ",i+1);
            hoTen[i] = scanner.next();
            System.out.printf("Nhập điểm của sinh viên thứ %d: ",i+1);
            diem[i] = scanner.nextDouble();

            if (diem[i] < 5) {
                hocLuc[i] = "Yếu";
            } else if (diem[i] < 6.5) {
                hocLuc[i] = "Trung bình";
            } else if (diem[i] < 7.5) {
                hocLuc[i] = "Khá";
            } else if (diem[i] < 9) {
                hocLuc[i] = "Giỏi";
            } else {
                hocLuc[i] = "Xuất sắc";
            }
        }

        System.out.println("Thông tin sinh viên và học lực:");
        for (int i = 0; i < n; i++) {
            System.out.println("Họ tên: " + hoTen[i]);
            System.out.println("Điểm: " + diem[i]);
            System.out.println("Học lực: " + hocLuc[i]);
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (diem[i] > diem[j]) {

                    String tempName = hoTen[i];
                    hoTen[i] = hoTen[j];
                    hoTen[j] = tempName;

                    double tempScore = diem[i];
                    diem[i] = diem[j];
                    diem[j] = tempScore;

                    String tempGrade = hocLuc[i];
                    hocLuc[i] = hocLuc[j];
                    hocLuc[j] = tempGrade;
                }
            }
        }

        System.out.println("Danh sách sinh viên sau khi sắp xếp tăng dần theo điểm:");
        for (int i = 0; i < n; i++) {
            System.out.println("Họ tên: " + hoTen[i] + ", Điểm: " + diem[i] + ", Học lực: " + hocLuc[i]);
        }
    }
}
