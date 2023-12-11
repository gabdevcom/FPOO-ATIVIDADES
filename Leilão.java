package Atividades_Gabriela_Miranda;

import java.util.Scanner;
public class Leilão {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        System.out.print("Lances recebidos: ");
        int n = entrada.nextInt(); //numero de lances recebidos
        entrada.nextLine(); 

        String Vencnomes = ""; //nome 
        int MaiorLance= 0;
        
        for (int i = 0; i < n; i++) {
            System.out.println("Lance " + (i + 1) + ":");
            String nome = entrada.nextLine();
            int lance = entrada.nextInt();
            entrada.nextLine();

            if (lance > MaiorLance) {
            	Vencnomes = nome;
                MaiorLance = lance;
            }
        }
        System.out.println("Vencedor: " + Vencnomes);
        System.out.println("Valor: " + MaiorLance);
	}

}
