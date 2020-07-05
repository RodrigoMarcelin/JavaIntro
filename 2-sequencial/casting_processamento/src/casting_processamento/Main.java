package casting_processamento;

public class Main {

	public static void main(String[] args) {
		int base_menor = 6;
		int base_maior = 8;
		int altura = 5;
		double area;
		int a;
		double b = 2.6;
		
		a = (int) b;
		
		area = ((base_menor + base_maior) / 2) * altura;
		
		
		
		System.out.printf("A área do trapésio é %.1f%n", area);
		System.out.println(a);
		System.out.printf("%.0f", b);
	
		

	}

}
