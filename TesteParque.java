package Atividades_Gabriela_Miranda;

import java.util.Scanner;

public class TesteParque {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Brinquedo b1 = new Brinquedo("Carrosel", 1.50, 1);
        Brinquedo b2 = new Brinquedo("Barco Viking", 1.60, 2);

        System.out.println("Digite seu nome: ");
        String nome = entrada.next();

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = entrada.nextDouble();

        Visitante v1 = new Visitante(nome, altura, idade);

        v1.getpodeAndarNoBrinquedo();
    }
}
