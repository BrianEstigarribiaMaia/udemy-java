package se15_Exception.application;

import java.util.Scanner;

import se15_Exception.model.entities.Conta;

public class TesteConta {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados da conta: ");
		System.out.println("Numero: ");
		int num = sc.nextInt();
		System.out.println("Titular: ");
		String titular =  sc.next();
		System.out.println("Saldo inicial: ");
		double saldo = sc.nextDouble();
		System.out.println("Limite de saque: ");
		double limiteSaldo = sc.nextDouble();
		
		Conta conta = new Conta(num, titular, saldo, limiteSaldo);
		
		System.out.println();
		System.out.println("Informe a quantia para sacar: ");
		double quantia = sc.nextDouble();
		
		try {
			conta.saque(quantia);
			System.out.printf("Novo saldo: %.2f%n",conta.getSaldo());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();

	}

}
