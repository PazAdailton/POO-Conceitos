package aula5.abstratic;

import java.util.List;

public interface Pedido {
	
	public Integer getCodigo();
	public Double calcularValorTotal();
	public void adicionarItem(ItemPedido item);
	public void removerItemPedido(ItemPedido itemPedido);
	public void imprimirItens();
	public ItemPedido[] ordenarItensPedido();
	public List<ItemPedido> getItensPedido();
	
}
