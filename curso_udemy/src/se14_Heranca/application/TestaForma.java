package se14_Heranca.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import se14_Heranca.abstrata.entities.Circulo;
import se14_Heranca.abstrata.entities.Forma;
import se14_Heranca.abstrata.entities.Retangulo;
import se14_Heranca.entities.enums.Cores;

public class TestaForma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Forma> lista = new ArrayList<>();
		
		System.out.println("Digite o numero de Formas: ");
		int num = sc.nextInt();

		for(int i = 1; i <= num; i++) {
			
			System.out.println("FORMA # "+i);
			System.out.print("Retangulo ou Circulo (R/C) ?");
			char ch = sc.next().charAt(0);
			
			System.out.println("COR: (PRETO, AZUL, VERMELHO)");
			Cores cor = Cores.valueOf(sc.next());
			
			if(ch == 'R') {
				System.out.println("Altura: ");
				double altura = sc.nextDouble();
				System.out.println("Largura: ");
				double largura = sc.nextDouble();
				
				lista.add(new Retangulo(cor, altura, largura));
				
			} else {
				System.out.println("Raio: ");
				double raio = sc.nextDouble();
				
				lista.add(new Circulo(cor, raio));
			}
		}
		
		System.out.println();
		System.out.println("AREAS DAS FORMAS: ");
		for(Forma f: lista) {
			System.out.println(String.format("%.2f", f.area()));
		}
		
		sc.close();
	}

}
