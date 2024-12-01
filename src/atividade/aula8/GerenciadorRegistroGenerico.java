package atividade.aula8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GerenciadorRegistroGenerico<T> implements GerenciadorRegistro<T> {

	private List<T> lista = new ArrayList<T>();

	@Override
	public void salvar(T obj) {
		
		if(obj != null) {
			lista.add(obj);
			System.out.println("Objeto salvo com sucesso!");
		}else {
			System.out.println(obj.getClass().getSimpleName()+ "Não foi possível salvar!");
		}
		
	}

	@Override
	public void excluir(T obj) {
		if(obj != null && lista.remove(obj)) {
			System.out.println("Objeto removido!");
		}else {
			System.out.println("Não foi possível remover o objeto!");
		}
		
	}

	@Override
	public T pesquisar(T criterio) {
		
		for(T item: lista) {
			if(item.equals(criterio)) {
				System.out.println("Objeto encontrado: "+ item);
				return item;
				}
			}
		System.out.println("Objeto não encontrado!");
		return null;
		}

	@Override
	public List<T> imprimirTodos() {
		System.out.println("Lista com todos os clientes!");
		
		Iterator<T> iterador = lista.iterator();
		while(iterador.hasNext()) {
		T item = iterador.next();	
		System.out.println(item.toString());
		}
		
		
		return lista;
	}

	@Override
	public List<T> getLista() {
		
		return lista;
	}
	
	
	
	
	
	
	
}
