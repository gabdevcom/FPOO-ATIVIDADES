package Atividades_Gabriela_Miranda;

import java.util.Scanner;
public class Tesouro {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int moedas = entrada.nextInt();
		int marinheiros = entrada.nextInt();
		int capitao, divisao; //divisao quant os marinheiros vao receber 

		capitao = 2;
		divisao = moedas/(marinheiros+capitao);
		System.out.println("Quantidade para o capitão =" + 2*divisao);
	}

}
	