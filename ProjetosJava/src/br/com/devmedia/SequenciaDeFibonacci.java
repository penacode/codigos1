package br.com.devmedia;

import java.util.ArrayList;
import java.util.Scanner;

public class SequenciaDeFibonacci {
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       ArrayList<Integer> fibonacci = new ArrayList<>();
       int x;
       System.out.println("Insira o número do caractere que deseja da sequência de Fibonacci: ");
            x = scanner.nextInt();

            if (x >= 1){
                fibonacci.add(0);}
            if (x >= 2){
                fibonacci.add(1);}


            for(int i = 2; i <= x; i++){
                int proximo = fibonacci.get(i-1) + fibonacci.get(i - 2);
                fibonacci.add(proximo);
                System.out.println(fibonacci);

                }
                }


    }


