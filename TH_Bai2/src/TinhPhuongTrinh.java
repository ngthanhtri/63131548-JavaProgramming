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

public class TinhPhuongTrinh extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtKetQua;

	
	public TinhPhuongTrinh() {
		setTitle("Phương trình bậc 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số a:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(40, 29, 84, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSB = new JLabel("Nhập số b:");
		lblNhpSB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSB.setBounds(40, 91, 84, 37);
		contentPane.add(lblNhpSB);
		
		JLabel lblNhpSC = new JLabel("Nhập số c:");
		lblNhpSC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSC.setBounds(40, 162, 84, 37);
		contentPane.add(lblNhpSC);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setBounds(134, 37, 110, 19);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(134, 102, 110, 19);
		contentPane.add(txtB);
		
		txtC = new JTextField();
		txtC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtC.setColumns(10);
		txtC.setBounds(134, 173, 110, 19);
		contentPane.add(txtC);
		
		JLabel lblAb = new JLabel("a^2 +bx+c=0");
		lblAb.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAb.setBounds(160, 0, 158, 37);
		contentPane.add(lblAb);
		
		JLabel lblKtQu = new JLabel("Kết quả");
		lblKtQu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQu.setBounds(40, 237, 84, 37);
		contentPane.add(lblKtQu);
		
		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKetQua.setColumns(10);
		txtKetQua.setBounds(134, 248, 184, 19);
		contentPane.add(txtKetQua);
		
		JButton btnTinh = new JButton("Tính");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//tinh pt bac 2
				HamTinhPT();
			}
		});
		btnTinh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTinh.setBounds(350, 162, 85, 21);
		contentPane.add(btnTinh);
	}
	void HamTinhPT(){
		String str_soA = txtA.getText();
	    String str_soB = txtB.getText();
	    String str_soC = txtC.getText();
	    
	    double soA = Double.parseDouble(str_soA);
	    double soB = Double.parseDouble(str_soB);
	    double soC = Double.parseDouble(str_soC);
	    
	    double delta = soB * soB - 4 * soA * soC;
	    
	    if (delta < 0) {
	        txtKetQua.setText("PT vô nghiệm");
	    } else if (delta == 0) {
	        double x = -soB / (2 * soA);
	        txtKetQua.setText("PT có nghiệm kép: x = " + x);
	    } else {
	        double x1 = (-soB + Math.sqrt(delta)) / (2 * soA);
	        double x2 = (-soB - Math.sqrt(delta)) / (2 * soA);
	        txtKetQua.setText("PT có 2 nghiệm: x1 = " + x1 + ", x2 = " + x2);
	    }
	}
}