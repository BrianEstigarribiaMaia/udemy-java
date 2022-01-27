package se04_exercicios;

import java.util.Scanner;

/*
 * Fazer um programa para ler o código de uma peça 1, 
 * o número de peças 1, o valor unitário de cada peça 1, o
 * código de uma peça 2, o número de peças 2 e o valor unitário 
 * de cada peça 2. Calcule e mostre o valor a ser pago.
 */

public class Ex05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int cod1, cod2, numeroPecas1, numeroPecas2;
		double valorUn1, valorUn2, valorTotal;
		
		System.out.println("código de uma peça 1:");
		cod1 = ler.nextInt();
		
		System.out.println("número de peças 1:");
		numeroPecas1 = ler.nextInt();
		
		System.out.println("valor unitário de cada peça 1:");
		valorUn1 = ler.nextDouble();
		
		System.out.println("código de uma peça 2");
		cod2 = ler.nextInt();
		
		System.out.println("número de peças 2:");
		numeroPecas2 = ler.nextInt();
		
		System.out.println("valor unitário de cada peça 2:");
		valorUn2 = ler.nextDouble();
		
		valorTotal = (valorUn1 * numeroPecas1) + (valorUn2 * numeroPecas2);
		
		System.out.println("O valor a ser pago é: "+valorTotal);
		
		ler.close();

	}

}
