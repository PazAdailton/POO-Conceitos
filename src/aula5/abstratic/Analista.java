package aula5.abstratic;

import br.com.generalizacao.Funcionario;

  public class Analista extends Funcionario{

	
	  public Analista() {
		  
	  }
	  
	  public Analista(String nome, String cpf, String rg, String cargo, Double salario) {
		  setNome(nome);
		  setCpf(cpf);
		  setRg(cargo);
		  setCargo(cargo);
		  setSalario(salario);
	  }
	  
	  public Analista(String nome, Double salario) {
		  setNome(nome);
		  setSalario(salario);
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  @Override
	public double calcularSalario() {
		return getSalario() + (5.0 / 100 * getSalario()); 
	}
	  	
	
	
	
	@Override
	public String toString() {
		return "Nome Analista: " + getNome() + "Salário Analista: "+ getSalario();
	}
	  
	  
	  
}
