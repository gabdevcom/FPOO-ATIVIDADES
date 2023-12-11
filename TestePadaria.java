package Atividades_Gabriela_Miranda;

import java.util.Scanner;
public class TestePadaria {
	public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			Pao pao1 = new Pao();
			Bolo bolo1 = new Bolo();
			Doce doce1 = new Doce();
			ProdutoPadaria p1 = new ProdutoPadaria();

			System.out.println("digite o tipo de pao:  ");
			pao1.nome = entrada.next();
			System.out.println("digite o preco:");
			pao1.preco = entrada.nextFloat();
			pao1.Assar();
			System.out.println("proximo produto . . . . ");
			
		
			System.out.println("digite o tipo de bolo:  ");
			bolo1.nome = entrada.next();
			System.out.println("digite o  preco:");
			bolo1.preco = entrada.nextFloat();
			bolo1.Assar();
			
			System.out.println("proximo produto . . . . ");
			
			System.out.println("digite o tipo de doce:  ");
			doce1.nome = entrada.next();
			System.out.println("digite  o preco:");
			doce1.preco = entrada.nextFloat();
			doce1.Assar();
			System.out.println("............................................" );
			pao1.Exibir();
			bolo1.Exibir();
			doce1.Exibir();
			
			float total = pao1.preco + doce1.preco + bolo1.preco;
			System.out.println("Total a pagar: " + total  +  " reais");
			System.out.println("O cliente comprou e comeu todos os produtos!!!");
	}

}
