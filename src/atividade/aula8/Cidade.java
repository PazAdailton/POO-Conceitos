package atividade.aula8;

import java.util.Objects;

public class Cidade {
	
	private String nome;
	private Estado estado;
	
	public Cidade() {
		
	}
	public Cidade(String nome) {
		setNome(nome);
	}
	
	public Estado getEstado() {
		return estado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cidade other = (Cidade) obj;
		return Objects.equals(nome, other.nome);
	}
	@Override
	public String toString() {
		return ": " + nome + ", estado=" + estado;
	}
	
	
}


