package Atividades_Gabriela_Miranda;

import java.util.Scanner;

public class Contas3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int v = entrada.nextInt();
		int a = entrada.nextInt();
		int f = entrada.nextInt();
		int p = entrada.nextInt();
		int resp = 0;
		int [] contas = {a,f,p};	
		
		if (contas[0] + contas [1] + contas [2] <= v);
			resp = 3;
		 if ( contas[0] + contas[1] <= v);
			resp = 2;
		 if ( contas[0] + contas[1] + contas[2] <= v);
			resp = 1;
	     if  ( contas[0] + contas[1] + contas[2] > v);
			resp = 0;
	        System.out.printf("%d/n", resp);

	}

}
