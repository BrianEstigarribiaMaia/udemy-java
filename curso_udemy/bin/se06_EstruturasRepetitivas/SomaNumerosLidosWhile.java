package se06_EstruturasRepetitivas;

import java.util.Scanner;

public class SomaNumerosLidosWhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = ler.nextInt();
		
		int soma = numero;
		
		while (numero != 0) {
			System.out.println("Digite um numero: ");
			numero = ler.nextInt();
			
			soma = numero + soma;

		}
		
		System.out.println("a soma dos numeros digitados é: " + soma);
		ler.close();

	}

}
