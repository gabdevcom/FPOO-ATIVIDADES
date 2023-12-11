package Atividades_Gabriela_Miranda;

import java.util.Scanner;
public class Q3{
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);

	        int num_aleatorio = (int) (Math.random() * 30) + 1;

	        int tentativas;

	        int contador = 0;



	        System.out.println("Adivinhe o numero entre 1 e 30!");



	        do {

	            System.out.print("Digite um numero: ");

	            tentativas = entrada.nextInt();

	            contador++;



	            if (tentativas < num_aleatorio) {

	                System.out.println("O numero sorteado e maior.");

	            } else if (tentativas > num_aleatorio) {

	                System.out.println("O numero sorteado e menor.");

	            } else {

	                System.out.println("Parabens! Voce adivinhou o numero sorteado em " + contador + " tentativas!");

	            }

	        } while (tentativas != num_aleatorio);



	        entrada.close();
	        
		}
}