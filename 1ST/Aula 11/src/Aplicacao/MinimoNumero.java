package Aplicacao;

import java.util.ArrayList;
import java.util.Scanner;

public class MinimoNumero {
    public static void main(String[] args) {
        //scanner e var
        Scanner sc = new Scanner(System.in);

        ArrayList <Integer> vetor = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o valor da posição " + i);
            int adiciona = sc.nextInt();
            vetor.add(adiciona);
        }

        
        System.out.println(vetor);
        sc.close();
    }
}
