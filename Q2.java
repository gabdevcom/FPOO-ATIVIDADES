package Atividades_Gabriela_Miranda;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int menor = Integer.MAX_VALUE;
	        int numero;

	        System.out.println("Digite uma sequência de números e parar parar digite 0 :");

	        while (true) {
	            numero = scanner.nextInt();

	            if (numero == 0) {
	                break;
	            }

	            if (numero < menor) {
	                menor = numero;
	            }
	        }

	        if (menor != Integer.MAX_VALUE) {
	            System.out.println("O menor número digitado é: " + menor);
	        } else {
	            System.out.println("Nenhum número foi digitado.");
	        }

	        scanner.close();
	    }
		   
	}

