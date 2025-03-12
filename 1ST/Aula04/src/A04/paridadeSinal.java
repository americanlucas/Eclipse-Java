package A04;

import java.util.Scanner;

public class paridadeSinal {

	public static void main(String[] args) {
		//scan
		Scanner sc = new Scanner (System.in);
		
		//entrada
		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		
		//processamento
		if (num%2 == 0 && num > 0) System.out.printf("%d é par e positivo", num);
		else if (num%2 == 0 && num < 0) System.out.printf("%d é par e negativo", num);
		else if (num%2 != 0 && num < 0) System.out.printf("%d é impar e negativo", num);
		else if (num%2 != 0 && num > 0) System.out.printf("%d é impar e positivo", num);
		else if (num == 0) System.out.printf("%d é par", num);
		
	}

}
