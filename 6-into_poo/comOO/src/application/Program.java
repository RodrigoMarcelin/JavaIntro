package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {
	public static void main(String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Entrar the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Entrar the measures of triangle y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double ax = x.area();
		double ay = y.area();
						
		System.out.printf("Triangle x area: %.4f%n", ax);
		System.out.printf("Triangle y area: %.4f%n", ay);
		
		if (ax > ay) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}

	}
}
