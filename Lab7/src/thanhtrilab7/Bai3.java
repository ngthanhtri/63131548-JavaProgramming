package thanhtrilab7;

public class Bai3 {
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

}
