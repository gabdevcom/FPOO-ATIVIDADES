package Atividades_Gabriela_Miranda;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int numero;

        System.out.println("Digite uma sequência de números positivos:");

        while (true) {
            numero = scanner.nextInt();
            if (numero <= 0) {
                break;
            }
            soma += numero;
        }
        System.out.println("A soma dos números 4 é: " + soma);

        scanner.close();
    }
}

