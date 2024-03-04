package thanhtribai0;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKetQua;
	
	public ManHinhTinhToan() {
		setTitle("Chương trình tính toán");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ nhất (a):");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(30, 31, 168, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ hai (b):");
		lblNhpSTh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSTh.setBounds(30, 97, 168, 40);
		contentPane.add(lblNhpSTh);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setBounds(193, 44, 128, 19);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(193, 107, 128, 19);
		contentPane.add(txtB);
		
		JButton btnCong = new JButton("Cộng");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//code xu ly cong
				HamXulyCong();
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCong.setBounds(30, 150, 85, 21);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("Trừ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code xy ly tru
				HamXulyTru();
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTru.setBounds(133, 152, 85, 21);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("Nhân");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code xu ly nhan
				HamXuLyNhan();
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNhan.setBounds(250, 152, 85, 21);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("Chia");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code xu ly chia
				HamXuLyChia();
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChia.setBounds(345, 152, 85, 21);
		contentPane.add(btnChia);
		
		JLabel lblKtQu = new JLabel("Kết quả:");
		lblKtQu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQu.setBounds(30, 198, 71, 40);
		contentPane.add(lblKtQu);
		
		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKetQua.setColumns(10);
		txtKetQua.setBounds(102, 208, 139, 19);
		contentPane.add(txtKetQua);
	}//het ham tao
	void HamXulyCong() {
		String str_soA = txtA.getText() ;
		String str_soB = txtB.getText() ;
		
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		
		double tong = soA + soB;
		
		txtKetQua.setText( String.valueOf(tong));
	}
	void HamXulyTru() {
		String str_soA = txtA.getText() ;
		String str_soB = txtB.getText() ;
		
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		
		double hieu = soA - soB;
		
		txtKetQua.setText( String.valueOf(hieu));
	}
	void HamXuLyNhan() {
		String str_soA = txtA.getText() ;
		String str_soB = txtB.getText() ;
		
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		
		double tich = soA * soB;
		
		txtKetQua.setText( String.valueOf(tich));
	}
	void HamXuLyChia() {
		String str_soA = txtA.getText() ;
		String str_soB = txtB.getText() ;
		
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		
		if (soB == 0) {
	        txtKetQua.setText("Lỗi: Không thể chia cho 0");
	    } else {
	        double thuong = soA / soB;
	        txtKetQua.setText(String.valueOf(thuong));
	    }
	}
}
