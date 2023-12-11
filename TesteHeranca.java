package Atividades_Gabriela_Miranda;

import java.util.Scanner;

public class TesteHeranca {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Aluno1 al1 =  new Aluno1();
		
		System.out.println("Digite seus dados: ");
		System.out.println("Digite seu nome : ");
		String nomeal1 = entrada.next();
		System.out.println("Digite seu endereco : ");
		String enderecoal1 = entrada.next();
		System.out.println("Digite seu cpf: ");
		int cpfal1 = entrada.nextInt();
		System.out.println("Digite seu telefone : ");
		int telefoneal1 = entrada.nextInt();
		System.out.println("Digite seu celular : ");
		al1.setEndereco(entrada.next());
		al1.calcularMedia();
		al1.SituacaoFinal();
	}
}
