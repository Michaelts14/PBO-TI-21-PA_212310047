import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Latihan06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        LocalDateTime waktuSekarang = LocalDateTime.now();		        DateTimeFormatter formatWaktu = DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)");
		String waktu = waktuSekarang.format(formatWaktu);
		        
	    double hNas = 22.;
        double hBur = 15.;
        double hSoto = 25;

	    for (int i=1; i<=80; i++)
	   	System.out.print("=");
	    System.out.println("\n"+waktu);
	    System.out.println("\n\t\t\t\tMenu Sarapan\n");
	    System.out.println("1. Nasi Goreng\n2. Bubur Ayam\n3. Soto Ayam");
	    for (int i=1; i<=80; i++)
		System.out.print("=");	   
	    
	    int pilihMenu;
	    String jwb;
	    
	    do {
	    System.out.print("\nPilih Menu = ");
	    pilihMenu = input.nextInt();
		        
	    if(pilihMenu == 1) {
	    	System.out.println("Anda memesan Nasi Goreng dengan harga Rp."+hNas+"00");	
	    } else if(pilihMenu == 2) {
	    	System.out.println("Anda memesan Bubur Ayam dengan harga Rp."+hBur+"00");
	    } else if(pilihMenu == 3) {
	    	System.out.println("Anda memesan Soto ayam dengan harga Rp."+hSoto+"00");
	    } else{
	    	System.out.println("Maaf menu yang anda masukan salah");
	    }
	    
	    System.out.print("Apakah anda akan memesan kembali ? (Y/N)= ");
	    jwb = input.next();
	    }while (jwb.equals("Y"));
	    
	    input.close();
    	}
	
}