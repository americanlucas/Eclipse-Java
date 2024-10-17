package A04;

import java.util.Scanner;

public class maioridade {

	public static void main(String[] args) {
		//var
		Scanner sc = new Scanner (System.in);
		int idade;

		//entrada
		System.out.print("Digite sua idade: ");
		idade = sc.nextInt();
		
		//processamento e saida
		if (idade < 17) {
			System.out.print("Você é MENOR DE IDADE");
		} else {
			System.out.print("Você é MAIOR DE IDADE");
		}
	}

}
