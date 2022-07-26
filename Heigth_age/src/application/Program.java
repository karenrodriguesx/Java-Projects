package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many people will be entered? ");
		int n = sc.nextInt();
		
		String[] vectNames = new String[n];
		int[] vectAges = new int[n];
		double[] vectHeigths = new double[n];
		
		for (int i=0 ; i<n ; i++) {
			System.out.println ("Person data " + (i+1) + ":");
			System.out.print("Name: ");
			vectNames [i] = sc.next();
			System.out.print("Age: ");
			vectAges [i] = sc.nextInt();
			System.out.print("Heigth: ");
			vectHeigths [i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for (int i=0 ; i<n ; i++) {
			sum += vectHeigths[i];
		}
		double avgHeigths = sum / n;
		
		System.out.println();
		
		System.out.printf("Average heigth: %.2f%n", avgHeigths);
		
		int count = 0;
		for (int i=0 ; i<n ; i++) {
			if (vectAges[i] < 16) {
				count += 1;
			}
		}
		
		double percentage = count * 100.00 / n;
		
		System.out.printf ("Under 16 years old: %.1f%%%n", percentage);
		
		for (int i=0 ; i<n ; i++) {
			if (vectAges[i] < 16) {
				System.out.println (vectNames[i]);
			}
		}
		
		sc.close();
	}

}
