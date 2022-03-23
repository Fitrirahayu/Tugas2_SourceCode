/* 13020200042 */
/* FITRI RAHAYU */
/* SELASA 22 MARET 2022 */
/* 08.00 */ 

import java.util.Scanner;

public class PrintRepeat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N;
		int i;
		Scanner masukan=new Scanner(System.in);
		
		System.out.print ("Nilai N >0 = "); 
		
		N = masukan.nextInt ();

		i = 1; 
		
		System.out.print ("Print i dengan REPEAT: \n"); 
		do{
			System.out.print (i+"\n"); /* Proses */
			i++; 
		}

		while (i <= N);
	}
}