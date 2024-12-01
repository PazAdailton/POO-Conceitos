package aula6.anonimo;


public class GerenciadorRegistrosGenerico<T> {

	//Parametrização
	public void cadastrar(T obj) {
		
			System.out.println(obj.getClass().getSimpleName()+ "Cadastrado com sucesso");
		
	}
	
	
	
	
}
