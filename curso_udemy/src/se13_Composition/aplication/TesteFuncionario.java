package se13_Composition.aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import se13_Composition.entities.Departamento;
import se13_Composition.entities.Funcionario;
import se13_Composition.entities.HorasContrato;
import se13_Composition.entities.enums.NivelFuncionario;

public class TesteFuncionario {

	public static void main(String[] args) throws ParseException {
		
	    Scanner ler = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Digite o nome do departamento: ");
		String nomeDepartamento = ler.nextLine();
		System.out.println("Digite os dados do funcionario:");
		System.out.print("Nome: ");
		String nomeFuncionario = ler.nextLine();
		System.out.print("Nivel: ");
		String nivelFuncionario = ler.nextLine();
		System.out.print("Salario base: ");
		double salarioBase = ler.nextDouble();
		Funcionario funcionario = new Funcionario(nomeFuncionario, NivelFuncionario.valueOf(nivelFuncionario), salarioBase, new Departamento(nomeDepartamento));
		
		System.out.print("Quantos contratos possui o funcionario? ");
		int n = ler.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Digite os dados do contrato #" + i + " :");
			System.out.print("Data (DD/MM/YYYY): ");
			Date dataContrato = sdf.parse(ler.next());
			System.out.print("Valor por hora: ");
			double valorPorHora = ler.nextDouble();
			System.out.print("Duração (horas): ");
			int horas = ler.nextInt();
			HorasContrato contrato = new HorasContrato(dataContrato, valorPorHora, horas);
			funcionario.addContrato(contrato);
		}
		
		System.out.println();
		System.out.print("Digite o mes e o ano para calcular a renda (MM/YYYY): ");
		String mesEAno = ler.next();
		int mes = Integer.parseInt(mesEAno.substring(0, 2));
		int ano = Integer.parseInt(mesEAno.substring(3));
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Departamento: " + funcionario.getDepartamento().getNome());
		System.out.println("Renda:  " + mesEAno + ": " + String.format("%.2f", funcionario.renda(ano, mes)));
		
		ler.close();

	}

}
