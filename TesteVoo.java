package Atividades_Gabriela_Miranda;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class TesteVoo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Passageiro p1 = new Passageiro();		
		Passagem ps1 = new Passagem();
		
		
		System.out.println("Bem vinda(o) a companhia aerea Swiftie!!");
		System.out.println("Insira seus dados: ");
		System.out.println("Nome: ");
		p1.setNome(entrada.next());
		System.out.println("Sobrenone: ");
		p1.setSobrenome(entrada.next());
		System.out.println("Email: ");
		p1.setEmail(entrada.next());
		System.out.println("Logando na sua conta. . . . .");
		System.out.println("----- Passagens aerias ida e volta: -----");
		entrada.nextLine();
		LocalDate dataIda = null;
		System.out.println("digite a data de ida: (dd-MM-yyyy):") ;
		String dataI = entrada.nextLine();
		
		dataIda = LocalDate.parse (dataI, DateTimeFormatter.ofPattern("dd-MM-yyyy")); 
		
		LocalDate dataVolta = null;
		System.out.println("digite a data de volta: (dd-MM-yyyy):") ;
		String dataV1 = entrada.nextLine();
		
		dataVolta = LocalDate.parse (dataV1, DateTimeFormatter.ofPattern("dd-MM-yyyy")); 
		
		System.out.println("Origem: ");
		String var_o = entrada.next();
		System.out.println("Destino: ");
		String var_des = entrada.next();
		
		Voo v1 = new Voo( 199, var_o, var_des, 220, dataIda, dataVolta);
		Voo v2 = new Voo( 133 , var_o, var_des, 3400, dataIda, dataVolta);
		Voo v3 = new Voo( 210 , var_o, var_des, 6000, dataIda, dataVolta);
		
		System.out.println("Procurando passagem . . . ");
		System.out.println("Voos disponiveis: ");
		System.out.println("           ");
		v1.setPreco(12000);
		System.out.println("Voo 1: ");
		v1.MostrarDetalhes();
		
		System.out.println("           ");
		System.out.println("Voo 2: ");
		v2.MostrarDetalhes();
		
		System.out.println("           ");
		System.out.println("Voo 3: ");
		v3.MostrarDetalhes();
		
		
		System.out.println("Escolha a passagem : ");
		int opcao = entrada.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("Comprando passagem. . .");
			System.out.println("Boa viagem !");
			break;
		case 2:
			System.out.println("Comprando passagem. . .");
			System.out.println("Boa viagem !");
			break;
		case 3:
			System.out.println("Comprando passagem. . .");
			System.out.println("Boa viagem !");
			break;
		default:
			System.out.println("Retornando a pagina inicial. . . ");
			break;
	
	}

	}
	
}
