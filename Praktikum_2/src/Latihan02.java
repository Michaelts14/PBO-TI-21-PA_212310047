import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Window.Type;
import java.awt.Font;

public class Latihan02 extends JFrame {

	private JPanel contentPane;
	private JTextField tfName;
	private JLabel lbWelcome;
	private JTextField tfNPM;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Latihan02 frame = new Latihan02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Latihan02() {
		setType(Type.UTILITY);
		setBackground(new Color(255, 240, 245));
		setTitle("Welcome");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 304);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.PLAIN, 11));
		lblNewLabel.setBounds(10, 35, 49, 14);
		contentPane.add(lblNewLabel);
		
		tfName = new JTextField();
		tfName.setFont(new Font("Bookman Old Style", Font.PLAIN, 11));
		tfName.setBounds(101, 32, 129, 20);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		JLabel lbhasil = new JLabel("");
		lbhasil.setFont(new Font("Bookman Old Style", Font.PLAIN, 11));
		lbhasil.setBounds(10, 174, 706, 59);
		contentPane.add(lbhasil);
		
		lbWelcome = new JLabel("");
		lbWelcome.setFont(new Font("Bookman Old Style", Font.BOLD, 19));
		lbWelcome.setBounds(10, 140, 407, 31);
		contentPane.add(lbWelcome);
		
		JButton btnOK = new JButton("OK");
		btnOK.setFont(new Font("Bookman Old Style", Font.PLAIN, 11));
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nama = tfName.getText();
				lbWelcome.setText("Hello ! " + nama);
				
				String NPM = tfNPM.getText();
			    int NPMb = Integer.valueOf(tfNPM.getText());
				
				if (NPMb == 0 || NPMb == 1) {
					lbhasil.setText("NPM kamu " + NPM + " Termasuk bilangan PRIMA");
				} 
				else {
					for (int i = 2; i<=NPMb/2; i++) {
						if (NPMb % i == 0) {
							lbhasil.setText("NPM kamu "+NPM+" Bukan termasuk bilangan PRIMA"
									+ "\nkarena dapat dibagi dengan 2 ");
							break;
						}
					}
				}
			}
		});
		btnOK.setBounds(10, 233, 425, 23);
		contentPane.add(btnOK);
		
		JLabel lbMasukanNPM = new JLabel("Masukan NPM");
		lbMasukanNPM.setFont(new Font("Bookman Old Style", Font.PLAIN, 11));
		lbMasukanNPM.setBounds(10, 68, 174, 14);
		contentPane.add(lbMasukanNPM);
		
		tfNPM = new JTextField();
		tfNPM.setFont(new Font("Bookman Old Style", Font.PLAIN, 11));
		tfNPM.setBounds(101, 65, 129, 20);
		contentPane.add(tfNPM);
		tfNPM.setColumns(10);
		
		Canvas canvas = new Canvas();
		canvas.setForeground(new Color(255, 240, 245));
		canvas.setFont(UIManager.getFont("Tree.font"));
		canvas.setBackground(new Color(255, 182, 193));
		canvas.setBounds(317, 22, 100, 100);
		contentPane.add(canvas);
		
	}
}