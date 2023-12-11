package Atividades_Gabriela_Miranda;

import java.util.Scanner;
public class Poste {

	public static void main(String[] args) {
		   Scanner entrada = new Scanner(System.in);
		   int n = entrada.nextInt(); //numero de postes 
	       int Substituidos = 0;
	       int Consertados = 0;
		   
	       for (int i = 0; i < n; i++) {
	            int x = entrada.nextInt();
	            if ( x < 50) {
	                Substituidos++;
	            } else if ( x < 85) {
	                Consertados++;
	            }
	        }

	        System.out.println( Substituidos + " " + Consertados);
		   
	}

}
