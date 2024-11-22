package aula5.abstratic;

import br.com.generalizacao.Funcionario;

public class ProgramaPrincipalAbstratos {

	public static void main(String[] args) {
		
		
		Funcionario f1 = new Analista("Jão", 5000.0);
		
		double salF1 = f1.calcularSalario() + f1.calcularBonificacao();
		
		double somaSal = salF1 - f1.getSalario();
		
		

		
		
		
		Funcionario f2 =  new Diretor("Maria", 5000.00);
		double salF2 = f2.calcularSalario();
		
		System.out.println(somaSal + " " + salF2);

	}

}
