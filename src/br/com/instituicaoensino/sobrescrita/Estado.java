package br.com.instituicaoensino.sobrescrita;

public class Estado {
	private String nome;
	private String uf;

	public Estado() {
		
	}
	
	public Estado(String nome) {
		setNome(nome);
	}
	
	public Estado(String nome, String uf) {
		setNome(nome);
		setUf(uf);
	}
	
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}

	@Override
	public String toString() {
		return "Estado [nome=" + nome + ", uf=" + uf + "]";
	}
	
	
	
	
	
	
}
