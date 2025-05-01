package br.com.devmedia;
import java.util.Scanner;
public class CalculadoraNumerica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        int valor1, valor2;

        do {
            System.out.print("insira o primeiro valor: ");
            valor1 = scanner.nextInt();
            System.out.print("Insira o segundo valor: ");
            valor2 = scanner.nextInt();

            System.out.println("**MENU**");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3- Divisão");
            System.out.println("4 - Multiplicação");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();


            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu somar!");
                    int soma = (valor1 + valor2);
                    System.out.print(soma);
                    break;

                case 2:
                    System.out.println("Você escolheu subtração!");
                    int subtracao = (valor1 - valor2);
                    System.out.print(subtracao);
                    break;

                case 3:
                    System.out.println("Você escolheu divisão!");
                    int divisao = valor1 / valor2;
                    System.out.print(divisao);
                    break;

                case 4:
                    System.out.println("Você escolheu multiplicação!");
                    int multiplicacao = valor1 * valor2;
                    System.out.print(multiplicacao);
                    break;
            }
        }while (opcao > 4) ;
        scanner.close();
    }
}




