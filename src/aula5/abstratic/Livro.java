package aula5.abstratic;

import java.util.Date;

public class Livro implements ItemPedido {

	private Integer codigo;
	private Double valor;
	private String descricao;
	
	
	private String autor;
	private Date anoPublicacao;
	private String editora;
	private Integer quantidadeItens;
	
	
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
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Date getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(Date anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public Integer getQuantidadeItens() {
		return quantidadeItens;
	}
	public void setQuantidadeItens(Integer quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}
	@Override
	public String toString() {
		return "Livro [codigo=" + codigo + ", valor=" + valor + ", descricao=" + descricao + ", autor=" + autor
				+ ", anoPublicacao=" + anoPublicacao + ", editora=" + editora + ", quantidadeItens=" + quantidadeItens
				+ "]";
	}
	
	
	
}
