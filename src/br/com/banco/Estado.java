package br.com.banco;

public class Estado {

	private String nome;
	private String uf;
	
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
	@Override
	public String toString() {
		return "Estado" + nome + " uf=" + uf + "]";
	}
	
}
