package br.com.instituicaoensino.sobrescrita;

public class GerenciadorMatricula {
	
	private Matricula matriculas[];
	private Integer codSequencial=1;
	private Integer pos=0;
	private Integer QtdMatriculas;

	
	public GerenciadorMatricula() {
		
	}
	
	public GerenciadorMatricula(Integer QtdMatriculas) {
		setQtdMatriculas(QtdMatriculas);
	}
				//métodos 
	
	public void cadastrar(Matricula mat) {
		
		Integer codigoSequencial = gerarCodigoSequencial();
		
		mat.setCodigo(codigoSequencial);
		
		if(pos < matriculas.length) {
			
		
		matriculas[pos++] = mat;
		
		}
		
	}
	
	public Matricula[] busMatriculas(String nomeAluno, String nomeCurso) {
		
		
		return null;
	}
	
	
	//Sobrecarga de Métodos com parâmetros/tipos diferentes 
	public Matricula[] buscaMatriculas(Curso curso) {
		
		return null;
	}
	
	public Matricula[] buscarMatriculas(Aluno alunoBusca) {
		
		Matricula matResultado[] = new Matricula[getQtdMatriculas()];
		
		int j=0;
		
		for (int i=0; i<getQtdMatriculas(); i++) {
			
		//comparando o código do aluno da matricula com o código do aluno da busca	
		if(	matriculas[i].getAluno().getCodigo() == alunoBusca.getCodigo()) {
			
		matResultado[j++]	= matriculas[i];
		
		
		}
			
		}
		
		return matResultado;
	}
	
	public Integer gerarCodigoSequencial() {
		
		return codSequencial ++;
	}
	
	
	
	public void setQtdMatriculas(Integer qtdMatriculas) {
		
		matriculas = new Matricula[qtdMatriculas];
		
	}
	
	public int getQtdMatriculas() {
		return matriculas.length;
	}
	
	
	
	public Matricula[] getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(Matricula[] matriculas) {
		this.matriculas = matriculas;
	}

	public Integer getCodSequencial() {
		return codSequencial;
	}

	public void setCodSequencial(Integer codSequencial) {
		this.codSequencial = codSequencial;
	}

	
}
