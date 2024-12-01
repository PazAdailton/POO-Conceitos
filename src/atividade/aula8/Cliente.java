package atividade.aula8;

import java.util.Objects;

public class Cliente {
	
	private Integer id;
	private String nome;
	private String cpf;
	private String rg;
	protected Cidade cidade;
	private Character sexo;
	
	public Cliente() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cidade, cpf, id, nome, rg, sexo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(cidade, other.cidade) && Objects.equals(cpf, other.cpf) && Objects.equals(id, other.id)
				&& Objects.equals(nome, other.nome) && Objects.equals(rg, other.rg) && Objects.equals(sexo, other.sexo);
	}
	
	

	@Override
	public String toString() {
		return "Cliente de id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", cidade" + cidade + ", sexo="
				+ sexo;
	}
	

	
	
	
	
	
	
}
