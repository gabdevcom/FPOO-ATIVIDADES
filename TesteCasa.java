package Atividades_Gabriela_Miranda;

import java.util.Scanner;

public class TesteCasa {

	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		
		 System.out.println("Construa sua casa!");
		 System.out.println("Nome do quarto: ");
		 String vnome = entrada.next();
		 System.out.println("Numero de camas: ");
		 int vqtd = entrada.nextInt(); 
		 Quarto q2 = new Quarto(vnome , vqtd);
		 System.out.println("Nome da sala: ");
		 String salaN = entrada.next();
		 System.out.println("Tem tv? ");
		 boolean ttv1 = entrada.nextBoolean();
		 Sala s2 = new Sala (salaN, ttv1);
		 
		 Casa c1 = new Casa();
		 System.out.println(" Cor: ");
		 c1.setCor(entrada.next());
		 System.out.println("Metragem: ");
		 c1.setMetragem(entrada.nextFloat());
		 System.out.println("Preco: " );
		 c1.setPreco(entrada.nextFloat());
		 c1.mostrarDetalhes();
		 System.out.println("Nome do quarto: " + vnome + "Numero de camas: " + vqtd + 
				 "Nome da sala: " + salaN + "Tem tv? " + ttv1);

	}

}


