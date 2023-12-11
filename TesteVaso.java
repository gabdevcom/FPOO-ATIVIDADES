package Atividades_Gabriela_Miranda;

import java.util.Scanner;

public class TesteVaso{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Vaso v1 = new Vaso(); 
		VasoDecorado v2 = new VasoDecorado();
		
			
		System.out.println("Coloque as informacoes do seu vaso: ");
		System.out.println("Cor do vaso: ");
		v1.setCor(entrada.nextLine());
		System.out.println("Tamanho do vaso:  ");
		v1.setTamanho(entrada.nextDouble());
		System.out.println("Material do vaso:  ");
		v1.setMaterial(entrada.next());
		v1.ExibirVaso(); 
		
		System.out.println("Coloque as informacoes do seu vaso decorado: ");
		System.out.println("Cor do vaso: ");
		v2.setCor(entrada.next());
		System.out.println("Tamanho do vaso:  ");
		v2.setTamanho(entrada.nextDouble());
		System.out.println("Material do vaso:  ");
		v2.setMaterial(entrada.next());
		System.out.println("Decoracao do vaso:  ");
		v2.setDeco(entrada.next());
		v2.ExibirVasoDeco(); 
	}

}
