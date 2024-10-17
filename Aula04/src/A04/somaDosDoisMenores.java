package A04;

import java.util.Scanner;

public class somaDosDoisMenores {

	public static void main(String[] args) {
		// Scan
		Scanner sc = new Scanner (System.in);
		
		//entrada
		System.out.print("Digite os tres valores: ");
		int v1 = sc.nextInt();
		int v2 = sc.nextInt();
		int v3 = sc.nextInt();
		int soma;
		//processamento
		if (v1 > v3 && v1 > v2) {
			soma = v3 + v2;
			System.out.println(soma);
		} else if (v2 > v3 && v2 > v1) {
			soma = v1 + v3;
			System.out.println(soma);
		} else {
			soma = v1 + v2;
			System.out.println(soma);
		}
	}

}
