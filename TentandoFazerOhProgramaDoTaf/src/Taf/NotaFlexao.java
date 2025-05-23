package Taf;
import java.util.Scanner;
public class NotaFlexao {
    public static void notaFlexao() {
        Scanner scanner = new Scanner(System.in);
        int idade;
        int flexoes;
        int sexo;

        System.out.println("IDADE: ");
        idade = scanner.nextInt();
        System.out.println("FLEXÕES: ");
        flexoes = scanner.nextInt();
        System.out.println("SEXO: ");
        sexo = scanner.nextInt();

        if (sexo == 1) {
            if (idade <= 21 && flexoes <= 21) {
                System.out.println("I");
            } else if (idade <= 21 && flexoes <= 24) {
                System.out.println("R");
            } else if (idade <= 21 && flexoes <= 33) {
                System.out.println("B");
            } else if (idade <= 21 && flexoes <= 38) {
                System.out.println("MB");
            } else if (idade <= 21 && flexoes >= 39) {
                System.out.println("E");
            }
            if ((idade >= 22 && idade <= 25) && flexoes <= 23) {
                System.out.println("I");
            } else if ((idade >= 22 && idade <= 25) && flexoes <= 26) {
                System.out.println("R");
            } else if ((idade >= 22 && idade <= 25) && flexoes <= 35) {
                System.out.println("B");
            } else if ((idade >= 22 && idade <= 25) && flexoes <= 40) {
                System.out.println("MB");
            } else if ((idade >= 22 && idade <= 25) && flexoes >= 41) {
                System.out.println("E");
            }
            if ((idade >= 26 && idade <= 29) && flexoes <= 21) {
                System.out.println("I");
            } else if ((idade >= 26 && idade <= 29) && flexoes <= 24) {
                System.out.println("R");
            } else if ((idade >= 26 && idade <= 29) && flexoes <= 33) {
                System.out.println("B");
            } else if ((idade >= 26 && idade <= 29) && flexoes <= 38) {
                System.out.println("MB");
            } else if ((idade >= 26 && idade <= 29) && flexoes >= 39) {
                System.out.println("E");
            }
            if ((idade >= 30 && idade <= 33) && flexoes <= 20) {
                System.out.println("I");
            } else if ((idade >= 30 && idade <= 33) && flexoes <= 23) {
                System.out.println("R");
            } else if ((idade >= 30 && idade <= 33) && flexoes <= 31) {
                System.out.println("B");
            } else if ((idade >= 30 && idade <= 33) && flexoes <= 36) {
                System.out.println("MB");
            } else if ((idade >= 30 && idade <= 33) && flexoes >= 37) {
                System.out.println("E");
            }
            if ((idade >= 34 && idade <= 37) && flexoes <= 17) {
                System.out.println("I");
            } else if ((idade >= 34 && idade <= 37) && flexoes <= 20) {
                System.out.println("R");
            } else if ((idade >= 34 && idade <= 37) && flexoes <= 28) {
                System.out.println("B");
            } else if ((idade >= 34 && idade <= 37) && flexoes <= 33) {
                System.out.println("MB");
            } else if ((idade >= 34 && idade <= 37) && flexoes >= 34) {
                System.out.println("E");
            }
            if ((idade >= 38 && idade <= 41) && flexoes <= 16) {
                System.out.println("I");
            } else if ((idade >= 38 && idade <= 41) && flexoes <= 19) {
                System.out.println("R");
            } else if ((idade >= 38 && idade <= 41) && flexoes <= 27) {
                System.out.println("B");
            } else if ((idade >= 38 && idade <= 41) && flexoes <= 31) {
                System.out.println("MB");
            } else if ((idade >= 38 && idade <= 41) && flexoes >= 32) {
                System.out.println("E");
            }
            if ((idade >= 42 && idade <= 45) && flexoes <= 14) {
                System.out.println("I");
            } else if ((idade >= 42 && idade <= 45) && flexoes <= 17) {
                System.out.println("R");
            } else if ((idade >= 42 && idade <= 45) && flexoes <= 24) {
                System.out.println("B");
            } else if ((idade >= 42 && idade <= 45) && flexoes <= 28) {
                System.out.println("MB");
            } else if ((idade >= 42 && idade <= 45) && flexoes > 29) {
                System.out.println("E");
            }
            if ((idade >= 46 && idade <= 49) && flexoes <= 14) {
                System.out.println("I");
            } else if ((idade >= 46 && idade <= 49) && flexoes <= 17) {
                System.out.println("R");
            } else if ((idade >= 46 && idade <= 49) && flexoes <= 24) {
                System.out.println("B");
            } else if ((idade >= 46 && idade <= 49) && flexoes <= 28) {
                System.out.println("MB");
            } else if ((idade >= 46 && idade <= 49) && flexoes > 29) {
                System.out.println("E");
            }
            if (idade > 50 && flexoes > 11) {
                System.out.println("APTO");
            }
        }
        if (sexo == 2) {
            if (idade <= 21 && flexoes <= 10) {
                System.out.println("I");
            } else if (idade <= 21 && flexoes <= 11) {
                System.out.println("R");
            } else if (idade <= 21 && flexoes <= 16) {
                System.out.println("B");
            } else if (idade <= 21 && flexoes <= 19) {
                System.out.println("MB");
            } else if (idade <= 21 && flexoes >= 20) {
                System.out.println("E");
            }
            if ((idade >= 22 && idade <= 25) && flexoes <= 11) {
                System.out.println("I");
            } else if ((idade >= 22 && idade <= 25) && flexoes <= 12) {
                System.out.println("R");
            } else if ((idade >= 22 && idade <= 25) && flexoes <= 18) {
                System.out.println("B");
            } else if ((idade >= 22 && idade <= 25) && flexoes <= 21) {
                System.out.println("MB");
            } else if ((idade >= 22 && idade <= 25) && flexoes >= 22) {
                System.out.println("E");
            }
            if ((idade >= 26 && idade <= 29) && flexoes <= 10) {
                System.out.println("I");
            } else if ((idade >= 26 && idade <= 29) && flexoes <= 11) {
                System.out.println("R");
            } else if ((idade >= 26 && idade <= 29) && flexoes <= 16) {
                System.out.println("B");
            } else if ((idade >= 26 && idade <= 29) && flexoes <= 19) {
                System.out.println("MB");
            } else if ((idade >= 26 && idade <= 29) && flexoes >= 20) {
                System.out.println("E");
            }
            if ((idade >= 30 && idade <= 33) && flexoes <= 9) {
                System.out.println("I");
            } else if ((idade >= 30 && idade <= 33) && flexoes <= 10) {
                System.out.println("R");
            } else if ((idade >= 30 && idade <= 33) && flexoes <= 15) {
                System.out.println("B");
            } else if ((idade >= 30 && idade <= 33) && flexoes <= 18) {
                System.out.println("MB");
            } else if ((idade >= 30 && idade <= 33) && flexoes >= 19) {
                System.out.println("E");
            }
            if ((idade >= 34 && idade <= 37) && flexoes <= 8) {
                System.out.println("I");
            } else if ((idade >= 34 && idade <= 37) && flexoes <= 9) {
                System.out.println("R");
            } else if ((idade >= 34 && idade <= 37) && flexoes <= 14) {
                System.out.println("B");
            } else if ((idade >= 34 && idade <= 37) && flexoes <= 17) {
                System.out.println("MB");
            } else if ((idade >= 34 && idade <= 37) && flexoes >= 18) {
                System.out.println("E");
            }
            if ((idade >= 38 && idade <= 41) && flexoes <= 7) {
                System.out.println("I");
            } else if ((idade >= 38 && idade <= 41) && flexoes <= 8) {
                System.out.println("R");
            } else if ((idade >= 38 && idade <= 41) && flexoes <= 13) {
                System.out.println("B");
            } else if ((idade >= 38 && idade <= 41) && flexoes <= 16) {
                System.out.println("MB");
            } else if ((idade >= 38 && idade <= 41) && flexoes > 17) {
                System.out.println("E");
            }
            if ((idade >= 42 && idade <= 45) && flexoes <= 6) {
                System.out.println("I");
            } else if ((idade >= 42 && idade <= 45) && flexoes <= 7) {
                System.out.println("R");
            } else if ((idade >= 42 && idade <= 45) && flexoes <= 12) {
                System.out.println("B");
            } else if ((idade >= 42 && idade <= 45) && flexoes <= 15) {
                System.out.println("MB");
            } else if ((idade >= 42 && idade <= 45) && flexoes > 16) {
                System.out.println("E");
            }
            if ((idade >= 46 && idade <= 49) && flexoes <= 5) {
                System.out.println("I");
            } else if ((idade >= 46 && idade <= 49) && flexoes <= 6) {
                System.out.println("R");
            } else if ((idade >= 46 && idade <= 49) && flexoes <= 10) {
                System.out.println("B");
            } else if ((idade >= 46 && idade <= 49) && flexoes <= 13) {
                System.out.println("MB");
            } else if ((idade >= 46 && idade <= 49) && flexoes > 14) {
                System.out.println("E");
            }
            if (idade > 50 && flexoes >= 5) {
                System.out.println("APTO");
            }
        }
    }
}