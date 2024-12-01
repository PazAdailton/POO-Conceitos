package br.com.generalizacao;

import java.util.Objects;

import br.com.banco.Cidade;

public class Pessoa {

	private String nome;
	private Cidade cidade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cidade=" + cidade + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cidade, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(cidade, other.cidade) && Objects.equals(nome, other.nome);
	}
	
	
	
	
	
}
