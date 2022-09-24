
import java.util.Scanner;

public class Latihan03 {
	public static void main(String[] args) {
		
				System.out.println("Menghitung Luas, Keliling, dan Volume Bangun Ruang\n");
				
				Scanner input = new Scanner(System.in);
				System.out.println("Bangun Ruang Segitiga Kerucut");
				System.out.print("Masukan jari-jari : ");
				int r1 = input.nextInt();
				System.out.print("Masukan sisi miring : ");
				int sm1 = input.nextInt();
				System.out.print("Masukan tinggi : ");
				int t1 = input.nextInt();
				
				double volume_kerucut = (3.14*r1*r1*t1)*1/3;
				double luas_kerucut = 3.14*r1*(r1+sm1);

				System.out.print("Volume segitiga kerucut = "+volume_kerucut +"cm");
				System.out.print("\nLuas segitiga kerucut = "+luas_kerucut +"cm");
				
				System.out.print("\n\nBangun Ruang Tabung\n");
				System.out.print("Masukan jari-jari : ");
				int r2 = input.nextInt();
				System.out.print("Masukan tinggi : ");
				int t2 = input.nextInt();
				
				double volume_tabung = (3.14)*r2*r2*t2;
				double luas_tabung = (3.14)*r2*2*(r2+t2);
			
				System.out.print("Volume tabung = "+volume_tabung +"cm");
				System.out.print("\nLuas tabung = "+luas_tabung +"cm");
				
				input.close();
			}
		}

