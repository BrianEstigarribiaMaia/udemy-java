package se06_exercicios;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a senha: ");
		int senha = ler.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha Invalida !");
			
			System.out.println("Digite a senha: ");
			senha = ler.nextInt();
		}

		System.out.println("Senha Correta!");
		ler.close();
	}

}
