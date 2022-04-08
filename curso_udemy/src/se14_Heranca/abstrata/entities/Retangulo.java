package se14_Heranca.abstrata.entities;

import se14_Heranca.entities.enums.Cores;

public class Retangulo extends Forma{

	private Double largura;
	private Double altura;
	
	public Retangulo() {
		super();
	}

	public Retangulo(Cores cor,Double largura, Double altura) {
		super(cor);
		this.largura = largura;
		this.altura = altura;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
        return largura * altura;
	}
	
}
