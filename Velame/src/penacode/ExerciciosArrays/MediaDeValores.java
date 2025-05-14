package penacode.ExerciciosArrays;
import java.util.Scanner;
public class MediaDeValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];

        for(int i = 0; i < 8; i++){
            System.out.println("Digite o número" +(i + 1)+ ": ");
            numeros[i] = scanner.nextInt();
        }
        int soma = 0;
        for(int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }
        int media = (soma/numeros.length);
        System.out.println("A média é: "+ media);
        for(int i = 0; i < numeros.length;i++){
            if(numeros[i] >= media){
                System.out.println("Está acima da média :"+ numeros[i]);
            }
        }
    }
}
