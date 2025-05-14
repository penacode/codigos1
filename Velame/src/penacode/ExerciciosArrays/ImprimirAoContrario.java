package penacode.ExerciciosArrays;
import java.util.Scanner;
public class ImprimirAoContrario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numero;

        System.out.println("Digite um número de 7 dígitos: ");
        numero = scanner.nextLine();

        for(int i = numero.length() - 1; i >=0 ; --i){
            char inverso = numero.charAt(i);
            System.out.print(inverso);
        }

    }
}
