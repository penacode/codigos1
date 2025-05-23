package Taf;
import java.util.Scanner;
public class NotaBarra {
    static Scanner scanner = new Scanner(System.in);
    public static void imprimeMencaoBarra() {

        int idade;
        int barras;
        int sexo;

        System.out.println("IDADE: ");
        idade = scanner.nextInt();
        System.out.println("BARRAS: ");
        barras = scanner.nextInt();
        System.out.println("SEXO: ");
        sexo = scanner.nextInt();
        if (sexo == 1) {
            if (idade <= 21 && barras <= 4) {
                System.out.println("I");
            } else if (idade <= 21 && barras <= 6) {
                System.out.println("R");
            } else if (idade <= 21 && barras <= 9) {
                System.out.println("B");
            } else if (idade <= 21 && barras <= 11) {
                System.out.println("MB");
            } else if (idade <= 21 && barras > 12) {
                System.out.println("E");

            }
            if ((idade > 21 && idade <= 25) && barras <= 5) {
                System.out.println("I");
            } else if ((idade > 21 && idade <= 25) && barras <= 7) {
                System.out.println("R");
            } else if ((idade > 21 && idade <= 25) && barras <= 10) {
                System.out.println("B");
            } else if ((idade > 21 && idade <= 25) && barras <= 12) {
                System.out.println("MB");
            } else if ((idade > 21 && idade <= 25) && barras > 13) {
                System.out.println("E");
            }
            if ((idade >= 26 && idade <= 29) && barras <= 5) {
                System.out.println("I");
            } else if ((idade >= 26 && idade <= 29) && barras <= 4) {
                System.out.println("R");
            } else if ((idade >= 26 && idade <= 29) && barras <= 9) {
                System.out.println("B");
            } else if ((idade >= 26 && idade <= 29) && barras <= 11) {
                System.out.println("MB");
            } else if ((idade >= 26 && idade <= 29) && barras > 12) {
                System.out.println("E");
            }
            if ((idade >= 30 && idade <= 33) && barras <= 4) {
                System.out.println("I");
            } else if ((idade >= 30 && idade <= 33) && barras <= 5) {
                System.out.println("R");
            } else if ((idade >= 30 && idade <= 33) && barras <= 8) {
                System.out.println("B");
            } else if ((idade >= 30 && idade <= 33) && barras <= 10) {
                System.out.println("MB");
            } else if ((idade >= 30 && idade <= 33) && barras > 11) {
                System.out.println("E");
            }
            if ((idade >= 34 && idade <= 37) && barras <= 3) {
                System.out.println("I");
            } else if ((idade >= 34 && idade <= 37) && barras <= 4) {
                System.out.println("R");
            } else if ((idade >= 34 && idade <= 37) && barras <= 6) {
                System.out.println("B");
            } else if ((idade >= 34 && idade <= 37) && barras <= 8) {
                System.out.println("MB");
            } else if ((idade >= 34 && idade <= 37) && barras > 9) {
                System.out.println("E");
            }
            if ((idade >= 38 && idade <= 39) && barras <= 4) {
                System.out.println("I");
            } else if ((idade >= 38 && idade <= 39) && barras <= 5) {
                System.out.println("R");
            } else if ((idade >= 38 && idade <= 39) && barras <= 8) {
                System.out.println("B");
            } else if ((idade >= 38 && idade <= 39) && barras <= 10) {
                System.out.println("MB");
            } else if ((idade >= 38 && idade <= 39) && barras > 11) {
                System.out.println("E");
            }
            if (idade > 40 && barras > 2) {
                System.out.println("APTO");
            }
        if(sexo == 2){
            if ((idade >= 18 && idade <= 21) && barras == 0) {
                System.out.println("I");
            } else if ((idade >= 18 && idade <= 21) && barras <= 2) {
                System.out.println("R");
            } else if ((idade >= 18 && idade <= 21) && barras <= 4) {
                System.out.println("B");
            } else if ((idade >= 18 && idade <= 21) && barras <= 5) {
                System.out.println("MB");
            } else if ((idade >= 18 && idade <= 21) && barras > 6) {
                System.out.println("E");
            }
            if ((idade >= 22 && idade <= 25) && barras <= 2) {
                System.out.println("I");
            } else if ((idade >= 22 && idade <= 25) && barras <= 3) {
                System.out.println("R");
            } else if ((idade >= 22 && idade <= 25) && barras <= 4) {
                System.out.println("B");
            } else if ((idade >= 22 && idade <= 25) && barras <= 6) {
                System.out.println("MB");
            } else if ((idade >= 22 && idade <= 25) && barras > 7) {
                System.out.println("E");
            }
            if ((idade >= 26 && idade <= 29) && barras <= 1) {
                System.out.println("I");
            } else if ((idade >= 26 && idade <= 29) && barras <= 2) {
                System.out.println("R");
            } else if ((idade >= 26 && idade <= 29) && barras <= 4) {
                System.out.println("B");
            } else if ((idade >= 26 && idade <= 29) && barras <= 5) {
                System.out.println("MB");
            } else if ((idade >= 26 && idade <= 29) && barras > 6) {
                System.out.println("E");
            }
            if ((idade >= 30 && idade <= 33) && barras <= 0) {
                System.out.println("I");
            } else if ((idade >= 30 && idade <= 33) && barras <= 2) {
                System.out.println("R");
            } else if ((idade >= 30 && idade <= 33) && barras <= 4) {
                System.out.println("B");
            } else if ((idade >= 30 && idade <= 33) && barras <= 5) {
                System.out.println("MB");
            } else if ((idade >= 30 && idade <= 33) && barras > 6) {
                System.out.println("E");
            }
            if ((idade >= 34 && idade <= 37) && barras <= 1) {
                System.out.println("I");
            } else if ((idade >= 34 && idade <= 37) && barras <= 2) {
                System.out.println("R");
            } else if ((idade >= 34 && idade <= 37) && barras <= 3) {
                System.out.println("B");
            } else if ((idade >= 34 && idade <= 37) && barras <= 4) {
                System.out.println("MB");
            } else if ((idade >= 34 && idade <= 37) && barras > 5) {
                System.out.println("E");
            }
            if ((idade >= 38 && idade <= 39) && barras <= 0) {
                System.out.println("I");
            } else if ((idade >= 38 && idade <= 39) && barras <= 2) {
                System.out.println("R");
            } else if ((idade >= 38 && idade <= 39) && barras <= 3) {
                System.out.println("B");
            } else if ((idade >= 38 && idade <= 39) && barras <= 4) {
                System.out.println("MB");
            } else if ((idade >= 38 && idade <= 39) && barras > 5) {
                System.out.println("E");
            }
            if(idade >= 40 && barras > 45){
                System.out.println("APTO");
            }
        }

        }
    }
}
