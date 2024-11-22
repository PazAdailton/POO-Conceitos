package br.com.pazimports;

public class Cliente {
		
	private String nome;
	private String rg;
	private String cpf;
	private Cidade cidade;
	
	private static int qtdCliente=0;
	
	public Cliente() {
		qtdCliente ++;
	}
	public static int getQtdCliente() {
		
		
		return qtdCliente;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome.toUpperCase();
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
}
