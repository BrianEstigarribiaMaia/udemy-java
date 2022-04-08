package se14_Heranca.application;

import java.util.ArrayList;
import java.util.List;

import se14_Heranca.abstrata.entities.Conta;
import se14_Heranca.abstrata.entities.ContaEmpresa;
import se14_Heranca.abstrata.entities.ContaPoupanca;

public class TesteConta02 {

	public static void main(String[] args) {
		
		List<Conta> lista = new ArrayList<>();
		
		lista.add(new ContaEmpresa(1001, "Bob", 1000.0, 500.0));
		lista.add(new ContaPoupanca(1002, "Maria", 1000.0, 0.1));
		
		double soma = 0.0;
		
		for(Conta c: lista) {
			soma += c.getSaldo();
		}
		
		System.out.printf("Saldo Total: %.2f%n", soma);
		
		for(Conta c: lista) {
			c.deposito(100.0);
		}
		
		for(Conta c: lista) {
			c.saque(50.0);
		}
		
		for(Conta c: lista) {
			System.out.printf("Saldo Atualizado da conta %d: %.2f%n", c.getNumero(),
					           c.getSaldo());
		}

	}

}
