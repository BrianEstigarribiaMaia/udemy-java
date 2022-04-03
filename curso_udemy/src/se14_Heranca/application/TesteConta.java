package se14_Heranca.application;

import se14_Heranca.entities.Conta;
import se14_Heranca.entities.ContaEmpresa;
import se14_Heranca.entities.ContaPoupanca;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta c01 = new Conta(1001, "Alex", 1000.0);
		c01.saque(200.0);
		System.out.println(c01.getSaldo());

		Conta c02 = new ContaPoupanca(1002, "Maria", 1000.0, 0.1);
		c02.saque(200.0);
		System.out.println(c02.getSaldo());


		Conta c03 = new ContaEmpresa(1001, "Bob", 1000.0, 500.0);
		c03.saque(200.0);
		System.out.println(c03.getSaldo());


	}

}
