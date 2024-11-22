package aula5.abstratic;

public class ProgramaPrincipalPedido {

	public static void main(String[] args) {
		
		Pedido p1 = new PedidoImpl();
		
		Pedido p2 = new PedidoImpl();
		
		ItemPedido livro1 =  new Livro();
		livro1.setCodigo(2);
		livro1.setDescricao("Dom Casmurro");
		livro1.setQuantidadeItens(1);
		livro1.setValor(50.0);
		
		
		p2.adicionarItem(livro1);
		p2.calcularValorTotal();
		p2.imprimirItens();
		
		
		
		
		
		ItemPedido livro = new Livro();
		livro.setCodigo(1);
		livro.setQuantidadeItens(2);
		livro.setValor(15.0);
		
		
		
		
		ItemPedido curso = new Curso();
		curso.setCodigo(2);
		curso.setQuantidadeItens(3);
		curso.setValor(30.0);
		
		p1.adicionarItem(livro);
		p1.adicionarItem(curso);
		p1.calcularValorTotal();
		p1.imprimirItens();
		
		
		
	
		
	}

}
