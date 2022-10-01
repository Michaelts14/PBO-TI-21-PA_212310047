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

public class Latihan04 extends JFrame {

	private JPanel contentPane;
	private JTextField tfHasil;
	private JTextField tfangka;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Latihan04 frame = new Latihan04();
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
	public Latihan04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbNF = new JLabel("Nilai Faktorisasi");
		lbNF.setBounds(160, 10, 115, 25);
		lbNF.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		contentPane.add(lbNF);
		
		tfHasil = new JTextField();
		tfHasil.setBounds(10, 120, 416, 132);
		contentPane.add(tfHasil);
		tfHasil.setColumns(10);
		
		JLabel lbMA = new JLabel("Masukan Angka    = ");
		lbMA.setBounds(10, 65, 123, 14);
		contentPane.add(lbMA);
		
		tfangka = new JTextField();
		tfangka.setColumns(10);
		tfangka.setBounds(135, 62, 65, 20);
		contentPane.add(tfangka);
		
		JButton btnH = new JButton("Hitung");
		btnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int angka = Integer.parseInt(tfangka.getText());
				String result = "Hasil Faktorisasi dari "+angka+" =";
				
				for (int i = angka; i>0; i--) {
					if (angka%i == 0) {
						String koma = (i>1)?",":".";
						result += " "+i+koma;
					}
				}
				tfHasil.setText(result);
			}
		});
		btnH.setBounds(134, 91, 82, 18);
		contentPane.add(btnH);
		
		JLabel lbWarning = new JLabel("");
		lbWarning.setBounds(197, 65, 229, 14);
		contentPane.add(lbWarning);
	
	}
}