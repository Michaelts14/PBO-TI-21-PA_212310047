import java.util.Scanner;

public class Latihan07 {
	public static void main(String[] args) {
		String nama;
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan nama lengkap : ");
		nama = input.nextLine();

		System.out.println("\nNama awal = " +nama);
		System.out.println("Nama baru = " +nama.replaceAll("[aiueo]", "X"));
	
		input.close();
	}
}

