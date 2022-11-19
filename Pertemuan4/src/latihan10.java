import java.util.ArrayList;
import javax.swing.JOptionPane;

public class latihan10 {

public static void main(String[] args) {
		
		String out = "";
		ArrayList<String> field = new ArrayList<String>();
		field.add("Nama Lengkap: ");
		field.add("Alamat: ");
		field.add("No Telp: ");
		ArrayList<String> isi = new ArrayList<String>();
		
		for (int i = 0; i < 3; i++) {
			String in =  JOptionPane.showInputDialog(null, field.get(i), "Data array ke-" + i, JOptionPane.QUESTION_MESSAGE);
			isi.add(in + "\n");
			out += field.get(i) + isi.get(i);
		}
	
		JOptionPane.showMessageDialog(null, out , "Output Array", JOptionPane.INFORMATION_MESSAGE);
		
	}
}