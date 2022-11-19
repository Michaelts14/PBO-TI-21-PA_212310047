import javax.swing.JOptionPane;

public class latihan5 {

	public static void main(String[] args) {
		
		String out = "";
		String field[] = {"Nama Lengkap: ", "Alamat: ", "No Telp: "};
		String isi[] = {"","",""};
		
		for (int i = 0; i < field.length; i++) {
			String in =  JOptionPane.showInputDialog(null, field[i], "Data array ke-" + i, JOptionPane.QUESTION_MESSAGE);
			isi[i] = in + "\n";
			out += field[i] + isi[i];
		}
	
		JOptionPane.showMessageDialog(null, out , "Output Array", JOptionPane.INFORMATION_MESSAGE);
		
	}
}