package penacode.ExerciciosArrays;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class MaiorEMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for( int i = 0 ; i < 10 ; i++){
            System.out.println("Digite o número " +(i + 1)+":");
            numeros[i] = scanner.nextInt();
        }

        int maior = 0;
        int menor = 0;

        for( int i = 1; i < 10; i++){
            if( numeros[i] > maior){
                maior = numeros[i];}
            if (numeros[i] < menor){
                menor = numeros[i];}
            }
    System.out.println("O maior número é : " + maior);
    System.out.println("O menor número é : " + menor);
        }

    }

