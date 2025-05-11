package penacode.com.PenCoda;
import java.util.Scanner;

public class Carros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String viatura;
        int eb;

        System.out.println("informe o modelo da viatura: ");
        viatura = scanner.nextLine();

        System.out.println("Informe o EB da viatura: ");
        eb = scanner.nextInt();

        Esqd.escolherEsqd();
        Sistema.escolherSistema();
        motivos.escolherMotivos();

    }
}
