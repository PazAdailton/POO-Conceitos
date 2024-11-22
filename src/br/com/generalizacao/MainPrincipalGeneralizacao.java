package br.com.generalizacao;

import br.com.banco.Cidade;
import br.com.banco.Estado;

public class MainPrincipalGeneralizacao {

	public static void main(String[] args) {
		
		 Estado estado = new Estado();
		 estado.setNome("Mato Grosso do Sul");
		 estado.setUf("MS");
		 
		 
		 Cidade cidade = new Cidade();
		 cidade.setNome("Campo Grande");
		 cidade.setEstado(estado);
		
		
		 Cliente cli = new Cliente();
		 cli.setNome("Jão");
		 cli.setCpf("545454454");
		 cli.setRg("611661616");
		 cli.setCidade(cidade);
		
		
		 Fornecedor fornecedor = new Fornecedor();
	
		
		 Pessoa pessoa = new Pessoa();

	}

}
