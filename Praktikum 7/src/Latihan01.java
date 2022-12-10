import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Latihan01 extends JFrame {
	Latihan01() {
	      setVisible(true);
	      pack();
	      setSize(300,300);
	      setLocationRelativeTo(null);
	      setTitle("Latihan 01");
	      GenerateMenuButton(this);
	}
    public static void main( String[] args )
    {
      new Latihan01();
      
 
    }
    private void GenerateMenuButton(JFrame frame) {
        JPanel upperPanel = new JPanel();
        JButton btn_hello = new JButton("selamat datang");
        JButton btn_halo = new JButton("Hello");

        btn_hello.setSize(100, 50);
        btn_halo.setSize(100, 50);

        upperPanel.add(btn_halo);
        upperPanel.add(btn_hello);

        JPanel bottomPanel = new JPanel();
        JButton btn_ibik = new JButton("IBIK");

        btn_ibik.setSize(100, 50);
        bottomPanel.add(btn_ibik);

        btn_hello.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "it means 'welcome' in english");
			}
        	
        });
        btn_halo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "it means 'konnichiwa' in japanese");
			}
        	
        });
        btn_ibik.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "hello ibik");
			}
        	
        });

        frame.add(upperPanel, BorderLayout.NORTH);
        frame.add(bottomPanel, BorderLayout.SOUTH);
    }
}
