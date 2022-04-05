package se14_Heranca.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import se14_Heranca.entities.Produto;
import se14_Heranca.entities.ProdutoImportado;
import se14_Heranca.entities.ProdutoUsado;

public class TesteProduto {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Produto> lista = new ArrayList<>();
		
		System.out.println("Digite a quantidade de produtos: ");
		int num = sc.nextInt();

		for(int i = 1; i <= num; i++) {
			System.out.println("Produto #" + i + "dados: ");
			System.out.println("Comum, usado ou importado (C/U/I) ?");
			char tipo = sc.next().charAt(0);
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Preço: ");
			double preco = sc.nextDouble();
			
			if (tipo == 'C') {
				lista.add(new Produto(nome, preco));
			} else if(tipo == 'U'){
				System.out.println("Data de fabricação (dd/mm/aaaa): ");
				Date data = sdf.parse(sc.next());
				lista.add(new ProdutoUsado(nome, preco, data));
			} else {
				System.out.println("Taxas alfandegarias: ");
				double taxasAlfandegarias = sc.nextDouble();
				lista.add(new ProdutoImportado(nome, preco, taxasAlfandegarias));
			}
		}
		
		System.out.println("Tag de Preços: ");
		for(Produto p: lista) {
			System.out.println(p.tagPreco());
		}
		
		sc.close();
	
	}

}
