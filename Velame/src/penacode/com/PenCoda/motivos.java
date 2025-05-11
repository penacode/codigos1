package penacode.com.PenCoda;
import java.util.Scanner;

public class motivos {

    public static void escolherMotivos(){

        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("1 - Quebrada(o)/trincada(o)");
        System.out.println("2 - Rasgada(o)");
        System.out.println("3 - Funcionamento intermitente");
        System.out.println("4 - Entupida(o)");
        System.out.println("5 - Queimada(o)");
        System.out.println("6 - Vazamentos");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();

        switch(opcao){
            case 1:
                System.out.println("Você escolheu quebrado(o)!");
                break;

            case 2:
                System.out.println("Você escolheu rasgada(o)!");
                break;

            case 3:
                System.out.println("Você escolheu funcionamento intermitente!");
                break;

            case 4:
                System.out.println("Você escolheu entupida(o)!");
                break;

            case 5:
                System.out.println("Você escolheu queimada(o)!");
                break;

            case 6:
                System.out.println("Você escolheu vazamentos");
                break;

            default:
                System.out.println("Opção inválida!");
        }

    }
}
