import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, resp, c;
		
		c = 0;
		resp = 0;
		
		while (c < 4) {
			x = sc.nextInt();
			System.out.println("Entrada = " + x);
			resp = resp + x;
			c += 1;
		}
		System.out.println();
		System.out.println("Saída = " + resp);

	}

}
