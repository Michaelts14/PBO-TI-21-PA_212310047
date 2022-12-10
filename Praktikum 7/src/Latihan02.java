
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Latihan02 extends JFrame {
	Latihan02() {
		setTitle("Latihan 02");
		setVisible(true);
		pack();
		setSize(350,450);
		setLocationRelativeTo(null);
		setResizable(false);
		GenerateUI(this);
		setLayout(null);
		
	}
	public static void main(String [] args) {
		new Latihan02();
	}
	
	private void GenerateUI(JFrame frame) {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		frame.setContentPane(mainPanel);
		
		final JLabel fullName = new JLabel("Fullname");
		fullName.setBounds(20, 20, 80, 30);
		frame.add(fullName, BorderLayout.WEST);
		
		final JTextField textFullName = new JTextField();
		textFullName.setBounds(100, 20, 160, 30);
		frame.add(textFullName);
		
		final JLabel email = new JLabel("email");
		email.setBounds(20, 75, 80, 30);
		frame.add(email, BorderLayout.WEST);
		
		final JTextField textEmail = new JTextField();
		textEmail.setBounds(100, 75, 160, 30);
		frame.add(textEmail);
		
		final JLabel phone = new JLabel("phone");
		phone.setBounds(20, 130, 80, 30);
		frame.add(phone, BorderLayout.WEST);
		
		final JTextField textPhone = new JTextField();
		textPhone.setBounds(100, 130, 160, 30);
		frame.add(textPhone);
		
		JLabel gender = new JLabel("gender");
		gender.setBounds(20,175, 80, 30);
		frame.add(gender, BorderLayout.WEST);
		
		final JRadioButton radioGender1 = new JRadioButton("female");
		radioGender1.setBounds(105, 175, 100, 30);
		frame.add(radioGender1);
		
		final JRadioButton radioGender2 = new JRadioButton("male");
		radioGender2.setBounds(200, 175, 100, 30);
		frame.add(radioGender2);
		
		JLabel citizenship = new JLabel("citizenship");
		citizenship.setBounds(20, 215, 80, 30);
		frame.add(citizenship, BorderLayout.WEST);
		
		String country[] = {"Indonesia", "India", "Australia", "Japan", "USA"};
		final JComboBox selectCitizen = new JComboBox(country);
		selectCitizen.setBounds(100, 215, 169, 30);
		frame.add(selectCitizen);
		
		final JButton btn_submit = new JButton("SUBMIT");
		btn_submit.setBounds(100, 260, 169, 30);
		frame.add(btn_submit);
		
		btn_submit.addActionListener(new ActionListener () {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(textFullName.getText().isEmpty() || textEmail.getText().isEmpty() || textPhone.getText().isEmpty() || (!radioGender1.isSelected() && !radioGender2.isSelected())) {
					JOptionPane.showMessageDialog(null, "isi data dengan benar!", "PERINGATAN", JOptionPane.WARNING_MESSAGE);
				}
				else {
					if(e.getSource() == btn_submit) {
						String output = "BIODATA \n \n";
						String outputKelamin = "";
						
						if(radioGender1.isSelected()) {
							outputKelamin = radioGender1.getText();
							output += "Nama lengkap : " + textFullName.getText() + "\n" + "email : " + textEmail.getText() + "\n" + "No. Telp : " + textPhone.getText() + "\n" + "jenis kelamin : " + outputKelamin + "\n" + "asal negara : " + selectCitizen.getSelectedItem();
						}
						else {
							outputKelamin = radioGender2.getText();
							output += "Nama lengkap : " + textFullName.getText() + "\n" + "email : " + textEmail.getText() + "\n" + "No. Telp : " + textPhone.getText() + "\n" + "jenis kelamin : " + outputKelamin + "\n" + "asal negara : " + selectCitizen.getSelectedItem();

						}
						
						JOptionPane.showMessageDialog(null, output);
					}
				}
			}
			
		});
	}
}