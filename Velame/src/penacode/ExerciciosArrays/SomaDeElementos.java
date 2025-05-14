package penacode.ExerciciosArrays;
import java.util.Arrays;
import java.util.Scanner;
public class SomaDeElementos {
    public static void main(String[] args) {
        int[] arrayInt = {1, 2, 3, 4, 5};
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            soma += arrayInt[i];

        }
        System.out.println(soma);
    }
}


