package se05_EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ValorConta {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Quantos minutos o cliente ficou: ");
		int minutos = ler.nextInt();
		
		double conta = 55.00;
		
		if(minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
		
		System.out.printf("Valor da conta: %.2f%n", conta);
		ler.close();
	}

}
