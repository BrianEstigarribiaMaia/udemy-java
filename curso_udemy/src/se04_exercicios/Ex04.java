package se04_exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa que leia o n�mero de um funcion�rio, 
 * seu n�mero de horas trabalhadas, o valor que recebe por
 * hora e calcula o sal�rio desse funcion�rio. A seguir, mostre 
 * o n�mero e o sal�rio do funcion�rio, com duas casas decimais.
 */

public class Ex04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int numeroFunc, horas;
		double valorHora, salario;
		
		System.out.println("Digite o numero de funcionarios: ");
		numeroFunc = ler.nextInt(); 
		System.out.println("Digite as horas trabalhadas: ");
		horas = ler.nextInt();
		System.out.println("Digite o valor recebido por hora: ");
		valorHora = ler.nextDouble();
		
		salario = valorHora * horas;
		
		System.out.println("Numero: "+numeroFunc);
		
		System.out.printf("Sal�rio: U$ %.2f%n", salario);
		
		ler.close();

	}

}
