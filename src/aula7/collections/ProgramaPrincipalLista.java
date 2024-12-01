package aula7.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.pazimports.Cliente;

public class ProgramaPrincipalLista {

	
	public static void main(String[] args) {
		
		Cliente cli = new Cliente();
		cli.setNome("Jão");
		
		List<Cliente> lista = new ArrayList<Cliente>();
		lista.add(cli);
		lista.add(new Cliente("Maria"));
	
	
	for(Cliente c: lista) {
		System.out.println(c.getNome());
	}
	
	//for para imprimir todos os objetos 
	for(int i=0; i<lista.size(); i++) {
		Cliente c = lista.get(i);
		
		System.out.println(c.getNome());
	}
	
	//Irerador para imprimir passo a passo com o next()

	Iterator<Cliente> iterador = lista.iterator();
	
	while(iterador.hasNext()){
		Cliente cc = iterador.next();
		System.out.println(cc.getNome());
	}
	
	
	
	
	
	
	
	}
}
