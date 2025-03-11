package Apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import Negocio_2.Imovel;
import Negocio_2.Novo;
import Negocio_2.Usado;

public class VisaoImobiliaria {

	public static void main(String[] args) {
		//variaveis
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		Imovel objImovel = null;
		int opcao;
		
		//entrada
		try {
			System.out.println("Selecione o Imóvel: 1 para novo e 2 para usado");
			opcao = Integer.parseInt(rd.readLine());
			
			if (opcao == 1) {
				objImovel = new Novo();
			} else {
				objImovel = new Usado();
			}
			
			System.out.println("Digite o endereço: ");
			objImovel.setEndereco(rd.readLine());
			
			System.out.println("Digite a metragem: ");
			objImovel.setMetragem(Double.parseDouble(rd.readLine()));
			
			System.out.println("Digite o valor");
			objImovel.setValor(Double.parseDouble(rd.readLine()));
			
			if (opcao == 1) {
				System.out.println("Digite o adicional: ");
				((Novo) objImovel).setAdicional(Double.parseDouble(rd.readLine()));
			} else {
				System.out.println("Digite a depreciação: ");
				((Usado) objImovel).setDepreciacao(Double.parseDouble(rd.readLine()));
			}
			
			System.out.println();
		} catch (Exception erro) {
			System.out.println("Erro: " + erro);
		}
		
		//saida
		System.out.println();
		System.out.println("Endereço: " + objImovel.getEndereco());
		System.out.println("Metragem: " + objImovel.getMetragem());
		System.out.println("Valor: " + objImovel.getValor());
	}

}
