/* 13020200042 */
/* FITRI RAHAYU */
/* SELASA 22 MARET 2022 */
/* 08.00 */ 

import java.util.Scanner;

public class PrintXRepeat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Sum;
		int x;
		Scanner masukan=new Scanner(System.in);
		
		System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");

		x = masukan.nextInt(); 

		if (x == 999){
			System.out.print("Kasus kosong \n");
		}else { 
		Sum = 0; 
		do{
			Sum = Sum + x; 
			System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
			x = masukan.nextInt(); 
		} while (x != 999); 
		System.out.println ("Hasil penjumlahan = "+Sum);
		}
	}
}
