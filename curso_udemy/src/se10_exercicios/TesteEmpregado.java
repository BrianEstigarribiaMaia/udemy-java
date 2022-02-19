package se10_exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteEmpregado {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		List<Empregado> lista = new ArrayList<>();
		
		//ler os dados 
		System.out.println("Quantos empregados ser�o registrados?");
		int quantidade = ler.nextInt();
		
		for(int i = 1; i <= quantidade; i++) {
			System.out.println("Empregado numero #"+i+ " :");
			
			System.out.println("ID: ");
			int id = ler.nextInt();
			
			while(verificarId(lista, id)) {
				System.out.println("Id j� existente, tente novamente: ");
				id = ler.nextInt();
			}
			
			System.out.println("Nome: ");
			String nome = ler.next();
			System.out.println("Sal�rio: ");
			double salario = ler.nextDouble();
			
			lista.add(new Empregado(id, nome, salario));
		}
		
		// atualizar salario do empregado selecionado
		System.out.println("Digite o id do funcionario para aumentar seu salario: ");
		int id = ler.nextInt();
		Empregado emp = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(emp == null) {
			System.out.println("ID do funcionario n�o existente.");
			
		}else {
			System.out.println("Digite a porcentagem do aumento: ");
			double porcentagem = ler.nextDouble();
			emp.aumentarSalarioPorcentagem(porcentagem);
		}
		
		//listar funcionarios
		System.out.println("Lista de empregados: ");
		for(Empregado obj: lista) {
			System.out.println(obj);
		}
		
		
		ler.close();
	}

	public static boolean verificarId(List<Empregado> lista, int id) {
		Empregado emp = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
