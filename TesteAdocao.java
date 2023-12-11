package AdocaoPet_Gabriela_Miranda;

import java.util.Scanner;

public class TesteAdocao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Tutor t1 = new Tutor();
		Gato g1 = new Gato("Siames" , 1, 1.5f ,'M' );
		Cao c1 = new Cao("Dog Alemao", 1, 2.1f , 'F');
		Peixe p1 = new Peixe("Dourado", 3, 1.2f , 'F');
		Coelho cl1 = new Coelho("Australiano", 1 , 2,5f , 'M');
		
		System.out.println("Bem vindo(a) a feira de adocao pet");
		 
		System.out.println("Insira o dados para assinar o contrato: ");
		System.out.println("Nome: ");
		t1.setNome(entrada.next());
		System.out.println("Idade: ");
		t1.setIdade(entrada.nextInt());
		System.out.println("E-mail: ");
		t1.setEmail(entrada.next());
		System.out.println("CPF: ");
		t1.setCpf(entrada.nextDouble());
		System.out.println("Endereco: ");
		t1.setEndereco(entrada.next());
		
		System.out.println("Pets disponiveis: ");
		System.out.println("Gato: ");
		g1.ExibirInfo();
		System.out.println("Peixe: ");
		p1.ExibirInfo();
		System.out.println("Cao: ");
		c1.ExibirInfo();
		System.out.println("Coelho: ");
		cl1.ExibirInfo();
		
		System.out.println("Escolha um pet: "
				+ "1- Coelho" + "2- Cao" + "3- Gato " + "4- Peixe" );
		int opcao1 = entrada.nextInt();
		switch (opcao1) {
		case 1:
			System.out.println("Parabens!! Agora assine o contrato");
			t1.assinarContrato();
			break;
		case 2:
			System.out.println("Parabens!! Agora assine o contrato");
			t1.assinarContrato();
		
			break;
		case 3:
			
			System.out.println("Parabens!! Agora assine o contrato");
			t1.assinarContrato();
			break;
		case 4:
			System.out.println("Parabens!! Agora assine o contrato");
			t1.assinarContrato();
			break;
		default:
			System.out.println("Veja os pets novamente!");
			break;
	
	}
	}

}
