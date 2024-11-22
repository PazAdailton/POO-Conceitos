package br.com.generalizacao;

public abstract class Funcionario extends PessoaFisica  {

	
	private String cargo;
	private Double salario;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String cargo) {
		setCargo(cargo);
	}
	
	
	public Funcionario(String nome, String cpf, String rg,  String cargo, Double salario) {
		super();
		setNome(nome);
		setCpf(cpf);
		setRg(rg);
		setCargo(cargo);
		setSalario(salario);
	}

	
	
	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	@Override   //Sobrescrita toString();
	public String toString() {
	return "Funcionario: " + "" +
			"Nome= " + getNome()+  ", Cpf=" + getCpf() + ", Rg=" + getRg() + " " + "Cidade=" + getCidade() + " cargo=" + cargo ;
	}
	
	
	
	//Declaração de método abstrato
	public abstract double calcularSalario();
	
	public double calcularBonificacao() {
		
		return getSalario() + 50;
	}
	
	

}
