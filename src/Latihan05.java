import java.util.Scanner;

public class Latihan05 {
	public static void main(String[] args) {
		String kalimat;
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan kalimat : ");
		kalimat = input.nextLine();
		
		System.out.println("\nKalimat awal = " +kalimat);
		System.out.println("\nKalimat baru = " + kalimat.toUpperCase());
	
		input.close();

	}
}
