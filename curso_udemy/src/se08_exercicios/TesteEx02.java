package se08_exercicios;

import java.util.Scanner;

public class TesteEx02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Ex02 empregado = new Ex02();
		
		System.out.println("Nome: ");
		empregado.nome = ler.nextLine();
		System.out.println("Salario Bruto: ");
		empregado.salarioBruto = ler.nextDouble();
		System.out.println("Imposto: ");
		empregado.imposto = ler.nextDouble();
		System.out.println("-------------------------------------");
		
		System.out.println("EMPREGADO : " +empregado);
		System.out.println("-------------------------------------");
		
		System.out.println("Qual a porcentagem de aumento do salario: ");
		double porcentagem = ler.nextDouble();
		empregado.aumentoSalarial(porcentagem); 
		System.out.println("-------------------------------------");
		
		System.out.println("ATUALIZAÇÃO DO EMPREGADO : " +empregado);

		ler.close();
	}

}
