package aula6.anonimo;

import aula5.abstratic.ItemPedido;
import aula5.abstratic.Pedido;
import aula5.abstratic.PedidoImpl;

public class ProgramaPrincipalAnonimos {

	public static void main(String[] args) {
		
		
		Pedido pedido = new PedidoImpl();
		
		ItemPedido mouse = new ItemPedido() {
			
			@Override
			public void setValor(Double valor) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setQuantidadeItens(Integer quantidadeItens) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setDescricao(String descricao) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setCodigo(Integer codigo) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public Double getValor() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Integer getQuantidadeItens() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getDescricao() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Integer getCodigo() {
				// TODO Auto-generated method stub
				return null;
			}
		};

	}

}
