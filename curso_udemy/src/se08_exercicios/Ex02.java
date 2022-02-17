package se08_exercicios;

/*
 * Empregado
 */
public class Ex02 {

	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void aumentoSalarial(double porcentagem) {
		salarioBruto += salarioBruto * porcentagem / 100.0;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + 
			   " | Salario Liquido: R$" + String.format("%.2f",salarioLiquido());
	}
	
	
}
