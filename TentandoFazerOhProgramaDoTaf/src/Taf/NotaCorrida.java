package Taf;
import java.util.Scanner;
public class NotaCorrida {
    static Scanner scanner = new Scanner(System.in);
    public static void imprimeMencaoCorrida() {

        int metros;
        int sexo;
        int idade;
        System.out.println("IDADE: ");
        idade = scanner.nextInt();
        System.out.println("METROS: ");
        metros = scanner.nextInt();
        System.out.println("SEXO: ");
        sexo = scanner.nextInt();

        if (sexo == 1) {
            if (idade <= 21 && metros <= 2600) {
                System.out.println("I");
            } else if (idade <= 21 && metros < 2800) {
                System.out.println("R");
            } else if (idade <= 21 && metros < 3150) {
                System.out.println("B");
            } else if (idade <= 21 && metros < 3200) {
                System.out.println("MB");
            } else if (idade <= 21 && metros > 3200) {
                System.out.println("E");
            }
            if ((idade >= 22 && idade <= 25) && metros <= 2700) {
                System.out.println("I");
            } else if ((idade >= 22 && idade <= 25) && metros < 2850) {
                System.out.println("R");
            } else if ((idade >= 22 && idade <= 25) && metros < 3100) {
                System.out.println("B");
            } else if ((idade >= 22 && idade <= 25) && metros < 3250) {
                System.out.println("MB");
            } else if ((idade >= 22 && idade <= 25) && metros >= 3300) {
                System.out.println("E");
            }
            if ((idade >= 26 && idade <= 29) && metros <= 2600) {
                System.out.println("I");
            } else if ((idade >= 26 && idade <= 29) && metros < 2750) {
                System.out.println("R");
            } else if ((idade >= 26 && idade <= 29) && metros < 3000) {
                System.out.println("B");
            } else if ((idade >= 26 && idade <= 29) && metros < 3150) {
                System.out.println("MB");
            } else if ((idade >= 26 && idade <= 29) && metros >= 3200) {
                System.out.println("E");
            }
            if ((idade >= 30 && idade <= 33) && metros < 2550) {
                System.out.println("I");
            } else if ((idade >= 30 && idade <= 33) && metros < 2650) {
                System.out.println("R");
            } else if ((idade >= 30 && idade <= 33) && metros < 2900) {
                System.out.println("B");
            } else if ((idade >= 30 && idade <= 33) && metros < 3100) {
                System.out.println("MB");
            } else if ((idade >= 30 && idade <= 33) && metros >= 3150) {
                System.out.println("E");
            }
            if ((idade >= 34 && idade <= 37) && metros <= 2450) {
                System.out.println("I");
            } else if ((idade >= 34 && idade <= 37) && metros < 2550) {
                System.out.println("R");
            } else if ((idade >= 34 && idade <= 37) && metros < 2800) {
                System.out.println("B");
            } else if ((idade >= 34 && idade <= 37) && metros < 2950) {
                System.out.println("MB");
            } else if ((idade >= 34 && idade <= 37) && metros >= 3000) {
                System.out.println("E");
            }
            if ((idade >= 38 && idade <= 41) && metros <= 2350) {
                System.out.println("I");
            } else if ((idade >= 38 && idade <= 41) && metros < 2450) {
                System.out.println("R");
            } else if ((idade >= 38 && idade <= 41) && metros < 2700) {
                System.out.println("B");
            } else if ((idade >= 38 && idade <= 41) && metros < 2850) {
                System.out.println("MB");
            } else if ((idade >= 38 && idade <= 41) && metros >= 2900) {
                System.out.println("E");
            }
            if ((idade >= 42 && idade <= 45) && metros <= 2250) {
                System.out.println("I");
            } else if ((idade >= 42 && idade <= 45) && metros < 2400) {
                System.out.println("R");
            } else if ((idade >= 42 && idade <= 45) && metros < 2600) {
                System.out.println("B");
            } else if ((idade >= 42 && idade <= 45) && metros < 2750) {
                System.out.println("MB");
            } else if ((idade >= 42 && idade <= 45) && metros >= 2800) {
                System.out.println("E");
            }
            if ((idade >= 46 && idade <= 49) && metros <= 2150) {
                System.out.println("I");
            } else if ((idade >= 46 && idade <= 49) && metros < 2300) {
                System.out.println("R");
            } else if ((idade >= 46 && idade <= 49) && metros < 2500) {
                System.out.println("B");
            } else if ((idade >= 46 && idade <= 49) && metros < 2650) {
                System.out.println("MB");
            } else if ((idade >= 46 && idade <= 49) && metros >= 2700) {
                System.out.println("E");
            }
            if (idade > 50 && metros > 1900) {
                System.out.println("APTO");
            }
        }
        if (sexo == 2) {
            if ((idade >= 18 && idade <= 21) && metros <= 2100) {
                System.out.println("I");
            } else if ((idade >= 18 && idade <= 21) && metros < 2200) {
                System.out.println("R");
            } else if ((idade >= 18 && idade <= 21) && metros < 2450) {
                System.out.println("B");
            } else if ((idade >= 18 && idade <= 21) && metros < 2600) {
                System.out.println("MB");
            } else if ((idade >= 18 && idade <= 21) && metros >= 2650) {
                System.out.println("E");
            }
            if ((idade >= 22 && idade <= 25) && metros <= 2150) {
                System.out.println("I");
            } else if ((idade >= 22 && idade <= 25) && metros < 2250) {
                System.out.println("R");
            } else if ((idade >= 22 && idade <= 25) && metros < 2450) {
                System.out.println("B");
            } else if ((idade >= 22 && idade <= 25) && metros < 2650) {
                System.out.println("MB");
            } else if ((idade >= 22 && idade <= 25) && metros >= 2700) {
                System.out.println("E");
            }
            if ((idade >= 26 && idade <= 29) && metros <= 2100) {
                System.out.println("I");
            } else if ((idade >= 26 && idade <= 29) && metros < 2200) {
                System.out.println("R");
            } else if ((idade >= 26 && idade <= 29) && metros < 2450) {
                System.out.println("B");
            } else if ((idade >= 26 && idade <= 29) && metros < 2600) {
                System.out.println("MB");
            } else if ((idade >= 26 && idade <= 29) && metros >= 2650) {
                System.out.println("E");
            }
            if ((idade >= 30 && idade <= 33) && metros <= 2050) {
                System.out.println("I");
            } else if ((idade >= 30 && idade <= 33) && metros < 2150) {
                System.out.println("R");
            } else if ((idade >= 30 && idade <= 33) && metros < 2350) {
                System.out.println("B");
            } else if ((idade >= 30 && idade <= 33) && metros < 2550) {
                System.out.println("MB");
            } else if ((idade >= 30 && idade <= 33) && metros >= 2600) {
                System.out.println("E");
            }
        }
    }
}




