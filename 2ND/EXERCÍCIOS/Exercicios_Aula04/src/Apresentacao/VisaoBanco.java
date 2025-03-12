package Apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import Negocio_3.ContaBancaria;
import Negocio_3.ContaCorrente;
import Negocio_3.ContaInvestimento;

public class VisaoBanco {

	public static void main(String[] args) {
		// variaveis
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		ContaBancaria objConta = null;
		int opcao = 0;
		//entrada
		
		try {
			System.out.println("Digite o recurso utilizado: Cheque especial <1> | Tesouro Selic <2>");
			opcao = Integer.parseInt(rd.readLine());

			if (opcao == 1) {
				objConta = new ContaCorrente();
			} else {
				objConta = new ContaInvestimento();
			}
						
			System.out.println("Digite o nome do titular: ");
			objConta.setTitular(rd.readLine());
			
			System.out.println("Digite o número da conta: ");
			objConta.setNumeroConta(Integer.parseInt(rd.readLine()));
			
			System.out.println("Digite o saldo: ");
			objConta.setSaldo(Double.parseDouble(rd.readLine()));
			

			
			if (opcao == 2 ) {
				System.out.println("Quanto deseja aportar no Tesouro Selic: ");
				((ContaInvestimento) objConta).setTesouro(Double.parseDouble(rd.readLine()));
			} else if (opcao == 1 ) {
				System.out.println("Valor do cheque utilizado: ");
				((ContaCorrente) objConta).setChequeEspecial(Integer.parseInt(rd.readLine()));
			}
			
			
		} catch (Exception e) {
			System.out.println("erro " + e);
		}
		
		//saida
		System.out.println();
		System.out.println("Titular: " + objConta.getTitular());
		System.out.println("Numero da Conta: " + objConta.getNumeroConta());
		//System.out.println("Saldo: " + objConta.getSaldo());
		
		if (opcao == 1) {
			System.out.println("Saldo após cheque especial: " + objConta.getSaldo());
		} else {
			System.out.println("Saldo após investimento: " + objConta.getSaldo());
		}
		
	}

}
