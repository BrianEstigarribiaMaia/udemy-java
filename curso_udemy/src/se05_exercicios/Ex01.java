package se05_exercicios;

import java.util.Scanner;

/*
 * Fazer um programa para ler um número inteiro, e depois dizer 
 * se este número é negativo ou não.
 */
public class Ex01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Digite um numero inteiro: ");
		int numero = ler.nextInt();

		if(numero < 0) {
			System.out.println("numero negativo");
		}else {
			System.out.println("numero positivo");
		}
		
		ler.close();
	}

}
