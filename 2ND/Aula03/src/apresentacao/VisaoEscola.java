package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio2.Aluno;
import negocio2.Cadeira;
import negocio2.Professor;
import negocio2.Turma;

public class VisaoEscola {

	public static void main(String[] args) {
		//variaveis
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		Turma objTurma = new Turma();
		Professor objProfessor = new Professor();
		
		//entrada
		try {
			System.out.println("Digite o nome da cadeira: ");
			objTurma.setObjCadeira(new Cadeira(rd.readLine()));
			
			System.out.println("Digite o nome do professor: ");
			objProfessor.setNome(rd.readLine());
			
			System.out.println("Digite o título do professor: ");
			objProfessor.setTitulo(rd.readLine());
			
			System.out.println("Digite o salário do professor: ");
			objProfessor.setSalario(Double.parseDouble(rd.readLine()));
			
			objTurma.setObjProfessor(objProfessor);
			
			do {
				Aluno objAluno = new Aluno();
				
				System.out.println("Digite a matrícula do aluno: ");
				objAluno.setMatricula(Integer.parseInt(rd.readLine()));
				
				System.out.println("Digite o nome do aluno: ");
				objAluno.setNome(rd.readLine());
				
				objTurma.adicionarAluno(objAluno);
				
				System.out.println("Digite <s> se houver mais alunos: ");
			} while (rd.readLine().equalsIgnoreCase("s"));
			
		} catch (Exception erro) {
			System.out.println("ERRO!" + erro);
		}
		
		//saida
		System.out.println("Cadeira: " + objTurma.getObjCadeira().getNome());
		System.out.println("Professor: " + objTurma.getObjProfessor().getNome());
		System.out.println();
		objTurma.listarAluno();
	}

}
