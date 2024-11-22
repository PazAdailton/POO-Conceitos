package br.com.instituicaoensino;

import java.util.Date;
import java.util.Scanner;

public class ProgramaPrincipalMatricula {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de matriculas: ");
		Integer qtdPos = scanner.nextInt();

		GerenciadorMatricula gm = new GerenciadorMatricula();
		
		gm.setQtdMatriculas(qtdPos);

		for (int i = 0; i <gm.getQtdMatriculas(); i++) {

			Curso curso = new Curso();

			System.out.println("Nome do curso: ");
			curso.setNome(scanner.next());
			scanner.nextLine();

			System.out.println("Informe a carga horária do curso: ");
			curso.setCargaHorario(scanner.nextInt());

			Aluno aluno = new Aluno();

			System.out.println("Código do aluno: ");
			aluno.setCodigo(scanner.nextInt());

			System.out.println("Digite seu nome: ");
			aluno.setNome(scanner.next());

			System.out.println("Digite seu cpf: ");
			aluno.setCpf(scanner.next());

			Matricula m = new Matricula();
			m.setAluno(aluno);
			m.setCurso(curso);
			m.setData(new Date());

			gm.cadastrar(m);

		}
			
		System.out.println("Deseja buscar por aluno(1) ou curso(2)?");
		int opcao = scanner.nextInt();
		Matricula[] matBusca = null;
		
		if(opcao == 1) {
		System.out.println("Digite o código do aluno para busca: ");
		Aluno alunoBusca = new Aluno();
		alunoBusca.setCodigo(scanner.nextInt());
		matBusca = gm.buscarMatriculas(alunoBusca);
		} else {
			System.out.println("Digite o nome do curso para busca: ");
			Curso cursoBusca = new Curso();
			cursoBusca.setNome(scanner.next());
			matBusca = gm.buscarMatriculas(cursoBusca);
		}
		

		for (int i = 0; i < matBusca.length; i++) {
			if (matBusca[i] == null) {
				break;
			}
				System.out.println(matBusca[i].getAluno().getNome() + 
				"Cod Matricula: " +matBusca[i].getCodigo()
				+ "Nome Curso: " + matBusca[i].getCurso().getNome());
		}
		
		scanner.close();
	}

}
