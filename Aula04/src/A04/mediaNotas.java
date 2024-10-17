package A04;

import java.util.Scanner;

public class mediaNotas {

	public static void main(String[] args) {
		//scan
		Scanner sc = new Scanner (System.in);
		
		double media;
		
		//entrada
		System.out.print("Digite as três notas: ");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		
		//processamento
		media = (n1 + n2 + n3) / 3;
		
		//saida
		if (media >= 5) {
			System.out.println("Passou!");
		}
		else {
			System.out.println("Digite a nota da substitutiva: ");
			double substitutiva = sc.nextDouble();
			
			if (substitutiva >= 5) {
				System.out.println("Passou");
			} else {
				System.out.println("Reprovou");
			}
		}
		sc.close();
	}

}
