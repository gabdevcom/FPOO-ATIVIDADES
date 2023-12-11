package Atividades_Gabriela_Miranda;

import java.util.Scanner;

public class TesteBike {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Pessoa1 p1 = new Pessoa1();
		Pessoa1 p2 = new Pessoa1();
		
		System.out.println("Pessoa 1 esta subindo na SpeedBike");
		System.out.println("Modelo: ");
		p1.modelo = entrada.next();
		System.out.println("Cor: ");
		p1.cor = entrada.next();
		System.out.println("Troque a marcha: " );
			p1.marcha = entrada.nextInt();
		System.out.println("Aumente a velocidade : " );
			p1.velocidade = entrada.nextInt();
			
			p1.acelerar();
		System.out.println("Diminiua a velocidade : " );
			p1.diminuirVelocidade = entrada.nextInt();
			p1.frear();
			p1.estado();
			
		System.out.println("........................................");
		
		System.out.println("Pessoa 2 esta subindo na MountainBike");
		System.out.println("Modelo: ");
		p2.modelo = entrada.next();
		System.out.println("Cor: ");
		p2.cor = entrada.next();
		System.out.println("Troque a marcha: " );
			p2.marcha = entrada.nextInt();
		System.out.println("Aumente a velocidade : " );
			p2.velocidade = entrada.nextInt();
			p1.acelerar();
		System.out.println("Diminiua a velocidade : " );
			p2.diminuirVelocidade = entrada.nextInt();
			p2.frear();
			p2.estado();
		
		
	}

}
