package day1;

import java.util.Scanner;

public class Latihan3 {
	
	// input:
	// nama : Trainier
	// alamat : jakarta
	// umur : 40
	// output:
	// data input nama : 
	
		public static void main(String[] args) {
		
		//buat var baca
		 
		Scanner baca = new Scanner(System.in);
		String nama = "", alamat="";
		int umur =0;
		System.out.print("Nama : ");
		nama = baca.nextLine(); //next line khusus string
		System.out.print("Alamat : ");
		alamat = baca.nextLine();
		System.out.print("Umur : ");
		umur = baca.nextLine();
		
		
		//cetak
		System.out.println("data input nama : "+nama+", alamat: "+alamat +" , umur : "+umur + "th");
		baca.close();
	}

}






 