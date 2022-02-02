package se06_exercicios;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		 
		System.out.println("Digite a quantidade de numeros a serem lidos: ");
		int qtdNumero = ler.nextInt();
		
		int dentro = 0, fora = 0;
		
		for(int i = 0; i < qtdNumero; i++) {
			System.out.println("Digite um numero: ");
			int numero = ler.nextInt();
			
			if(numero >= 10 && numero <= 20) {
				dentro = dentro + 1;
				
			}else {
				fora = fora + 1;
				
			}
		}
		
		System.out.println("Dentro do intervalo [10 a 20] >> " +dentro);
		System.out.println("Fora do intervalo [10 a 20] >> " +fora);
		
		ler.close();
	}
}
