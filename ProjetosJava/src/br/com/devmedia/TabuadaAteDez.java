package br.com.devmedia;

import java.util.Scanner;

public class TabuadaAteDez {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("insira o número que deseja saber a tabuada: ");

        int valor = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
                System.out.printf("%d x %d = %d\n", valor , i , valor * i );

            }

        }


    }

