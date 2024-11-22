package br.com.pazimports;

public class Main {

	public static void main(String[] args) {
		
		
		Estado estado = new Estado();
		estado.setNome("Mato Grosso do Sul");
		estado.setUf("MS");
		
		Cidade cidade = new Cidade();
		cidade.setNome("Campo Grande");
		cidade.setEstado(estado);
		
		
		Cliente c1 = new Cliente();
		c1.setNome("Jão");
		c1.setCpf("55565656565");
		c1.setRg("44626466");
		c1.setCidade(cidade);  //Relacionamento do objeto cliente com o objeto cidade
		
		
		
		Cliente c2 = new Cliente();
		c2.setNome("Maria");
		c2.setCidade(cidade);
		
		System.out.println(c1.getNome() + " " + 
		c1.getCidade().getNome() + " " + c1.getCidade().getEstado().getNome());
		System.out.println(c2.getNome() + " " + c2.getCidade().getNome());
	
	}

}
