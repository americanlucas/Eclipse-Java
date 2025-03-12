package Aplicacao;

import java.util.Scanner;

public class TabelaPreco {
    public static void main(String[] args) {
        //sc e var
        Scanner sc = new Scanner(System.in);

        double tabela [] = new double [1000];

        //entrada
        do {
            System.out.println("Digite o código: ");
            //int codigo = sc.nextInt();

            System.out.println("Digite o valor: ");
            //int valor = sc.nextInt();

            System.out.println("Digite S para mais produtos");
        } while (sc.next().equalsIgnoreCase("S"));

        sc.close();

        //saida
        for (int i = 0; i < tabela.length; i++) {
            if (tabela[i] > 0) {
                System.out.println(i + "\t R$ " + tabela[i]);
            } 
        }

        sc.close();
    }
}
