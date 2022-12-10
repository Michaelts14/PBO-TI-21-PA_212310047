import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Latihan03 extends JFrame{
	private  JLabel email, password, ibik;
	private JCheckBox remember;
	private JTextField textemail;
	private JPasswordField textpassword;
	private JButton btn_submit;
	
	Latihan03() {
		setTitle("Latihan 03");
		setLocationRelativeTo(null);
		setVisible(true);
		pack();
		setResizable(false);
		setSize(300, 350);
		GenerateUI(this);
		setLayout(null);
	}
	public static void main(String[] args) {
		new Latihan03();
	}
	
	private void GenerateUI(JFrame frame) {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		frame.setContentPane(mainPanel);
		
		email = new JLabel("email");
		textemail = new JTextField();
		textemail.setBounds(100, 20, 160, 30);
		email.setBounds(20, 20, 80, 30);
		frame.add(email); frame.add(textemail);
		
		password = new  JLabel("password");
		textpassword = new JPasswordField();
		textpassword.setBounds(100, 80, 160, 30);
		password.setBounds(20, 75, 80, 30);
		frame.add(password); frame.add(textpassword);
		
		remember = new JCheckBox("REMEMBER ACCOUNT? ");
		remember.setBounds(75, 130, 200, 30);
		frame.add(remember);
		
		btn_submit = new JButton("SUBMIT");
		btn_submit.setBounds(75, 180, 150, 30);
		frame.add(btn_submit);
		
		btn_submit.addActionListener(new ActionListener () {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(textemail.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "isi data dengan benar!", "PERINGATAN", JOptionPane.WARNING_MESSAGE);
				}
				else {
					if(e.getSource() == btn_submit) {
						JOptionPane.showMessageDialog(null, "welcome user!", "informasi", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
			
		});
		
		
	}
}