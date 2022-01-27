package se05_exercicios;

import java.util.Scanner;

/*
 * Fazer um programa para ler um número inteiro e 
 * dizer se este número é par ou ímpar.
 */
public class Ex02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Digite um numero inteiro: ");
		int numero = ler.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("numero par");
		}else {
			System.out.println("numero impar");
		}
		
		ler.close();

	}

}
