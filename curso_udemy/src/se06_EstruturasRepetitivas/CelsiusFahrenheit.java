package se06_EstruturasRepetitivas;

import java.util.Scanner;

public class CelsiusFahrenheit {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		char resposta;
		
		do {
			
			System.out.println("Digite a temperatura em celsius: ");
			double celsius = ler.nextDouble();
			
			double farenheit = 9.0 * celsius / 5.0 + 32.0;
			
			System.out.printf("Equivalente em farenheit: %.1f%n", farenheit);
			System.out.println("Deseja repetir (s/n) ?");
			resposta = ler.next().charAt(0);
			
		} while (resposta != 'n');
		
		ler.close();
	}
}
