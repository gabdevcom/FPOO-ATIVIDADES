package Atividades_Gabriela_Miranda;

import java.util.Scanner;

public class TesteCliente {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Cliente0 c1 =  new Cliente0();
		System.out.println("digite seu nome: ");
		c1.nome = entrada.next();
		System.out.println("digite sua idade: ");
		c1.idade = entrada.nextInt();
		System.out.println("digite seu cpf: ");
		c1.cpf = entrada.next();
		System.out.println("digite seu telefone  ");
		c1.telefone = entrada.nextInt();
		System.out.println("digite seu peso: ");
		c1.peso = entrada.nextDouble();
		System.out.println("digite sua altura: ");
		c1.altura = entrada.nextDouble();
		c1.calcularIMC();
		c1.imprimirDados();
		c1.calcularPesoDesejado(50);
	}
}
