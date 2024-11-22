package aula5.abstratic;

import java.util.ArrayList;
import java.util.List;

public class PedidoImpl implements Pedido {

	private Integer codigo = 0;
	private List<ItemPedido> itens = new ArrayList<ItemPedido>();
	
	
	
	
	
	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}

	@Override
	public Integer getCodigo() {
		// TODO Auto-generated method stub
		return codigo;
	}

	@Override
	public Double calcularValorTotal() {
		
		double valorTotal = 0.0;
		if(itens != null) {
			for(ItemPedido item: itens) {
				if(item != null) {
				valorTotal += item.getValor() * item.getQuantidadeItens();
				}
			}
		}
		return valorTotal;
	}

	@Override
	public void adicionarItem(ItemPedido item) {
		
		
		
		
		if(item != null) {
			itens.add(item);
			
			codigo ++;
			
		}else {
			System.out.println("Item não pode ser nulo!");
		}
		
	}

	@Override
	public void removerItemPedido(ItemPedido itemPedido) {
		
		itens.remove(itemPedido);
		
		codigo -= 1;
	}

	@Override
	public void imprimirItens() {
		
		if(itens != null) {
		System.out.println("O código do pedido é: "+ getCodigo());
		System.out.println("Os itens do pedido são : "+ getItens());
		}else {
			System.out.println("Nenhum item no pedido!");
		}
		
		System.out.println("Valor total do pedido: "+ calcularValorTotal());
	}

	@Override
	public ItemPedido[] ordenarItensPedido() {
		
		
		
		return ordenarItensPedido();
	}
	
	@Override
	public List<ItemPedido> getItensPedido() {
		// TODO Auto-generated method stub
		return itens;
	}

	
	
	
	
}
