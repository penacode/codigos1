package penacode.com.github;
import java.util.Scanner;

public class TabuadaAteDez {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o numero que deseja saber a tabuada: ");
        int numero = scanner.nextInt();

        if (numero == 0 || numero < 0){
            System.out.println("Número invalido!");
            return;
        }
            for(int i = 0; i<= 10;i++){
            System.out.printf("%d x %d = %d\n", numero, i, numero*i);

        }

    }
}
