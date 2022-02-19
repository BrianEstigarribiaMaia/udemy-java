package se10_exercicios;

import java.util.Scanner;

public class TesteMatriz {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de linhas/colunas da"
				           + "matriz quadrada:  ");
		
		int numero = ler.nextInt();
		
		int[][] matriz = new int[numero][numero];
		
		for(int i = 0; i < matriz.length; i++) {
		   for (int j = 0; j < matriz.length; j++) {
			   System.out.println("Digite um numero:");
			 matriz[i][j] = ler.nextInt();
		   }	
		}
		System.out.println("---------------------------------------------");
		
		System.out.println("Diagonal Principal: ");
		for(int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
			System.out.println();
		}
		System.out.println("---------------------------------------------");
		
		int contador = 0;
		for(int i = 0; i < matriz.length; i++) {
			   for (int j = 0; j < matriz.length; j++) {
				   if(matriz[i][j] < 0) {
					   contador++;
				   }
			   }
		}
		
		System.out.println("Quantidade de numeros negativos: "+contador);
		
		ler.close();
	}
}
