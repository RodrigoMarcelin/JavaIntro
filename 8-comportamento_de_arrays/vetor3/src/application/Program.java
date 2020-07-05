package application;

import java.util.Scanner;

import entities.Reserva;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, room;
		String name, email;
		
		Reserva[] reserva = new Reserva[10];
		System.out.println("How many rooms will be rented? ");
		n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i ++) {
			System.out.printf("Rent #%d: %n", i + 1);
			System.out.println("Name: ");
			name = sc.nextLine();
			System.out.println("Email: ");
			email = sc.nextLine();
			System.out.println("Room: ");
			room = sc.nextInt();
			sc.nextLine();
			reserva[room] = new Reserva(name, email, room);
		}
		
		
		System.out.println("Busy rooms: ");
		
		for (int i = 0; i < 10; i++) {
			if (reserva[i] != null) {
				System.out.printf("%d: %s, %s %n", reserva[i].getRoom(), reserva[i].getName(), reserva[i].getEmail());
			}
		}
		
		
		sc.close();

	}

}
