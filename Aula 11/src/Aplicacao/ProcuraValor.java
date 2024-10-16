package Aplicacao;

import java.util.Scanner;

public class ProcuraValor {
    public static void main(String[] args) {
        //scanner e var
        Scanner sc = new Scanner (System.in);

        int vetor [] = new int[100000];
        int valor = 0;

        //contrução do vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = ((int) (vetor.length * Math.random()));
        }

        //pesquisas
        while (valor != -1) {
            System.out.println("Digite um valor: ");
            valor = sc.nextInt();

            boolean achei = false;

            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] == valor) {
                    achei = true;
                }
            }

            if (achei) {
                System.out.println("Parabens");
            } else {
                System.out.println("Tenta de novo");
            }
        }

        sc.close();
    }
}
