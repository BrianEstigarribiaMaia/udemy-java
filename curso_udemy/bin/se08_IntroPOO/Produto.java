package se08_IntroPOO;

public class Produto {

	public String nome;
	public double preco;
	public int quantidade;
	
	public double totalValorEmEstoque() {
		return preco * quantidade;
	}
	
	public void adicionarProdutos(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	@Override
	public String toString() {
		return "Produto [nome: " + nome + ", preco: " + preco + 
				", quantidade: " + quantidade + 
				", Valor total dos produtos em estoque: "+
				String.format("%.2f", totalValorEmEstoque())+ "]";
	}
	
	
}
