package se05_exercicios;

import java.util.Scanner;

/*
 * Leia 2 valores inteiros (A e B). Ap�s, o programa deve 
 * mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos",
 * indicando se os valores lidos s�o m�ltiplos entre si. Aten��o:
 * os n�meros devem poder ser digitados em ordem crescente ou decrescente.
 */
public class Ex03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int numero1 = ler.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int numero2 = ler.nextInt();
		
		if(numero1 % numero2 == 0 || numero2 % numero1 == 0) {
			System.out.println("S�o multiplos");
		}else {
			System.out.println("N�o s�o multiplos");
		}

		ler.close();
	}

}
