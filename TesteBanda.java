package Atividades_Gabriela_Miranda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteBanda {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
		Guitarista m1 = new Guitarista();
		Vocalista m2 = new Vocalista();
		Baterista m3 = new Baterista();
		Baixista m4 = new Baixista();
		
		
		System.out.println("Vamos criar uma banda!!");
		System.out.println("Adicione o nome dos membros!");
		System.out.println("Vocalista: ");
		m1.setNome(entrada.next());
		System.out.println("Guitarrista: ");
		m2.setNome(entrada.next());
		System.out.println("Baixista: ");
		m3.setNome(entrada.next());
		System.out.println("Baterista: ");
		m4.setNome(entrada.next());
		//lista de membros
	List<MembroBanda> lista_membros = new ArrayList<MembroBanda>();
		lista_membros.add(m1);
		lista_membros.add(m2);
		lista_membros.add(m3);
		lista_membros.add(m4);
		for (MembroBanda olho : lista_membros) {
			System.out.println("Membros da banda:" + olho.getNome());
		}
		//adicionar a banda 
		Banda b1 = new Banda(lista_membros);
		System.out.println("Nome da banda: ");
		b1.setNome(entrada.next());
		List<MembroBanda> bi = b1.getAdicionarMembro();
			{
			System.out.println("Membros da banda  "+ b1.getNome());
			System.out.println(" Guitarista: " + m1.getNome());
			System.out.println(" Vocalista: " + m2.getNome());
			System.out.println(" Baixista: " + m4.getNome());
			System.out.println(" Baterista: " + m3.getNome());
		}
		
		b1.realizarShow();
		m1.tocar();
		m2.tocar();
		m3.tocar();
		m4.tocar();
	}


}
