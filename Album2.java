package Atividades_Gabriela_Miranda;

import java.util.Scanner;
public class Album2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		int n = entrada.nextInt(); // qtd de espaco no album
		int m = entrada.nextInt(); //fig compradas 
		//dica, utilize variavel boolena para vef se tem ou n fig
		boolean[] tenho = new boolean[n]; // true ou false
		int x = 0;  //fig rep
		//varrendo o vertor
		
		for( int i = 0; i < n; i++) {
			tenho[i] = false;
		//fig q ja tem!!
		}
		
		for ( int i = 0; i < m; i++) {
			x = entrada.nextInt();
			tenho[x] = true; 
		}
		int rep = 0;
		//vamos marcar as repetidas!!
		for (int i = 0; i < n; i++) {
			if (tenho[i]);
				rep++; // ou rep++
		}
		
		System.out.println("qtd de fig rep = " + (n - rep));
		System.out.println("tamanho do album = " + n);
		System.out.println("qtd de fig = " + m );
	}
		
}
