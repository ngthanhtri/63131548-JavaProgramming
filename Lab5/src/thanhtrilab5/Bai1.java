package thanhtrilab5;
import java.util.Scanner;
import java.util.ArrayList;
public class Bai1 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ArrayList<Double> list = new ArrayList<>();

	        while (true) {
	            System.out.print("Nhập số thực (nhập 'N' để kết thúc): ");
	            if (scanner.hasNextDouble()) {
	                double x = scanner.nextDouble();
	                list.add(x);
	            } else {
	                String input = scanner.next();
	                if (input.equalsIgnoreCase("N")) {
	                    break;
	                }
	            }
	        }

	        System.out.println("Danh sách số thực vừa nhập:");
	        for (double num : list) {
	            System.out.println(num);
	        }

	        double sum = 0;
	        for (double num : list) {
	            sum += num;
	        }
	        System.out.println("Tổng của danh sách: " + sum);
	    }
}
