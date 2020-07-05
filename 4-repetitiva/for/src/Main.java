import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, resp;
		
		resp = 0;
		for (int i=0; i<4; i++) {
			x = sc.nextInt();
			resp = resp + x;
		}
		
		System.out.println("Saída = " + resp);
			

	}

}
