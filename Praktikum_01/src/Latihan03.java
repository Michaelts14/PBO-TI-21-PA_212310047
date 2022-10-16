import java.util.Scanner;

public class Latihan03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double diagonal1, diagonal2, alas, tinggi, panjang, lebar;
		
		System.out.println("Masukan diagonal1 : ");
		double diagonal_1 = input.nextDouble();
		System.out.println("Masukan diagonal2 : ");
		double diagonal_2 = input.nextDouble();
		System.out.println("Masukan alas : ");
		double a = input.nextDouble();
		System.out.println("Masukan tinggi : ");
		double t = input.nextDouble();
		System.out.println("Masukan Panjang : ");
		double p = input.nextDouble();
		System.out.println("Masukan Lebar : ");
		double l = input.nextDouble();
		input.close();
		
		double KelilingLayangLayang = 2*(diagonal_1 + diagonal_2);
		double LuasLayangLayang = 0.5 * diagonal_1 * diagonal_2;
		double KelilingPrisma = 2 * (a + t + l) + (3*p);
		double LuasPrisma = 2 * (0.5 * a * t) + (a + t + l);
		
		System.out.println("Luas Layang - layang = " + LuasLayangLayang +"cm");
		System.out.println("\nKeliling Layang - layang = " + KelilingLayangLayang +"cm");
		System.out.println("\nLuas Prisma Segitiga = " + LuasPrisma +"cm");
		System.out.println("\nKeliling Prisma Segitiga = " + KelilingPrisma +"cm");
	}
}