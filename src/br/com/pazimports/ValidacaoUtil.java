package br.com.pazimports;

public class ValidacaoUtil {
	
	
	
	public static final Double X = 10500.5;

	public static boolean validaCPF(String cpf){
		
		if(cpf.length() != 11) {
			return false;
		} 
		return true;
		
	}
		
	public static boolean validaRG(String rg) {
		
		return true;
	}
	
	public static boolean validaEmail(String email) {
		
		return true;
	}


}
