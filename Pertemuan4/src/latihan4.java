import javax.swing.JOptionPane;

public class latihan4 {

	public static void main(String[] args) {
		
		String out = "";
		int jml = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan jumlah array: ", "Input", JOptionPane.QUESTION_MESSAGE));
		int[] num = new int[jml];
		int max = 0;
		
		for (int i = 0; i < jml; i++) {
			num[i] =  Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan angka : ", "Data array ke-" + i, JOptionPane.QUESTION_MESSAGE));
			out += "x[" + i + "]=" + num[i] + "\n";
			if (max < num[i]) {
				max = num[i];
			}
		}
		
		int min = max;
		for(int j = 0; j < jml; j++){  
			  if(num[j] < min){  
			    min = num[j];  
			  }  
		} 

		out += "Nilai terbesar adalah " + max + "\n";
		out += "Nilai terkecil adalah " + min;
		JOptionPane.showMessageDialog(null, out , "Output Array", JOptionPane.INFORMATION_MESSAGE);
		
	}
}