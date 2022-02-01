package se06_EstruturasRepetitivas;

import java.util.Scanner;

public class SomaNumerosLidosFor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int soma = 0;
		
		System.out.println("Digite a quantidade de numeros a serem lidos: ");
		int numeroDeVezes = ler.nextInt();
		
		for (int i = 0; i < numeroDeVezes; i++) {
			System.out.println("Digite um numero: ");
			int numero = ler.nextInt();
			
			soma = numero + soma;
		}

		System.out.println("a soma dos numeros digitados é: " + soma);
		ler.close();
		
	}

}
