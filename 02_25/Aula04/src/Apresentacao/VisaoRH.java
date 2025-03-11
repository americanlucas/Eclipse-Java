package Apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import Negocio.Colaborador;
import Negocio.Gerente;

public class VisaoRH {

	public static void main(String[] args) {
		//variaveis
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		Colaborador objColaborador = null;
		String opcao;
		
		//entrada
		try {
			System.out.println("Digite <C> para colaborador ou <G> para gerente");
			opcao = rd.readLine();
			
			if (opcao.equalsIgnoreCase("C")) {
				objColaborador = new Colaborador();
			} else {
				objColaborador = new Gerente();
			}
			
			System.out.println("Digite a matrícula: ");
			objColaborador.setMatricula(Integer.parseInt(rd.readLine()));
			
			System.out.println("Digite o nome: ");
			objColaborador.setNome(rd.readLine());
			
			System.out.println("Digite o salário: ");
			objColaborador.setSalario(Double.parseDouble(rd.readLine()));
			
			if (opcao.equalsIgnoreCase("G")) {
				System.out.println("Digite o Bonus: ");
				((Gerente) objColaborador).setBonus(Double.parseDouble(rd.readLine()));
				//Transforma objColaborador em um objeto da classe gerente
			}
			
		} catch (Exception erro) {
			System.out.println("Erro" + erro);
		}
		
		//saida
		System.out.println();
		System.out.println("Matrícula: " + objColaborador.getMatricula());
		System.out.println("Nome: " + objColaborador.getNome());
		System.out.println("Salário: " + objColaborador.getSalario());
	}

}
