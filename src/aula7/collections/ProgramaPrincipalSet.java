package aula7.collections;

import java.util.HashSet;
import java.util.Set;

import br.com.pazimports.Cliente;

public class ProgramaPrincipalSet {

	public static void main(String []args) {
		
		Set<Cliente> conjunto = new HashSet<Cliente>();
		
		Cliente c1 = new Cliente();
		c1.setNome("Jão");
		
		Cliente c2 = new Cliente();
		c2.setNome("Jão");
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode() + " " + c2.hashCode());
		
//		System.out.println(conjunto.add(c1));
//		System.out.println(conjunto.add(c2));
	}
	
	
	
	
}
