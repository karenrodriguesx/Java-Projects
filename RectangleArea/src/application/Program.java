package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Area;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Area area = new Area();
		
		System.out.println ("Enter rectangle width and height: ");
		area.Width = sc.nextDouble();
		area.Height = sc.nextDouble();
		
		System.out.println (area);
		
		sc.close();

	}

}
