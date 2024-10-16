package Aplicacao;

import java.util.ArrayList;
import java.util.Scanner;

public class InverteVetor {
    public static void main(String[] args) {
        //scanner e var
        Scanner sc = new Scanner (System.in);

        int vetor [] = new int[5];
        ArrayList <Integer> vetorInvertido = new ArrayList<>();

        //entrada 
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o número da posição " + i + " do vetor:");
            vetor [i] = sc.nextInt();
        }

        for (int i = 4; i >= 0; i--) {
            vetorInvertido.add(vetor[i]);
        }

        System.out.println(vetorInvertido);


        sc.close();
    }
}
