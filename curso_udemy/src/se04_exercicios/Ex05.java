package se04_exercicios;

import java.util.Scanner;

/*
 * Fazer um programa para ler o c�digo de uma pe�a 1, 
 * o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o
 * c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio 
 * de cada pe�a 2. Calcule e mostre o valor a ser pago.
 */

public class Ex05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int cod1, cod2, numeroPecas1, numeroPecas2;
		double valorUn1, valorUn2, valorTotal;
		
		System.out.println("c�digo de uma pe�a 1:");
		cod1 = ler.nextInt();
		
		System.out.println("n�mero de pe�as 1:");
		numeroPecas1 = ler.nextInt();
		
		System.out.println("valor unit�rio de cada pe�a 1:");
		valorUn1 = ler.nextDouble();
		
		System.out.println("c�digo de uma pe�a 2");
		cod2 = ler.nextInt();
		
		System.out.println("n�mero de pe�as 2:");
		numeroPecas2 = ler.nextInt();
		
		System.out.println("valor unit�rio de cada pe�a 2:");
		valorUn2 = ler.nextDouble();
		
		valorTotal = (valorUn1 * numeroPecas1) + (valorUn2 * numeroPecas2);
		
		System.out.println("O valor a ser pago �: "+valorTotal);
		
		ler.close();

	}

}
