package se07_Topicos;

import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite 3 numeros: ");
		int a = ler.nextInt();
		int b = ler.nextInt();
		int c = ler.nextInt();

		int maior = max(a, b, c);
		
		mostrarResultado(maior);
		
		ler.close();
	}

	private static void mostrarResultado(int valor) {
		System.out.println("Maior Valor: " + valor);
		
	}

	private static int max(int a, int b, int c) {
		int aux;
		
		if(a > b && a > c) {
			aux = a;
			
		}else if(b > c) {
			aux = b;
			
		}else {
			aux = c;
		}
		return aux;
	}

}
