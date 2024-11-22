package br.com.instituicaoensino.sobrescrita;

public class Curso extends Matricula {
	private String nome;
	private Integer cargaHorario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCargaHorario() {
		return cargaHorario;
	}
	public void setCargaHorario(int cargaHorario) {
		this.cargaHorario = cargaHorario;
	}
}
