import java.util.Scanner;


public class Latihan06 {
	public static void main(String[] args) {
		
	String Firstname, Lastname, Usia, NPM;
	Scanner input = new Scanner(System.in);
	
	System.out.print("Masukan Usia : ");
	Usia = input.nextLine();
		
	System.out.print("\nMasukan Firstname : ");
	Firstname = input.nextLine();

	System.out.print("\nMasukan Lastname : ");
	Lastname = input.nextLine();
		
	System.out.print("\nMasukan NPM : ");
	NPM = input.nextLine();
		
	String Output = Usia.concat(Firstname).concat(Lastname).concat(NPM);
    System.out.println("Output = " + Output);
    
    input.close();
	}
}
