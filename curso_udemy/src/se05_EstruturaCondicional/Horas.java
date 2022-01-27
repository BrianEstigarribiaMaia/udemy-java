package se05_EstruturaCondicional;

import java.util.Scanner;

public class Horas {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int hora;

		System.out.println("Que horas são ?:");
		hora = ler.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia!");
		} else if (hora >= 12 && hora < 19) {
			System.out.println("Boa Tarde!");
		} else {
			System.out.println("Boa Noite!");
		}

		ler.close();

	}

}
