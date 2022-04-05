package se14_Heranca.entities;

public class ProdutoImportado extends Produto{

	private Double taxaAlfadegaria;

	public ProdutoImportado(String nome, Double preco, Double taxaAlfadegaria) {
		super(nome, preco);
		this.taxaAlfadegaria = taxaAlfadegaria;
	}

	public Double getTaxaAlfadegaria() {
		return taxaAlfadegaria;
	}

	public void setTaxaAlfadegaria(Double taxaAlfadegaria) {
		this.taxaAlfadegaria = taxaAlfadegaria;
	}
	
	public Double precoTotal() {
		return getPreco() + taxaAlfadegaria;
	}
	
	@Override
	public String tagPreco() {
		return getNome() + " R$" +
		       String.format("%.2f", precoTotal()) +
		       "(Taxa alfandegaria: R$" +
		       String.format("%.2f", taxaAlfadegaria) + ")";
	}
}
