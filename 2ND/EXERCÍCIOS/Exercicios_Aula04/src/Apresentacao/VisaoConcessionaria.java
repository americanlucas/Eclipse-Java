package Apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import Negocio_1.Carro;
import Negocio_1.Veiculo;

public class VisaoConcessionaria {
	public static void main(String[] args) {
		//variaveis
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		Veiculo objVeiculo = null;
		int opcao;
		objVeiculo = new Carro();
		//entrada
		try {	
			System.out.println();
			System.out.println("Digite o tipo do veículo (Carro <1>, Van <2>, Moto <3>): ");
			opcao = Integer.parseInt(rd.readLine());
			
			if (opcao == 1 | opcao == 2 | opcao == 3) {
				objVeiculo = new Carro();
			} else {
				System.out.println("Este tipo de veículo não existe");
			}
						
			System.out.println("Digite a marca: ");
			objVeiculo.setMarca(rd.readLine());
			
			System.out.println("Digite o modelo: ");
			objVeiculo.setModelo(rd.readLine());
			
			System.out.println("Digite o ano: ");
			objVeiculo.setAno(Integer.parseInt(rd.readLine()));
			
			System.out.println("Digite a quantidade de portas: ");
			((Carro) objVeiculo).setQuantidadePortas(rd.readLine());
			
			
		} catch (Exception erro) {
			System.out.println("Erro: " + erro);
		}
		
		//saida
		System.out.println("Marca: " + objVeiculo.getMarca());
		System.out.println("Modelo: " + objVeiculo.getModelo());
		System.out.println("Ano: " + objVeiculo.getAno());
		System.out.println("Quantidade de portas: " + ((Carro) objVeiculo).getPortas());
	}
}
