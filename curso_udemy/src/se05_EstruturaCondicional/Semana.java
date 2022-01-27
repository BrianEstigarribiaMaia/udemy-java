package se05_EstruturaCondicional;

import java.util.Scanner;

public class Semana {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
	
		String dia;
		
		System.out.println("Digite um numero/dia da semana: ");
		int numero = ler.nextInt();
		
		switch(numero) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;	
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Dia Invalido";
			break;
		}
		
		System.out.println("O dia da semana é : "+ dia);
		ler.close();

	}

}
