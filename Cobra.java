package Atividades_Gabriela_Miranda;

import java.util.Scanner;

public class Cobra {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Digite 4 numeros");
		int z = entrada.nextInt();
		int x = entrada.nextInt();
		int y = entrada.nextInt(); 
		int g = entrada.nextInt();
		
		if ( z==y || x==g ){ 
			System.out.println("Verdadeiro");
		
		} else  {
			System.out.println("Falso");
			}
			
	}

}
