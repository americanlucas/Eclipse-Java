package apresntacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Cilindro;
import negocio.Cubo;
import negocio.Solido;

public class PrincipalGeometria {

	public static void main(String[] args) {
		// var
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		Solido objSolido = null;
		int opcao;
		
		//entrada de dados
		try {
			System.out.println("<1> Cubo; <2> Cilindro");
			opcao = Integer.parseInt(rd.readLine());
			if (opcao == 1) {
				objSolido = new Cubo();
				
				System.out.println("Digite a aresta");
				((Cubo) objSolido).setAresta(Double.parseDouble(rd.readLine()));
			} else {
				objSolido = new Cilindro();
				
				System.out.println("Digite o Raio");
				((Cilindro) objSolido).setRaioBase(Double.parseDouble(rd.readLine())); 
				
				System.out.println("Digite a Altura");
				((Cilindro) objSolido).setAltura(Double.parseDouble(rd.readLine())); 
			}
			
			
			
		} catch (Exception e) {
			System.out.println("ERRO: " + e);
		}
		
		//saida
		System.out.println("Área Total: " + objSolido.calcularArea());
		System.out.println("Volume: " + objSolido.calcularVolume());
	}

}
