package br.com.pazimports;

import javax.swing.JOptionPane;

public class ProgramaPrincipalStaticos {

	public static void main(String[] args) {
		
		
	Cliente c1 =	new Cliente();
	Cliente c2 = 	new Cliente();
	Cliente c3 = 	new Cliente();
	
	
	
	String cpf = JOptionPane.showInputDialog(null, "CPF: ");
	
	if(ValidacaoUtil.validaCPF(cpf)== true) {
	c1.setCpf(cpf);
	}else {
	JOptionPane.showMessageDialog(null, "CPF Inválido!");	
	}
	
	System.out.println(Cliente.getQtdCliente());
	
	System.out.println(ValidacaoUtil.X);
	
	// ctrl shift c coloca tudo selecionado em comentário
	
	
	
	}
	
	

}
