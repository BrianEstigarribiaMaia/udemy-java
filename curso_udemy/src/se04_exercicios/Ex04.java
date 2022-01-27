package se04_exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa que leia o número de um funcionário, 
 * seu número de horas trabalhadas, o valor que recebe por
 * hora e calcula o salário desse funcionário. A seguir, mostre 
 * o número e o salário do funcionário, com duas casas decimais.
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
		
		System.out.printf("Salário: U$ %.2f%n", salario);
		
		ler.close();

	}

}
