package se04_exercicios;

/*
 * Fazer um programa para ler quatro valores inteiros A, B, C e D. 
 * A seguir, calcule e mostre a diferen�a do produto
 * de A e B pelo produto de C e D segundo a f�rmula:
 *  DIFERENCA = (A * B - C * D).
 */
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, c, d, diferenca;
		
		System.out.println("Digite o valor de a: ");
		a = ler.nextInt();
		
		System.out.println("Digite o valor de b: ");
		b = ler.nextInt();
		
		System.out.println("Digite o valor de c: ");
		c = ler.nextInt();
		
		System.out.println("Digite o valor de d: ");
		d = ler.nextInt();
		
		diferenca = (a * b - c * d);
		
		System.out.println("Diferen�a entre os numeros: " +diferenca);
		
		ler.close();

	}

}
