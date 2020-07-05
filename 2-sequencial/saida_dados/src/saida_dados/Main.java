package saida_dados;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		int y = 23;
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.00;
		
		
		System.out.println(y);
		System.out.printf("%.2f%n", x);
		Locale.setDefault(Locale.US);
		System.out.println(y);
		System.out.printf("%.2f%n", x);
		System.out.println("Resultado = " + x + " para vc ver");
		System.out.printf("Resultado = %.2f para vc ver%n", x);
		System.out.printf("%s tem %d anos de idade e ganha R$ %.2f reais%n", nome, idade, renda);
		

	}

}
