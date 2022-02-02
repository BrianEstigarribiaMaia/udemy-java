package se06_exercicios;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		 
		 System.out.println("Digite um numero: ");
		 int numero = ler.nextInt();
		 
		 for(int i = 0; i <= numero; i++) {
			 if(i % 2 != 0) {
				 System.out.println("Numero impar: " + i);
			 }
		 }

		 ler.close();
	}

}
