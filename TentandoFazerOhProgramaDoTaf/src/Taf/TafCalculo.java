package Taf;
import java.util.Scanner;
public class TafCalculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NotaBarra.imprimeMencaoBarra();

        System.out.println("----------");

        NotaCorrida.imprimeMencaoCorrida();

        System.out.println("----------");

        NotaFlexao.notaFlexao();

        System.out.println("----------");

        NotaAbdominal.notaAbdominal();

        System.out.println("----------");

    }
}
