package se15_Exception.model.entities;

import se15_Exception.model.entities.exceptions.NegocioException;

public class Conta {

	private Integer numero;
	private String titular;
	private Double saldo;
	private Double limiteSaque;
	
    public Conta() {
		
	}

	public Conta(Integer numero, String titular, Double saldo, Double limiteSaque) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}
	

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	
	public void deposito(double quantia) {
		saldo += quantia;
	}
	
	public void saque(double quantia) {
		validarSaque(quantia);
		saldo -= quantia;
	}

	private void validarSaque(double quantia) {
		if(quantia > getLimiteSaque()) {
			throw new NegocioException("Erro de saque: A quantia excede o limite de saque");
		}
		if(quantia > getSaldo()) {
			throw new NegocioException("Erro de saque: Saldo insuficente");	
		}
	}
}
