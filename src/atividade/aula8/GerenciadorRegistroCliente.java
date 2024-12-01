package atividade.aula8;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorRegistroCliente extends GerenciadorRegistroGenerico<Cliente> {

	
	public List<Cliente> getListaHomens(List<Cliente> clientes) {
		List<Cliente> homens = new ArrayList<Cliente>();
		
		for(Cliente cliente: clientes) {
			if((cliente.getSexo() == 'M') || (cliente.getSexo() == 'm')) {
				
				homens.add(cliente);
				
			}
		}
		
		return homens;
		
	}
	
	
	public List<Cliente> getListaMulheres(List<Cliente> clientes) {
		List<Cliente> mulheres = new ArrayList<Cliente>();
		
		for(Cliente cliente: clientes) {
			if(cliente.getSexo() == 'F' || cliente.getSexo() == 'f') {
				mulheres.add(cliente);
			}
		}
		return mulheres;
	}
	
	
	public List<Cliente> getListaCidade(List<Cliente> clientes, String nomeBuscarCidade) {
		List<Cliente> listaCidade = new ArrayList<Cliente>();
		for(Cliente cliente: clientes) {
			if((cliente.getCidade().getNome() != null) &&  (cliente.getCidade().getNome().equals(nomeBuscarCidade))) {
				listaCidade.add(cliente);
			}
		}
		return listaCidade;
	}
}
