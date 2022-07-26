package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Hou many rooms will be rented? ");
		int n = sc.nextInt();
		
		System.out.println ();
		
		String[] name = new String [n];
		String [] email = new String [n];
		int [] roomNumber = new int[n];
		
		int[] vect = new int [10];
		
			for (int i=0 ; i<n ; i++){
				System.out.println("Rent #" + (i+1));
				System.out.print("Name: ");
				sc.nextLine();
				name[i] = sc.nextLine();
				System.out.print("Email: ");
				email[i] = sc.next();
				System.out.print("Room: ");
				roomNumber [i] = sc.nextInt();
				System.out.println();
			}
		
		System.out.println("Busy rooms: ");
		
		for (int i=0 ; i<n ; i++) {
			vect [i] = roomNumber[i];
			if (vect != null) {
				System.out.println(vect[i] + ": " + name [i] + ", " + email [i]);
			}
		}
		
		sc.close();
	}

}
