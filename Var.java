package Atividades_Gabriela_Miranda;

import java.util.Scanner;

public class Var {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int var1 = entrada.nextInt();
		int var2 = entrada.nextInt();
		
		if(var1 < -8 || var1 > 8 || var2 < 0 || var2 > 0 ) {
			System.out.println("Fora");
		}
		else {
			System.out.println("Dentro");
		}
	}
}
