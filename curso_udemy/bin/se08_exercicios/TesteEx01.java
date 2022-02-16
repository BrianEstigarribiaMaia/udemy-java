package se08_exercicios;

import java.util.Scanner;

public class TesteEx01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Ex01 retangulo = new Ex01();
		
		System.out.println("Digite a altura e a largura do retangulo: ");
		retangulo.altura = ler.nextDouble();
		retangulo.largura = ler.nextDouble();
		
		System.out.printf("AREA: %.2f%n", retangulo.area());
		System.out.printf("PERIMETRO: %.2f%n", retangulo.perimetro());
		System.out.printf("DIAGONAL: %.2f%n", retangulo.diagonal());
        ler.close();  
	}

}
