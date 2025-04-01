package apresntacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio_2.Caipirinha;
import negocio_2.Drink;
import negocio_2.DryMartini;
import negocio_2.Interface;
import negocio_2.MoscowMule;
import negocio_2.OldFashion;

public class PrincipalBar {

	public static void main(String[] args) {
		// var
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		Drink objDrink = null;
		int opcao;
		
		//entrada
		try {
			System.out.println("1: Caipirinha; 2: MArtini; 3: Old Fashion; 4: Moscow Mule ");
			opcao = Integer.parseInt(rd.readLine());
			
			switch (opcao) {
				case 1: 
					objDrink = new Caipirinha();
					break;
				case 2: 
					objDrink = new DryMartini();
					break;
				case 3: 
					objDrink = new OldFashion();
					break;
				case 4: 
					objDrink = new MoscowMule();
					break;
			}
		} catch (Exception e) {
			System.out.println("ERRO " + e);
		}
		
		//processamento
		((Interface) objDrink).misturar();
		
		//saida
		objDrink.beber();
	}

}
