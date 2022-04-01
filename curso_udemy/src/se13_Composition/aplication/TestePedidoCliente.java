package se13_Composition.aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import se13_Composition.model.entities.Cliente;
import se13_Composition.model.entities.Pedido;
import se13_Composition.model.entities.PedidoItem;
import se13_Composition.model.entities.Produto;
import se13_Composition.model.enums.PedidoStatus;

public class TestePedidoCliente {

public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Digite os dados do Cliente:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Data de nascimento (DD/MM/YYYY): ");
		Date dataNascimento = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente(nome, email, dataNascimento);
		
		System.out.println("Digite os dados do Pedido:");
		System.out.print("Status: ");
		PedidoStatus status = PedidoStatus.valueOf(sc.next());
		
		Pedido pedido = new Pedido(new Date(), status, cliente);
		
		System.out.print("Quantos itens esse pedido tem ? ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("Digite o #" + i + " informação do produto:");
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.print("Preço do produto: ");
			double precoProduto = sc.nextDouble();

			Produto produto = new Produto(nomeProduto, precoProduto);

			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();

			PedidoItem pedidoItem = new PedidoItem(quantidade, precoProduto, produto); 

			pedido.addItem(pedidoItem);
		}
		
		System.out.println();
		System.out.println("Resumo do pedido:");
		System.out.println(pedido);
		
		sc.close();
	}

}
