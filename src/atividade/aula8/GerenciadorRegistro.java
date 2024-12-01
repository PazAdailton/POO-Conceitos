package atividade.aula8;

import java.util.List;

public interface GerenciadorRegistro<T> {

	public void salvar(T obj);
	public void excluir(T obj);
	public T pesquisar(T obj);
	List<T> imprimirTodos();
	List<T> getLista();
	
}
