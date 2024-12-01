package aula6.anonimo;




import br.com.pazimports.Cidade;
import br.com.pazimports.Cliente;

public class ProgramaPrincipalGenerico {

	public static void main(String[] args) {
		
		GerenciadorCliente gcli = new GerenciadorCliente();
		gcli.cadastrar(new Cliente());
		
		GerenciadorCidade gcid = new GerenciadorCidade();
		gcid.cadastrar(new Cidade());
		
		

	}

}
