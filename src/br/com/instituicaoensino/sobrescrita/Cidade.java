package br.com.instituicaoensino.sobrescrita;

public class Cidade extends Estado {

	private String nome;
	private Estado estado;
	
	
	public Cidade() {
		
	}
	
	public Cidade(String nome) {
		setNome(nome);
	}
	
	public Cidade(String nome, Estado estado) {
		this.nome = nome;
		this.estado = estado;
	}
	
	
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Cidade [nome=" + nome + ", estado=" + estado + "]";
	}
	
	
	
	
	
	
}
