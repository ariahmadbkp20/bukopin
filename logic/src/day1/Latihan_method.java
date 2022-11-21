package day1;

public class Latihan_method {

		static void cetak(String inNama, String inAlamat, int inUmur) {
			System.out.println("Cetak nama "+inNama);
			System.out.println("Cetak alamat "+inAlamat);
			System.out.println("Cetak umur "+inUmur);
		}
		
		static String cetak2() {
			return "SU-57";
		}
		
	public static void main(String[] args) {
		String nama = "TheRock";
		String alamat = "California";
		int umur = 55;
		
		System.out.println("start");
		cetak(nama,alamat,umur); //panggil method
		String result = cetak2();
		System.out.println(result);
		System.out.println("end");
		// TODO Auto-generated method stub

	}

}
