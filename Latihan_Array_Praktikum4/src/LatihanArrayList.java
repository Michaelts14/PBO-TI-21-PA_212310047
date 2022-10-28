import java.util.ArrayList;

public class LatihanArrayList {
	
	public static void main(String[] args) {
		/*
		 * Penulisan ArrayList
		 * ArrayList<dataType> nama_arr = new ArrayList<dataType>();
		 */
		
		ArrayList<Integer> npm = new ArrayList<Integer>();
//		System.out.println(npm);
		
		//insert array
		npm.add(212310004);
		npm.add(212310005);
		npm.add(212310006);
		npm.add(212310007);
		npm.add(212310008);
		System.out.println("\nSebelum dihapus");
		System.out.println(npm);
		
		//select array
		System.out.println("Sebelum");
		System.out.println("Npm dibaris ketiga adalah "+ npm.get(2));
		
		//update
		System.out.println("\nSesudah");
		npm.set(2, 212310059);
		System.out.println("Npm dibaris ketiga adalah " + npm.get(2));
		
		//delete array
		System.out.println("\nSesudah dihapus");
		npm.remove(1); // kita menghapus satu index saja
		System.out.println(npm);
		
		npm.clear();
		System.out.println("Sesudah dihapus semua = "); // menghapus keseluruhan data di dalam array 
		
	}
	 
}