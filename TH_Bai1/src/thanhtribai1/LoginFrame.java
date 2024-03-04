package thanhtribai1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDangNhap;
	private JPasswordField txtMatKhau;

	
	public LoginFrame() {
		setTitle("Đăng nhập hệ thống");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 521);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tên đăng nhập:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 32, 132, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("Mật khẩu:");
		lblMtKhu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMtKhu.setBounds(33, 83, 132, 13);
		contentPane.add(lblMtKhu);
		
		txtDangNhap = new JTextField();
		txtDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtDangNhap.setBounds(140, 28, 158, 19);
		contentPane.add(txtDangNhap);
		txtDangNhap.setColumns(10);
		
		txtMatKhau = new JPasswordField();
		txtMatKhau.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtMatKhau.setBounds(140, 79, 158, 19);
		contentPane.add(txtMatKhau);
		
		JButton btnDangNhap = new JButton("ĐĂNG NHẬP");
		btnDangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyDangNhap();
			}
		});
		btnDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDangNhap.setBounds(140, 134, 132, 21);
		contentPane.add(btnDangNhap);
	}
	void XuLyDangNhap(){
		String strTen = txtDangNhap.getText();
		String strMK = txtMatKhau.getText();
		
		if ( strTen.equals("63CNTT") && strMK.equals("123")) {
			// hiện màn hình chính
			HomeFrame HomePage = new HomeFrame();
			HomePage.setVisible(true);
			// ẩn màn hình
			this.setVisible(false);
		}else { // báo lỗi đăng nhập
			txtDangNhap.setText("");
			txtMatKhau.setText("");
			JOptionPane HopThoai = new JOptionPane();
			HopThoai.showMessageDialog(this, "Đăng nhập thất bại. Vui lòng đăng nhập lại");
		}
	}
}