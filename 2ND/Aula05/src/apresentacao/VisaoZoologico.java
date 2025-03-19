package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio_2.Aguia;
import negocio_2.Animal;
import negocio_2.Ave;
import negocio_2.Cachorro;
import negocio_2.Leopardo;
import negocio_2.Mamifero;

public class VisaoZoologico {

	public static void main(String[] args) {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		Animal objAnimal = null;
		String opcao = "";
		
		try {
			System.out.println("Digite <C>achorro, <L>eopardo ou <A>guia");
			opcao = rd.readLine();
			
			if (opcao.equalsIgnoreCase("C")) {
				objAnimal = new Cachorro();
			} else if (opcao.equalsIgnoreCase("L")){
				objAnimal = new Leopardo();
			} else objAnimal = new Aguia();
			
			System.out.println("Digite o nome: ");
			objAnimal.setNome(rd.readLine());
			System.out.println("Digite a altura: ");
			objAnimal.setAltura(Double.parseDouble(rd.readLine()));
			System.out.println("Digite o peso: ");
			objAnimal.setPeso(Double.parseDouble(rd.readLine()));
			
			if (opcao.equalsIgnoreCase("C")) {
				System.out.println("Digite a quantidade de litros de leite: ");
				((Mamifero) objAnimal).setLitrosLeite(Double.parseDouble(rd.readLine()));
				
				System.out.println("Digite a força da mordida: ");
				((Cachorro) objAnimal).setMordida(Double.parseDouble(rd.readLine()));
			} else if (opcao.equalsIgnoreCase("L")){
				System.out.println("Digite a quantidade de litros de leite: ");
				((Mamifero) objAnimal).setLitrosLeite(Double.parseDouble(rd.readLine()));
				
				System.out.println("Digite a velocidade: ");
				((Leopardo) objAnimal).setVelocidade(Double.parseDouble(rd.readLine()));
			} else {
				System.out.println("Digite a quantidade de ovos: ");
				((Ave) objAnimal).setQtdOvos(Integer.parseInt(rd.readLine()));
				
				System.out.println("Digite a autonomia de voo: ");				
				((Aguia) objAnimal).setAutonomia(Double.parseDouble(rd.readLine()));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println();
		System.out.println("Nome: " + objAnimal.getNome());
		System.out.println("IMC: " + objAnimal.calculaIMC());
		if (opcao.equalsIgnoreCase("C")) {
			((Cachorro) objAnimal).morder();
		} else if (opcao.equalsIgnoreCase("L")){
			((Leopardo) objAnimal).correr();
		} else ((Aguia) objAnimal).voar();
	}

}
