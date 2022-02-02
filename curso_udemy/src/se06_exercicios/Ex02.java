package se06_exercicios;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
        Scanner ler = new Scanner(System.in);
		
        int alcool = 0, gasolina = 0, diesel = 0;
        
        System.out.println("==========COMBUSTIVEL==========");
        System.out.println("1-Alcool | 2-Gasolina | 3-Diesel | 4-Sair");
		System.out.println("Digite o tipo de combustivel: ");
		int tipo = ler.nextInt();
		
		while(tipo != 4) {
			if(tipo == 1) {
				alcool = alcool + 1;
				
			}else if(tipo == 2) {
				gasolina = gasolina + 1;
				
			}else if(tipo == 3) {
				diesel = diesel + 1;
			}
			
			System.out.println("Digite o tipo de combustivel: ");
			tipo = ler.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Alcool: "+ alcool);
		System.out.println("Gasolina: "+ gasolina);
		System.out.println("Diesel: "+ diesel);
		ler.close();

	}

}
