package br.com.generalizacao;

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
	
	
	
	
	
}
