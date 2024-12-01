package atividade.aula8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalAula8 {

	public static <T> void main(String[] args) {
		
		GerenciadorRegistroCliente gCliente = new GerenciadorRegistroCliente();
		
		Scanner scanner = new Scanner(System.in);
		
			int opcao;
			boolean sair = false;
			while(!sair) {
			System.out.println("O que você deseja fazer?");
			System.out.println("1- Inserir Salvar Clientes");
			System.out.println("2- Excluir");
			System.out.println("3- ImprirHomens");
			System.out.println("4- ImprirmirMulheres");
			System.out.println("5- Imprimir por Cidade");
			System.out.println("6- Imprimir busca de Cliente");
			System.out.println("7- ImprimirTodos");
			System.out.println("8- sair");
			
			opcao =	scanner.nextInt();
			
			List<Cliente> lista = new ArrayList<Cliente>();
			
			switch(opcao) {
			case 1: 
				System.out.println("Quantos clientes você deseja cadastrar?");
				int qtd = scanner.nextInt();
				
				
				
				for(int i=0; i<qtd; i++) {
					Cliente cliente = new Cliente();
				
				System.out.println("Inform seu id: ");
				while(!scanner.hasNextInt()) {
					System.out.println("Informe apenas números!");
					scanner.next();
				}
				
				
				int id = scanner.nextInt();
				cliente.setId(id);
				
							
				boolean idExiste = false;
				for(Cliente cli: gCliente.getLista()) {
					if(cli.getId() == id) {
						idExiste = true;
						break;
					}
				}
				
				
				if(idExiste || id<= 0) {
					System.out.println("Esse ID não pode ser cadastrado! Tente novamente!");
					i--;
					continue;
				}
				
				while(true) {
				System.out.println("Informe seu nome: ");
				cliente.setNome(scanner.next());
				
				if(cliente.getNome().matches("[a-zA-Z\\s]+")) {
					break;
				}else {
					System.out.println("Não pode caracteres especiais!");
					continue;
				}
				}//while
				
				
				while(true) {
				System.out.println("Informe  sua cidade: ");
				
				String nomeCidade = scanner.next();
				
				Cidade cidade = new Cidade(nomeCidade);
				cliente.setCidade(cidade);
				
				if(cliente.getCidade().getNome().matches("[a-zA-Z\\s]+")) {
					break;
				}else {
					System.out.println("Não pode caracteres especiais!");
					
				}
				}//while cidade
				
				
				
				System.out.println("Informe seu sexo com " + "F" + " ou" + " M");
				
				char sexo = scanner.next().toUpperCase().charAt(0);
				
				while(sexo != 'M' && sexo != 'F') {
					System.out.println("Entrada de dados inválida: ");
					System.out.println("Digite novamente seu Sexo com " + "F" + " ou" + " M");
					sexo = scanner.next().toUpperCase().charAt(0);
					
				}
				
				cliente.setSexo(sexo);
				lista.add(cliente);
				gCliente.salvar(cliente);
				System.out.println("Salvo com sucesso!");
				System.out.println("Cliente cadastrado "+ gCliente.getLista());
					
				} //for
				break;
		
				case 2:
				
					System.out.println("Informe o id para ser removido: ");
					int idExcluir = scanner.nextInt();
					
					Boolean removido = false;
					
					
					for(Cliente c: new ArrayList<>(gCliente.getLista())) {
					if(c.getId() == idExcluir) {
					gCliente.excluir(c);
					removido = true;
					System.out.println("Excluído com sucesso!");
					}
					}
					if(!removido)
					System.out.println("Não foi possível excluir!");
					
					scanner.nextLine();
				break;
				
				case 3:
					
				List<Cliente> listaHomens = gCliente.getListaHomens(gCliente.getLista());
				
				if(!listaHomens.isEmpty()) {
					for(Cliente homens: listaHomens) {
						System.out.println("A lista é: "+ homens);
					}
						
					
				}else {
					System.out.println("Não foi possível retornar a lista de clientes!");
				}
					
				break;
				
				case 4:
					
				List<Cliente> listaMulheres = gCliente.getListaMulheres(gCliente.getLista());
					
				if(!listaMulheres.isEmpty()) {
					for(Cliente mulheres: listaMulheres) {
						System.out.println("A lista de mulheres é: "+ mulheres);
					}
				}else {
					System.out.println("Não foi possível obter a lista de mulheres!");
				}
					
				break;
				
				case 5:
					
					System.out.println("Informe o nome da cidade que deseja fazer a busca: ");
					
					String nomeBuscarCidade = scanner.next();
					
					
					List<Cliente> listaCidade = gCliente.getListaCidade(gCliente.getLista(), nomeBuscarCidade);
					
					if(!listaCidade.isEmpty()){
						
						System.out.println("Clientes na cidade: " + nomeBuscarCidade + ":");
						for(Cliente cliente: listaCidade) {
						
						System.out.println(": "+ cliente);
						
					} //for 
						
					} else {
						System.out.println("Não foi possível imprimir lista de cidades!");
					}
				break;
				
				case 6: 
					
					System.out.println("Digite o nome do cliente que quer buscar: ");
					
					String clienteBusca = scanner.next();
					
				List<Cliente> clienteLista = gCliente.getLista();
				
				
					for(Cliente cli: clienteLista) {
						
						if(cli.getNome().equals(clienteBusca)) {
							System.out.println("O cliente pesquisado foi: "+ cli);
					}
				}
					
					System.out.println("Não foi possível encontrar o cliente!");
					
				break;
				
				case 7:
					
					List<Cliente> listaCliente = gCliente.getLista();
					
						if(listaCliente != null) {
							gCliente.imprimirTodos();
						}else {
							System.out.println("Não foi possível imprimir todos!");
							
						}

				break;
			
				case 8:
					System.out.println("Saindo");
				sair = true;
				break;
				
				default: 
					System.out.println("Não foi possível encontrar essa opção!");
				break;
				

					
			
			
				} //switch principal
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

	

	}
			scanner.close();
}
}
