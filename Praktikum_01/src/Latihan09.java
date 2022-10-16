public class Latihan09 {
	public static void main(String[] args) {
		Students myBio = new Students();
		System.out.println("NPM : " + myBio.getNPM(212310031));
		System.out.println("Nama Lengkap : " + myBio.getFullName("Angga Putra"));
		System.out.println("Kelas : " + myBio.getClassName("TI-21-PA"));
		System.out.println("Semester : " + myBio.getSemester(3));
		System.out.println("GPA : " + myBio.getGPA(3.6));
	}
}