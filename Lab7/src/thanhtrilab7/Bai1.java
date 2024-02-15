package thanhtrilab7;
import java.util.Scanner;
public class Bai1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều dài hình chữ nhật: ");
        double daiCN = scanner.nextDouble();
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        double rongCN = scanner.nextDouble();
        System.out.print("Nhập cạnh hình vuông: ");
        double canhVuong = scanner.nextDouble();

        ChuNhat cn = new ChuNhat(daiCN, rongCN);
        Vuong vu = new Vuong(canhVuong);

        cn.xuat();
        vu.xuat();
    }
}
class ChuNhat {
    double dai;
    double rong;

    ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    double getChuVi() {
        return (dai + rong) * 2;
    }

    double getDienTich() {
        return dai * rong;
    }

    void xuat() {
        System.out.println("Chiều dài: " + dai);
        System.out.println("Chiều rộng: " + rong);
        System.out.println("Diện tích: " + getDienTich());
        System.out.println("Chu vi: " + getChuVi());
    }
}

class Vuong extends ChuNhat {
    Vuong(double canh) {
        super(canh, canh);
    }

    @Override
    void xuat() {
        System.out.println("Cạnh: " + dai);
        System.out.println("Diện tích: " + getDienTich());
        System.out.println("Chu vi: " + getChuVi());
    }
}