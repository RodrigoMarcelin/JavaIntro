package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double xa, xb, xc, ya, yb, yc;
		
		System.out.println("Entrar the measures of triangle X: ");
		xa = sc.nextDouble();
		xb = sc.nextDouble();
		xc = sc.nextDouble();
		
		System.out.println("Entrar the measures of triangle y: ");
		ya = sc.nextDouble();
		yb = sc.nextDouble();
		yc = sc.nextDouble();
		
		double p = (xa + xb + xc) / 2.0;
		double ax = Math.sqrt(p * (p - xa) * (p - xb) * (p - xc));
		
		p = (ya + yb + yc) / 2.0;
		double ay = Math.sqrt(p * (p - ya) * (p - yb) * (p - yc));
		
		System.out.printf("Triangle x area: %.4f%n", ax);
		System.out.printf("Triangle y area: %.4f%n", ay);
		
		if (ax > ay) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}

	}

}
