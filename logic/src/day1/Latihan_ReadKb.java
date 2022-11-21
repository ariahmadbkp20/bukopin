package day1;

import java.util.Scanner;

public class Latihan_ReadKb {
	
	public static void main(String[] args) {
		
		//buat var baca
		System.out.print("Masukan nama : ");
		Scanner baca = new Scanner(System.in);
		String nama = baca.nextLine();  //input dari keyboard
		
		System.out.println("nama di input : "+nama);
		baca.close();
	
	}

}
