package se13_Enum.aplication;

import java.util.Date;

import se13_Enum.entities.Pedido;
import se13_Enum.entities.enums.PedidoStatus;

public class TestePedido {

	public static void main(String[] args) {
		Pedido pedido = new Pedido(1080, new Date(), PedidoStatus.PAGAMENTO_PENDENDE);
		
		System.out.println(pedido);
		
		PedidoStatus ps1 = PedidoStatus.ENTREGUE;
		
		System.out.println(ps1);
	}

}
