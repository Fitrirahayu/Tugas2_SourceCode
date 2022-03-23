/* 13020200042 */
/* FITRI RAHAYU */
/* SELASA 22 MARET 2022 */
/* 08.00 */ 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import javax.swing.*;

public class Bacakar {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		char cc;
		int bil;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader dataIn = new BufferedReader(isr);
		// atau
		BufferedReader datAIn = new BufferedReader(new 
InputStreamReader(System.in));
		
		System.out.print ("hello\n");

		System.out.print("baca 1 karakter : ");
		//perintah baca karakter cc
		cc =dataIn.readLine().charAt(0);
		System.out.print("baca 1 bilangan : ");
		//perintah baca bil 
		bil =Integer.parseInt(datAIn.readLine());
		/*String kar = JOptionPane.showInputDialog("Karakter 1 : ");

		System.out.println(kar);*/
		//JOptionPane.showMessageDialog(null, "hello");
		System.out.print (cc +"\n" +bil+"\n");
		System.out.print ("bye \n"); 
	}

}
