import java.util.ArrayList;
import javax.swing.JOptionPane;

public class latihan9 {

public static void main(String[] args) {
		
		String out = "";
		int jml = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan jumlah array: ", "Input", JOptionPane.QUESTION_MESSAGE));
		ArrayList<Integer> num = new ArrayList<Integer>();
		int max = 0;
		
		for (int i = 0; i < jml; i++) {
			int isi =  Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan angka : ", "Data array ke-" + i, JOptionPane.QUESTION_MESSAGE));
			num.add(i, isi);
			out += "x[" + i + "]=" + isi + "\n";
			if (max < isi) {
				max = isi;
			}
		}
		
		int min = max;
		for(int j = 0; j < jml; j++){  
			  if(num.get(j) < min){  
			    min = num.get(j);  
			  }  
		} 

		out += "Nilai terbesar adalah " + max + "\n";
		out += "Nilai terkecil adalah " + min;
		JOptionPane.showMessageDialog(null, out , "Output Array", JOptionPane.INFORMATION_MESSAGE);
		
	}
}