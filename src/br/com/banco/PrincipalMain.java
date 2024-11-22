package br.com.banco;

public class PrincipalMain {

	public static  void main(String [] args) {
		
		 Correntista correntista = new Correntista();
		 correntista.setNome("Jão");
		 correntista.setCpf("54545454545");
		 correntista.setCodigo(52);
		 
		 Estado estado = new Estado();
		 estado.setNome("Santa Catarina");
		 estado.setUf("SC");
		 
		 
		 Cidade cidade = new Cidade();
		 cidade.setNome("Blumenau");
		 cidade.setEstado(estado);
		 
		 
		 Logradouro logradouro = new Logradouro();
		 logradouro.setRua("Rua A");
		 logradouro.setBairro("Fortaleza");
		 logradouro.setCep("6464646");
		 logradouro.setCidade(cidade);
		 
		 Banco banco = new Banco();
		 banco.setNome("Banco do Brasil");
		 banco.setCodigo(88);
		 
		 
		 Agencia agencia = new Agencia();
		 agencia.setNome("BB");
		 agencia.setCodigo(54);
		 agencia.setNumero(56);
		 agencia.setLogradouro(logradouro);
		 agencia.setBanco(banco);
		 
		 Conta conta = new Conta();
		 conta.setNumero(54664656);
		 conta.setCorrentista(correntista);
		 conta.setAgencia(agencia);
		 
		 
		 
		 System.out.println("Número da Conta: " + conta.getNumero());
		 System.out.println("Agência: " + conta.getAgencia().getNome());
		 System.out.println("Código da Agência: " + conta.getAgencia().getCodigo());
		 System.out.println("Número da Agência: " + conta.getAgencia().getNumero());
		 System.out.println("Banco: " + conta.getAgencia().getBanco().getNome());
		 System.out.println("Logradouro: " + conta.getAgencia().getLogradouro().getRua() + ", " 
		                    + conta.getAgencia().getLogradouro().getBairro() + ", " 
		                    + conta.getAgencia().getLogradouro().getCidade().getNome() + ", " 
		                    + conta.getAgencia().getLogradouro().getCidade().getEstado().getNome() + " - " 
		                    + conta.getAgencia().getLogradouro().getCep());
		 System.out.println("Correntista: " + conta.getCorrentista().getNome());
		 System.out.println("CPF do Correntista: " + conta.getCorrentista().getCpf());
		 System.out.println("Código do Correntista: " + conta.getCorrentista().getCodigo());

		 
		 
		 
	
		 
		 
		 
		
		 
		 
		 
		 
		 
		
		
	}
}
