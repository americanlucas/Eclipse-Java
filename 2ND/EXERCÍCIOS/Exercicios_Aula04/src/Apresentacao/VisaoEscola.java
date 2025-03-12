package Apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import Negocio_2.Admin;
import Negocio_2.Funcionario;
import Negocio_2.Professor;

public class VisaoEscola {

	public static void main(String[] args) {
		// variaveis
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		Funcionario objFuncionario = null;
		int opcao = 0;
		
		//entrada
		try {
			System.out.println("Selecione o tipo de funcionário: Professor <1> | Administrador <2>");
			opcao = Integer.parseInt(rd.readLine());
			
			if (opcao == 1) {
				objFuncionario = new Professor();
			} else {
				objFuncionario = new Admin();
			}
			
			System.out.println("Digite seu nome: ");
			objFuncionario.setNome(rd.readLine());
			
			System.out.println("Digite seu cpf: ");
			objFuncionario.setCpf(Integer.parseInt(rd.readLine()));
			
			System.out.println("Digite seu salário: ");
			objFuncionario.setSalario(Double.parseDouble(rd.readLine()));
			
			if (opcao == 1) {
				System.out.println("Digite a sua disciplina: ");
				((Professor) objFuncionario).setDisciplina(rd.readLine());
			} else {
				System.out.println("Digite o seu setor: ");
				((Admin) objFuncionario).setSetor(rd.readLine());
			}
			
			
		} catch (Exception erro) {
			System.out.println("Erro: " + erro);
		}
		
		//saida
		System.out.println("Nome: " + objFuncionario.getNome());
		System.out.println("CPF: " + objFuncionario.getCpf());
		System.out.println("Salário: R$" + objFuncionario.getSalario());
		if (opcao == 1) {
			System.out.println("Disciplina: " + ((Professor)objFuncionario).getDisciplina());
		} else {
			System.out.println("Setor: " + ((Admin) objFuncionario).getSetor());
		}
		
	}

}
