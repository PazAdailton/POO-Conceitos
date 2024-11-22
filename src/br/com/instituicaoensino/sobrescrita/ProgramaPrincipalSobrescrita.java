package br.com.instituicaoensino.sobrescrita;

import java.util.Scanner;

public class ProgramaPrincipalSobrescrita {

		public static void main(String [] args) {
			
			Scanner scanner = new Scanner(System.in);
			
	Pessoa p1 = new Pessoa(null, null, null);
	p1.setNome("Jão");
	
	Pessoa p2 = new Pessoa(null, null, null);
	p2.setNome("Jão");
	
	System.out.println(p1.equals(p2));
	
	System.out.println("HashCode p1: " + p1.hashCode());
	System.out.println("HashCode p2: " + p2.hashCode());
			
			
			scanner.close();
			
			
			
			
			
		}
	
	
	
}
