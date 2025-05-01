package br.com.devmedia;
import java.util.Scanner;
public class InversorString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um palavra: ");
        String palavra = scanner.nextLine();
        String invertida = "";

        for ( int i = palavra.length() - 1 ; i >=  0 ; i--){
            invertida += palavra.charAt(i);
        }
            if(palavra.equals(invertida)){
                System.out.println("é palíndromo");}
            else{
                System.out.println("Não é palíndromo");
            }
    System.out.println(invertida);



    }
}
