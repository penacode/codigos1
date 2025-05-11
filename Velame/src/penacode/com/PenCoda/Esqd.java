package penacode.com.PenCoda;
import java.util.Scanner;
public class Esqd {

        Scanner scanner = new Scanner(System.in);


   public static void escolherEsqd(){
       int escolha;
       Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione o Esqd que deseja informar um problema na viatura: ");
        System.out.println("1 - 1º ESQD");
        System.out.println("2 - 2º ESQD");
        System.out.println("3 - 3º ESQD");
        System.out.println("4 - ESQD CAP");
        escolha = scanner.nextInt();

        switch(escolha){
            case 1:
                System.out.println("Você escolheu o 1º Esqd C Mec");
                break;
            case 2:
                System.out.println("Você escolheu o 2º Esqd C Mec");
                break;
            case 3:
                System.out.println("Você escolheu o 3º Esqd C Mec");
                break;
            case 4:
                System.out.println("Você escolheu o Esqd C Ap");
                break;
            default:
                System.out.println("Escolha indisponível!");
        }


    }

}
