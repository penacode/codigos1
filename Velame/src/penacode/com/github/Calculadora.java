package penacode.com.github;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int valor1,valor2;
        int opcao;

        System.out.print("insira o primeiro valor: ");
        valor1 = scanner.nextInt();
        System.out.print("Insira o segundo valor: ");
        valor2 = scanner.nextInt();

        System.out.println("==MENU==");
        System.out.println("1 - ADIÇÃO");
        System.out.println("2 - SUBTRAÇÃO");
        System.out.println("3 - MULTIPLICAÇÃO");
        System.out.println("4 - DIVISÃO");
        System.out.println("ESCOLHA UMA OPÇÃO: ");
        opcao = scanner.nextInt();

        switch(opcao) {
            case 1:
                System.out.printf("%d + %d = %d", valor1, valor2, valor1 + valor2);
                break;
            case 2:
                System.out.printf("%d - %d = %d", valor1, valor2, valor1 - valor2);
                break;
            case 3:
                System.out.printf("%d x %d = %d", valor1, valor2, valor1 * valor2);
                break;
            case 4:
                System.out.printf("%d / %d = %d", valor1, valor2, valor1 / valor2);
                break;
            default:
                System.out.println("Opção inválida!");
        }



        }


    }

