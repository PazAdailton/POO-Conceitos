package br.com.banco;

public class Cidade {
		
	private Estado estado;
	private String nome;
	
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Estado=" + estado + "Cidade=" + nome + "]";
	}
	
	
	
}
