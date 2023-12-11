package Atividades_Gabriela_Miranda;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op;
        do {
            exibirMenu();
            op = entrada.nextInt();
            double resultado;
            double num1, num2;

            switch (op) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    num1 = entrada.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = entrada.nextDouble();
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 2:
                    System.out.print("Digite o primeiro número: ");
                    num1 = entrada.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = entrada.nextDouble();
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 3:
                    System.out.print("Digite o primeiro número: ");
                    num1 = entrada.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = entrada.nextDouble();
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 4:
                    System.out.print("Digite o primeiro número: ");
                    num1 = entrada.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = entrada.nextDouble();
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Não é possível dividir por zero.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo do programa.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (op != 0);

        
    }

    public static void exibirMenu() {
        System.out.println("Selecione uma operacao:");
        System.out.println("1- Soma");
        System.out.println("2- Subtracao");
        System.out.println("3- Multiplicacao");
        System.out.println("4- Divisao");
        System.out.println("0- SAIR ");
    }
}
