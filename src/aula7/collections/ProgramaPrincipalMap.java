package aula7.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProgramaPrincipalMap {

	public static void main(String[] args) {
	
		//Associação de objetos com chave e valor
		Map<String, String> linguagemProgramacao = new HashMap<String, String>();
		linguagemProgramacao.put("Java", "Web, Oracle");
		linguagemProgramacao.put("C#", "Web, Microsoft");
		
		
		
		
		 Set<String>  chaves =  linguagemProgramacao.keySet();
		 
		 for(String c: chaves) {
		 System.out.println(c + ": " + linguagemProgramacao.get(c));
		 }
		 

	}

}
