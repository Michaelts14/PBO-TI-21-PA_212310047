import javax.swing.JOptionPane;

public class latihan7 {
	public static void main(String[] args) {
		int baris =2;
		int kolom =2;
		
		int matriksA[][]= new int[baris][kolom];
		int matriksB[][]= new int[baris][kolom];
		int hasil1[][] = new int[baris][kolom];
		
		JOptionPane.showMessageDialog(null, "==== Matriks A ====");
		for(int i =0; i<matriksA.length; i++) {
			for(int j=0; j<matriksA.length; j++) {
				matriksA[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,"Masukkan angka: ","Matriks A ke-["+i+"]"+"["+j+"]",JOptionPane.QUESTION_MESSAGE));
			}
		}
		
		JOptionPane.showMessageDialog(null, "==== Matriks B ====");
		for(int i =0; i<matriksB.length; i++) {
			for(int j=0; j<matriksB.length; j++) {
				matriksB[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,"Masukkan angka: ", "Matriks B ke-["+i+"]"+"["+j+"]", JOptionPane.QUESTION_MESSAGE));
			}
		}
		
		JOptionPane.showMessageDialog(null, "==== Hasil ====");
		for(int i =0; i<hasil1.length; i++) {
			for(int j=0; j<hasil1.length; j++) {
				hasil1[i][j] = matriksA[i][j] - matriksB[i][j];				
			}
		}
	            
		//OUTPUT
		String outputA="Matriks A: \n";
		for(int i=0; i<matriksA.length;i++) {
			for(int j=0;j<matriksA.length; j++) {
				outputA += matriksA[i][j] + " ";
			}
			outputA += "\n";
		}
		
		String outputB="Matriks B: \n";
		for(int i=0; i<matriksB.length;i++) {
			for(int j=0;j<matriksB.length; j++) {
				outputB += matriksB[i][j] + " ";
			}
			outputB += "\n";
		}
		
		String output1="Pengurangan Matriks A: \n";
		for(int i=0; i<hasil1.length;i++) {
			for(int j=0;j<hasil1.length; j++) {
				output1 += hasil1[i][j] + " ";
			}
			output1 += "\n";
		}
		JOptionPane.showMessageDialog(null, outputA+outputB+output1);
	}
}