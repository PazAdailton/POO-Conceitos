package br.com.generalizacao;

import aula5.abstratic.Analista;
import br.com.banco.Cidade;
import br.com.banco.Estado;

public class MainPrincipalGeneralizacao2 {

	public static void main(String[] args) {
		
		Estado estado = new Estado();
		estado.setNome("Mato Grosso do Sul");
		estado.setUf("MS");
		
		Cidade cidade = new Cidade();
		cidade.setNome("Campo Grande");
		cidade.setEstado(estado);
		
		//tipo abstrato    = tipo mais específico 
		Funcionario fun1 = new Analista(); //Atribuição polimórfica
		fun1.setNome("Jão\n");
		fun1.setCargo("Gerente");
		fun1.setCidade(cidade);
	
		
		
		
		System.out.println(fun1);
	}

}
