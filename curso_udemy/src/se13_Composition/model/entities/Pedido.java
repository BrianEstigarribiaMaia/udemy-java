package se13_Composition.model.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import se13_Composition.model.enums.PedidoStatus;

public class Pedido {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momento;
	private PedidoStatus status;
	private Cliente cliente;
	private List<PedidoItem> itens = new ArrayList<>();
	
	public Pedido(Date momento, PedidoStatus status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public PedidoStatus getStatus() {
		return status;
	}

	public void setStatus(PedidoStatus status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<PedidoItem> getItens() {
		return itens;
	}
	
	public void addItem(PedidoItem item) {
		itens.add(item);
	}
	
    public void removerItem(PedidoItem item) {
		itens.remove(item);
	}
    
    public double total() {
    	double soma = 0.0;
    	
    	for(PedidoItem item: itens) {
    	  soma += item.subTotal();	
    	}
    	
    	return soma;
    }
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Momento do Pedido: ");
		sb.append(sdf.format(momento)+ "\n");
		sb.append("Status do pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Itens do Pedido: ");
		
		for(PedidoItem item : itens) {
			sb.append(item + "\n");
		}
		
		sb.append("Peço Total: R$");
		sb.append(String.format("%.2f", total()));

		return sb.toString();
	}
	
}
