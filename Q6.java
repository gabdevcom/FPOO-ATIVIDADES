package Atividades_Gabriela_Miranda;
import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a idade da primeira amiga: ");
	        int idadeAmiga1 = scanner.nextInt();

	        System.out.print("Digite a idade da segunda amiga: ");
	        int idadeAmiga2 = scanner.nextInt();

	        int precoAmiga1 = calculadora(idadeAmiga1);
	        int precoAmiga2 = calculadora(idadeAmiga2);

	        int totalAPagar = precoAmiga1 + precoAmiga2;

	        System.out.println("Total: " + totalAPagar + " reais");

	        scanner.close();
	    }

	    public static int calculadora(int idade) {
	        if (idade <= 17) {
	            return 15;
	        } else if (idade >= 18 && idade <= 59) {
	            return 30;
	        } else { // idade >= 60
	            return 20;
	        }
	}
}
