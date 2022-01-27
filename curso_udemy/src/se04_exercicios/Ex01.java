package se04_exercicios;

import java.util.Scanner;

/*
 * Faça um programa para ler dois valores inteiros,
 * e depois mostrar na tela a soma desses números com uma
 * mensagem explicativa, conforme exemplos
 */
public class Ex01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int valor1, valor2, soma;
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = ler.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		valor2 = ler.nextInt();
		
		soma = valor1 + valor2;
		
		System.out.println("A soma dos valores digitados é : "+soma);

		ler.close();
	}

}
