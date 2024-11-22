package aula5.abstratic;

import br.com.generalizacao.Funcionario;

public class Diretor extends Funcionario {

	
	
	public Diretor() {
		
	}
	
	public Diretor(String nome, String cpf, String rg, String cargo, Double salario) {
		  setNome(nome);
		  setCpf(cpf);
		  setRg(cargo);
		  setCargo(cargo);
		  setSalario(salario);
	  }
	
	public Diretor(String nome, Double salario) {
		setNome(nome);
		setSalario(salario);
		
	}
	
	
	@Override
	public double calcularSalario() {
		
		return getSalario() + (10.0 / 100 * getSalario()) ;
	}

	
	
	
	
	
	@Override
	public String toString() {
		
		return "Nome Diretor: "+ getNome() + "Salário: "+ getSalario();
	}
	
	
}
