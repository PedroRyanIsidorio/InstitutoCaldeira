package org.example;
import java.util.Scanner;

public class Estruturas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double media=0;
        double nota=0;

        for(int i=0;i<5;i++){
            System.out.println("Digite o valor "+(i+1)+" : ");
            nota = sc.nextDouble();
            media += nota;
        }

        System.out.println("A media do valores digitados é "+ media/5);

    }
}
