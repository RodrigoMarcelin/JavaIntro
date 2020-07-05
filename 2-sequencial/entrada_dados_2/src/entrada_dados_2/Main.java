package entrada_dados_2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String r;
		int x;
		String y;
		String c;
		x = sc.nextInt();
		sc.nextLine();
		y = sc.nextLine();
		c = sc.nextLine();
		r = sc.nextLine();
		System.out.println("Você digitou: " + x);
		System.out.println("Você digitou: " + y);
		System.out.println("Você digitou: " + c);
		System.out.println("Você digitou: " + r);
		
		sc.close();
	}

}


