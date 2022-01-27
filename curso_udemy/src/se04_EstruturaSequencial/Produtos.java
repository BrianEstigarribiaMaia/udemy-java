package se04_EstruturaSequencial;

public class Produtos {

	public static void main(String[] args) {
		
		String produto1 = "Computador";
		String produto2 = "Mesa";
		
		byte idade  = 30;
		int  codigo = 5290;
		char genero = 'F';
		
		double preco1  = 2100.0;
		double preco2  = 650.50;
		
		System.out.println("Produtos: ");
		System.out.printf("%s o preço é $ %.2f%n", produto1, preco1);
		System.out.printf("%s o preço é $ %.2f%n", produto2, preco2);
		System.out.println();
		
		System.out.printf("Vendedor:  %d anos, codigo %d e genero %c%n",
				          idade, codigo, genero);
		
	}

}
