package se05_EstruturaCondicional;

import java.util.Scanner;

public class Desconto {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o pre�o: ");
		double preco = ler.nextDouble();
		
		double desconto = (preco > 100) ? preco * 0.1 : preco * 0.05;
		double precoFinal = preco - desconto;
		
		System.out.printf("Pre�o com desconto %.2f%n", precoFinal);
		ler.close();
	}
}
