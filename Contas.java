package Atividades_Gabriela_Miranda;

import java.util.Scanner;
public class Contas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int v; 
		int a; 
		int f;
		int p; 
		int ContasPagas = 0;
		
		v = entrada.nextInt();
		a = entrada.nextInt();
		f = entrada.nextInt();
		p = entrada.nextInt();
		
	     if ( v >= a) {
	            ContasPagas++;
	        }
	        if ( v >= f) {
	            ContasPagas++;
	        }
	        if ( v >= p) {
	            ContasPagas++;
	        }

	       
	        System.out.println("Total de " + ContasPagas + " contas pagas");
		}
		
	
	}


