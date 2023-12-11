package Atividades_Gabriela_Miranda;

import java.util.Scanner;
public class Contas2 {

	public static void main(String[] args) {
		
		int v; 
		int a; 
		int f;
		int p; 
		Scanner entrada = new Scanner(System.in);
		System.out.println("informe o valor das contas");

		v = entrada.nextInt();
		a = entrada.nextInt();
		f = entrada.nextInt();
		p = entrada.nextInt();
		if ( v>= (a+f+p)) {
			System.out.println("3");
		} else if (v>= (a+f) || v >= (a+p)){
			System.out.println("2");
		} else if ( v>= a || v >=f || v>= p) {
			System.out.println("1");
		}
	}
}
