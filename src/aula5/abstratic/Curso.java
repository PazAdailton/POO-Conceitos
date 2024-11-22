package aula5.abstratic;

public class Curso implements ItemPedido {

	private Integer codigo;
	private Double valor;
	private String descricao;
	private Integer quantidadeItens;
	
	//Outras
	
	private String conteudo;
	private String publicoAlvo;
	private Integer cargaHoraria;
	private String professor;
	
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public String getPublicoAlvo() {
		return publicoAlvo;
	}
	public void setPublicoAlvo(String publicoAlvo) {
		this.publicoAlvo = publicoAlvo;
	}
	public Integer getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	
	public Integer getQuantidadeItens() {
		return quantidadeItens;
	}
	public void setQuantidadeItens(Integer quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}
	@Override
	public String toString() {
		return "Curso [codigo=" + codigo + ", valor=" + valor + ", descricao=" + descricao + ", quantidadeItens="
				+ quantidadeItens + ", conteudo=" + conteudo + ", publicoAlvo=" + publicoAlvo + ", cargaHoraria="
				+ cargaHoraria + ", professor=" + professor + "]";
	}
	
	
	
}
