package se08_exercicios;

import java.util.Scanner;

public class TesteEx03 {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
		
		Ex03 aluno = new Ex03();
		
		System.out.println("Nome: ");
		aluno.nome = ler.nextLine();
		System.out.println("Nota prova 1: ");
		aluno.prova1 = ler.nextDouble();
		System.out.println("Nota prova 2: ");
		aluno.prova2 = ler.nextDouble();
		System.out.println("Nota prova 3: ");
		aluno.prova3 = ler.nextDouble();
		System.out.println("-------------------------------------");
		
		System.out.printf("NOTA FINAL : %.2f%n", aluno.provaFinal());
		System.out.println("-------------------------------------");
		
		if(aluno.provaFinal() < 60.0) {
			System.out.println("Reprovado");
			System.out.printf("Faltam %.2f pontos%n", aluno.pontosQueFaltam());
			
		}else {
			System.out.println("Aprovado");
			
		}

		ler.close();

	}

}
