package se05_exercicios;

import java.util.Scanner;

/*
 * Escreva um programa que leia o código de um item e 
 * a quantidade deste item. A seguir, calcule e mostre
 * o valor da conta a pagar.
 */
public class Ex05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("=====ITENS=====");
		System.out.println("COD: 1 - Cachorro Quente | PRECO: R$ 4.00");
		System.out.println("COD: 2 - Xis Salada      | PRECO: R$ 4.50");
		System.out.println("COD: 3 - Xis Bacon       | PRECO: R$ 5.00");
		System.out.println("COD: 4 - Torrada Simples | PRECO: R$ 2.00");
		System.out.println("COD: 5 - Refrigerante    | PRECO: R$ 1.50");
		System.out.println("-----------------------------------------/n");
		
		System.out.println("Codigo do item: ");
		int cod = ler.nextInt();
		
		System.out.println("Quantidade: ");
		int qtd = ler.nextInt();
		
		double total;
		
		if(cod == 1) {
			total = qtd * 4.0;
			System.out.println("Total : "+total);
		}else if (cod == 2) {
			total = qtd * 4.5;
			System.out.println("Total : "+total);
		}else if (cod == 3) {
			total = qtd * 5.0;
			System.out.println("Total : "+total);
		}else if (cod == 4) {
			total = qtd * 2.0;
			System.out.println("Total : "+total);
		}else if (cod == 5) {
			total = qtd * 1.5;
			System.out.println("Total : "+total);
		}else {
			System.out.println("Codigo invalido!");
		}

		ler.close();
	}

}
