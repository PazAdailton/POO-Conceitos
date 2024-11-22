package br.com.instituicaoensino.sobrescrita;

public class Professor extends Funcionario{
	
	private Disciplina disciplina;
	
	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	
}
