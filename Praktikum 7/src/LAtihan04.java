import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;
public class LAtihan04 extends JFrame{
	LAtihan04() {
		setVisible(true);
		pack();
		setTitle("Latihan 04");
		setSize(700, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		GenerateUI(this);
		GenerateTitle(this);
		setLayout(new FlowLayout());
		
	}
	public static void main(String args[]) {
		new LAtihan04();
	}
	private void GenerateUI(JFrame frame) {
		JMenuBar menuBar = new JMenuBar();

		 JMenu fileMenu = new JMenu("File");
		 JMenu editMenu = new JMenu("Edit");
		 JMenu helpMenu = new JMenu("Help");
		 menuBar.add(fileMenu);
		 menuBar.add(editMenu);
		 menuBar.add(helpMenu);
		 
		 JMenuItem item1 = new JMenuItem("New");
		 JMenuItem item2 = new JMenuItem("Save");
		 JMenuItem item3 = new JMenuItem("Exit");
		 fileMenu.add(item1);
		 fileMenu.add(item2);
		 fileMenu.add(item3);
		 
		 
		 
		 frame.setJMenuBar(menuBar);
		 
		 
	}
	
	private  void GenerateTitle(JFrame main) {
		JPanel upperPanel = new JPanel();
		JLabel form = new JLabel("FORM PENILAIAN MATA KULIAH PBO");
		 form.setSize(150, 50);
		 upperPanel.add(form);
		 
		 JPanel westPanel = new JPanel();
		 JLabel mhs = new JLabel("Nama Mahasiswa");
		 mhs.setSize(150, 50);
		 westPanel.add(mhs);
		 
		 JLabel npm = new JLabel("NPM");
		 npm.setSize(175, 50);
		 westPanel.add(npm);
		 
		 JTextField textNpm = new JTextField();
		 textNpm.setBounds(20, 100, 160, 30);
		 westPanel.add(textNpm);
		 
		 
		 main.add(upperPanel, BorderLayout.NORTH);
		 main.add(westPanel, BorderLayout.WEST);
		 
		 
//		 main.add(panel1); main.add(panel2);
//		 main.add(panel3);
		
	}
}