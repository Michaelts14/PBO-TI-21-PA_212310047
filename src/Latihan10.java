import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Latihan10 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDateTime waktuSekarang = LocalDateTime.now();
        DateTimeFormatter formatWaktu = DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)");
        String waktu = waktuSekarang.format(formatWaktu);
        
        double hargaRoti = 6300;
        double jumlahBeli;
        double totalHarga;
        double diskon;
        double subTotal;

        for (int i=1; i<=80; i++)
    	System.out.print("=");
        System.out.println("\n\t\t\t\tTOKO SERBAGUNA IBIK");
	    for (int i=1; i<=80; i++)
		System.out.print("=");	   
       
        System.out.print("\nMasukkan jumlah produk yang dibeli = ");
        
        jumlahBeli = input.nextInt();
        totalHarga = hargaRoti * jumlahBeli;

        System.out.print("\n");

        System.out.println(waktu);
        System.out.println("\nITEM \t\tQTY \t\tHARGA \t\tTOTAL");
        for (int i=1; i<=80; i++)
        	System.out.print("=");
        System.out.println("\nROTI ENAK. \t" + jumlahBeli + "\t\tRp " + hargaRoti + "\tRp " + totalHarga);
        for (int i=1; i<=80; i++)
        	System.out.print("-");

        if(jumlahBeli % 3 == 0) {
            diskon = 0.05 * totalHarga;
            subTotal = totalHarga - diskon;
            System.out.println("Diskon: 5%");
        } else {
            diskon = 0.1 * totalHarga;
            subTotal = totalHarga - diskon;
            System.out.println("\nDiskon: 10%");
        }
      
        System.out.println("Sub Total = Rp. " + subTotal);
        System.out.println("  ");
		System.out.print("Member Name :");
		
    }
    class Students {
    	
    	String getFullname(String Fullname) {
    		System.out.println(Fullname);
    		return Fullname;
    	}
    }
}