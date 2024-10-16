package Aplicacao;

import java.util.Scanner;

public class PreencheVetor {
    public static void main(String[] args) {
        // var
        Scanner sc = new Scanner (System.in);

        int vetor[] = new int[5];

        //entrada
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o número da posição " + i + " do vetor:");
            vetor [i] = sc.nextInt();
        }

        
        //saida
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor[" + i + "] = " + vetor[i]);
        }
        
        sc.close();
    }
}
