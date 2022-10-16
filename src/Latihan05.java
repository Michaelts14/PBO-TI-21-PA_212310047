import java.util.Scanner;

public class Latihan05 {
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Masukan text : ");
		String text = input.nextLine();
		System.out.println(text.toUpperCase());
		input.close();
	}
}