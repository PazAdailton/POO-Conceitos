package br.com.instituicaoensino.sobrescrita;

public class ProgramaPrincipalConstrutores {

	public static void main(String[] args) {
		
		
		
		Pessoa p1 = new Pessoa(null, null, null);
		//p1.setNome("Jão");
		
		Pessoa p2 = new Pessoa("Jão", new Cidade("CG", new Estado("MS")));
		System.out.println(p2);
		
		System.out.println(new Cidade("CS", new Estado("MAto Grosso", "MS'")));
		
		
		
		
		
		

	}

}
