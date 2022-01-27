package se04_exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
 * Fa�a um programa para ler o valor do raio de um c�rculo,
 * e depois mostrar o valor da �rea deste c�rculo com quatro
 * casas decimais conforme exemplos.
 */
public class Ex02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double raio, area;
		
		System.out.println("Digite o valor do raio : ");
		raio = ler.nextDouble();
		
		area = Math.PI * raio * raio;
		
		System.out.printf("area = %.4f%n", area);
		ler.close();
		

	}

}
