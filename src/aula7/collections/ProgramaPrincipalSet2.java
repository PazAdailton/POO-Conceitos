package aula7.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import br.com.generalizacao.Cliente;

public class ProgramaPrincipalSet2 {

	public static void main(String[] args) {
		
		Set<Cliente> conjunto = new HashSet<Cliente>();
		
		Cliente c1 = new Cliente();
		c1.setNome("Maria");
		
		Cliente c2 = new Cliente();
		c2.setNome("Maria");
		
		Cliente c3 = new Cliente();
		c3.setNome("Jão");
		
		System.out.println(c1.equals(c2));
		
		System.out.println(conjunto.add(c1));
		System.out.println(conjunto.add(c2));
		System.out.println(conjunto.add(c3));
		
		Iterator<Cliente> iterador = conjunto.iterator();
		
		while(iterador.hasNext()) {
			Cliente c = iterador.next();
			System.out.println(c.getNome());
		}
	
	
	
	}

}
