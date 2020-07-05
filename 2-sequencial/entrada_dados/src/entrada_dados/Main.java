package entrada_dados;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char r;
		String x;
		int y;
		double c;
		x = sc.next();
		y = sc.nextInt();
		c = sc.nextDouble();
		r = sc.next().charAt(0);
		System.out.println("Você digitou: " + x);
		System.out.println("Você digitou: " + y);
		System.out.println("Você digitou: " + c);
		System.out.println("Você digitou: " + r);
		
		sc.close();

	}

}
