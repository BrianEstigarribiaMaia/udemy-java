package se13_Composition.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import se13_Composition.entities.enums.NivelFuncionario;

public class Funcionario {

	private String nome;
	private NivelFuncionario nivel;
	private double salarioBase;
	
	private Departamento departamento;
	private List<HorasContrato> contratos = new ArrayList<>();
	
	public Funcionario() {
		
	}

	public Funcionario(String nome, NivelFuncionario nivel, double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelFuncionario getNivel() {
		return nivel;
	}

	public void setNivel(NivelFuncionario nivel) {
		this.nivel = nivel;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HorasContrato> getContratos() {
		return contratos;
	}

	public void addContrato(HorasContrato contrato) {
		contratos.add(contrato);
	}
	
	public void removerContrato(HorasContrato contrato) {
		contratos.remove(contrato);
	}
	
	public double renda(int ano, int mes) {
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		
		for(HorasContrato hc : contratos) {
			cal.setTime(hc.getData());
			int hc_ano = cal.get(Calendar.YEAR);
			int hc_mes = 1 + cal.get(Calendar.MONTH);
			
			if(ano == hc_ano && mes == hc_mes) {
				soma += hc.valorTotal();
			}
		}
		
		return soma;
	}
	
}
