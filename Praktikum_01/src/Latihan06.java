import java.util.Scanner;

public class Latihan06 {
		  
	public static void main(String[] args) {
     		
		Scanner input = new Scanner (System.in);
		System.out.println("Masukan usia : ");
		String Usia = input.nextLine();
		System.out.println("Masukan first name : ");
		String Firstname = input.nextLine();
		System.out.println("Masukan last name : ");
		String Lastname = input.nextLine();
		System.out.println("Masukan NPM : ");
		String NPM = input.nextLine();
		input.close();
	 
	    String Output = Usia.concat(Firstname).concat(Lastname).concat(NPM);
	    System.out.println("Output = " + Output);
	}
}