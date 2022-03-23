/* 13020200042 */
/* FITRI RAHAYU */
/* SELASA 22 MARET 2022 */
/* 08.00 */ 

import java.util.Scanner;

public class PrintIterasi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N;
		int i;
		Scanner masukan=new Scanner(System.in);
		
		System.out.print ("Nilai N >0 = ");
		N = masukan.nextInt();

		i = 1; 
		System.out.print ("Print i dengan ITERATE : \n"); 
		for (;;){
			System.out.println(i); 
			if (i == N) 
				break;
			else { 
				i++; 
			} 
		} /* (i == N) */
	}
}
