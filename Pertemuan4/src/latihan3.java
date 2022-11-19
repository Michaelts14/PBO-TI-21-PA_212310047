import javax.swing.JOptionPane;

public class latihan3 {

	public static void main(String[] args) {
		
		String out = "";
		int jml = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan jumlah array: ", "Input", JOptionPane.QUESTION_MESSAGE));
		int[] num = new int[jml];
		
		for (int i = 0; i < jml; i++) {
			num[i] =  Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan angka : ", "Data array ke-" + i, JOptionPane.QUESTION_MESSAGE));
			out += "x[" + i + "]=" + num[i] + "\n";
			}

		JOptionPane.showMessageDialog(null, out , "Output Array", JOptionPane.INFORMATION_MESSAGE);
		
	}
}