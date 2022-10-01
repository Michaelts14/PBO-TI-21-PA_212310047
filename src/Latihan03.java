import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
		
public class Latihan03 {
	public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
		        LocalDateTime waktuSekarang = LocalDateTime.now();
		        DateTimeFormatter formatWaktu = DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)");
		        String waktu = waktuSekarang.format(formatWaktu);
		        
		        double hNas = 22.;
		        double hBur = 15.;
		        double hSoto = 25;
//		        double jumlahBeli;
//		        double totalHarga;
//		        double diskon;
//		        double subTotal;

		        for (int i=1; i<=80; i++)
		    	System.out.print("=");
		        System.out.println("\n"+waktu);
		        System.out.println("\n\t\t\t\tMenu Sarapan\n");
		        System.out.println("1. Nasi Goreng\n2. Bubur Ayam\n3. Soto Ayam");
			    for (int i=1; i<=80; i++)
				System.out.print("=");	   
			    
		        System.out.print("\nPilih Menu = ");
		        int pilihMenu = input.nextInt();
		        
		        if(pilihMenu == 1) {
		        	 System.out.println("Anda memesan Nasi Goreng dengan harga Rp."+hNas+"00");	
		        } else if(pilihMenu == 2) {
		        	 System.out.println("Anda memesan Bubur Ayam dengan harga Rp."+hBur+"00");
		        } else if(pilihMenu == 3) {
		        	 System.out.println("Anda memesan Soto ayam dengan harga Rp."+hSoto+"00");
		        } else{
		        	 System.out.println("Maaf menu yang anda masukan salah");
		        }
		        
		        System.out.println("\nJumlahMenu = ");
//		        jumlahBeli = input.nextInt();
//		        totalHarga = hargaRoti * jumlahBeli;
		        
		        System.out.println(" ");
		        System.out.println("\nITEM \t\tQTY \t\tHARGA \t\tTOTAL");
		        for (int i=1; i<=80; i++)
		        	System.out.print("=");
//		        System.out.println("\nROTI ENAK. \t" + jumlahBeli + "\t\tRp " + hargaRoti + "\tRp " + totalHarga);
		        for (int i=1; i<=80; i++)
		        	System.out.print("-");

//		        if(jumlahBeli % 3 == 0) {
//		            diskon = 0.05 * totalHarga;
//		            subTotal = totalHarga - diskon;
//		            System.out.println("Diskon: 5%");
//		        } else {
//		            diskon = 0.1 * totalHarga;
//		            subTotal = totalHarga - diskon;
//		            System.out.println("\nDiskon: 10%");
//		        }

//		        System.out.println("Sub Total = Rp. " + subTotal);

		        input.close();
		    	}
}