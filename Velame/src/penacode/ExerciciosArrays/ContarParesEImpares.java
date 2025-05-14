package penacode.ExerciciosArrays;
import java.util.Scanner;

public class ContarParesEImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for(int i = 0; i< 10; i++){
            System.out.println("Digite o número"+(i+1)+":");
            numeros[i] = scanner.nextInt();
        }

        int qtdPares = 0;
        int qtdImpares = 0;

        for(int i = 0; i < 10; i++ ){
            if (numeros[i] % 2 == 0){
                qtdPares++;
            }
            else{
                qtdImpares++;
            }
        }

        System.out.println("A quantidade de pares é :" +qtdPares);
        System.out.println("A quantodade de ímpares é :" +qtdImpares);

    }
}
