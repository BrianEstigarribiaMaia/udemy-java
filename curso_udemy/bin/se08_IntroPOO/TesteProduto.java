package se08_IntroPOO;

import java.util.Scanner;

public class TesteProduto {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Produto produto = new Produto();
		System.out.println("Digite as informações do produto: ");
		System.out.println("Nome: ");
		produto.nome = ler.nextLine();
		System.out.println("Preço: ");
		produto.preco = ler.nextDouble();
		System.out.println("Quantidade: ");
		produto.quantidade = ler.nextInt();
		
		System.out.println("Dados do Produto : " + produto);
		
		System.out.println("-----------------------------------");
		
		System.out.println("Digite a quantidade de produtos adicionados no estoque: ");
		int quantidade = ler.nextInt();
		produto.adicionarProdutos(quantidade);
		
		System.out.println("Dados: " + produto);
		
		System.out.println("Digite a quantidade de produtos removidos no estoque: ");
		quantidade = ler.nextInt();
		produto.removerProdutos(quantidade);
		
		System.out.println("Dados : " + produto);
		ler.close();
	}

}
