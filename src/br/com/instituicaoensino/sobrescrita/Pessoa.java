package br.com.instituicaoensino.sobrescrita;

import java.util.Objects;

public class Pessoa {
	private Integer codigo;
	private String nome;
	private Cidade cidade;
	
	
	public Pessoa() {
		super();
	}
	
	public Pessoa(Integer codigo, String nome, Cidade cidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.cidade = cidade;
	}
	
	public Pessoa(String nome, Cidade cidade) {
		setNome(nome);
		setCidade(cidade);
	}
	public Pessoa(String nome) {
		setNome(nome);
	}
	
	
	
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
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
		Pessoa other = (Pessoa) obj;
		return Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cidade=" + cidade + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
