package org.example;
import java.util.Scanner;

public class Leitura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um inteiro: ");
        int x = sc.nextInt();
        System.out.println("O inteiro digitado foi: "+x);
    }
}
