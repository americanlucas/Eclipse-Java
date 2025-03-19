package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Carro;
import negocio.Fabricante;
import negocio.Moto;
import negocio.Veiculo;

public class VisaoConcessionaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		Veiculo objVeiculo = null;
		String opcao = "";
		
		//entrada de dados
		try {
			System.out.println("Digite o tipo: <C>aro ou <M>oto");
			opcao = rd.readLine();
			
			if (opcao.equalsIgnoreCase("C")) {
				objVeiculo = new Carro();
			} else {
				objVeiculo = new Moto();
			}
			
			System.out.println("Digite o modelo: ");
			objVeiculo.setModelo(rd.readLine());
			
			System.out.println("Digite o Fabricante: ");
			objVeiculo.setObjFabricante(new Fabricante(rd.readLine()));
			
			System.out.println("Digite a cor: ");
			objVeiculo.setCor(rd.readLine());
			
			if (opcao.equalsIgnoreCase("C")) {
				System.out.println("Digite se tem teto solar: <S> ou <N>");
				if (rd.readLine().equalsIgnoreCase("S")) {
					((Carro) objVeiculo).setTetoSolar(true);
				} else {
					((Carro) objVeiculo).setTetoSolar(false);					
				}
			} else {
				System.out.println("Digite a cilindrada:");
				((Moto) objVeiculo).setCilindrada(Integer.parseInt(rd.readLine())); 
			}
		} catch (Exception e) {
			System.out.println("ERRO! " + e);
		}
		
		//saida 
		System.out.println("Modelo: " + objVeiculo.getModelo());
		System.out.println("Fabricante: " + objVeiculo.getObjFabricante().getNome());
		System.out.println("Cor: " + objVeiculo.getCor());
		if (opcao.equalsIgnoreCase("C")) {
			System.out.println("Possui teto solar? " + (((Carro) objVeiculo).isTetoSolar()? "SIM" : "NÃO"));
		} else {
			System.out.println("Cilindrada: " + ((Moto)objVeiculo).getCilindrada());
		}
	}

}
