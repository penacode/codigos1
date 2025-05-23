package Taf;
import java.util.Scanner;
public class NotaAbdominal {
    public static void notaAbdominal() {


        Scanner scanner = new Scanner(System.in);
        int idade;
        int abd;
        int sexo;

        System.out.println("IDADE: ");
        idade = scanner.nextInt();
        System.out.println("ABDOMINAL: ");
        abd = scanner.nextInt();
        System.out.println("SEXO: ");
        sexo = scanner.nextInt();

        if (sexo == 1) {
            if (idade <= 21 && abd <= 34) {
                System.out.println("I");
            } else if (idade <= 21 && abd <= 44) {
                System.out.println("R");
            } else if (idade <= 21 && abd <= 63) {
                System.out.println("B");
            } else if (idade <= 21 && abd <= 73) {
                System.out.println("MB");
            } else if (idade <= 21 && abd > 74) {
                System.out.println("E");
            }
            if ((idade >= 22 && idade <= 25)  && abd <= 41) {
                System.out.println("I");
            } else if ((idade >= 22 && idade <= 25) && abd <= 51) {
                System.out.println("R");
            } else if ((idade >= 22 && idade <= 25)  && abd <= 68) {
                System.out.println("B");
            } else if ((idade >= 22 && idade <= 25)  && abd <= 78) {
                System.out.println("MB");
            } else if ((idade >= 22 && idade <= 25) && abd > 79) {
                System.out.println("E");
            }
            if ((idade >= 26 && idade <= 29)  && abd <= 37) {
                System.out.println("I");
            } else if ((idade >= 26 && idade <= 29) && abd <= 48) {
                System.out.println("R");
            } else if ((idade >= 26 && idade <= 29)  && abd <= 65) {
                System.out.println("B");
            } else if ((idade >= 26 && idade <= 29)  && abd <= 75) {
                System.out.println("MB");
            } else if ((idade >= 26 && idade <= 29) && abd > 76) {
                System.out.println("E");
            }
            if ((idade >= 30 && idade <= 33)  && abd <= 33) {
                System.out.println("I");
            } else if ((idade >= 30 && idade <= 33) && abd <= 42) {
                System.out.println("R");
            } else if ((idade >= 30 && idade <= 33)  && abd <= 60) {
                System.out.println("B");
            } else if ((idade >= 30 && idade <= 33)  && abd <= 69) {
                System.out.println("MB");
            } else if ((idade >= 30 && idade <= 33) && abd > 70) {
                System.out.println("E");
            }
            if ((idade >= 34 && idade <= 37)  && abd <= 30) {
                System.out.println("I");
            } else if ((idade >= 34 && idade <= 37) && abd <= 39) {
                System.out.println("R");
            } else if ((idade >= 34 && idade <= 37)  && abd <= 56) {
                System.out.println("B");
            } else if ((idade >= 34 && idade <= 37)  && abd <= 65) {
                System.out.println("MB");
            } else if ((idade >= 34 && idade <= 37) && abd > 66) {
                System.out.println("E");
            }
            if ((idade >= 38 && idade <= 41)  && abd <= 28) {
                System.out.println("I");
            } else if ((idade >= 38 && idade <= 41) && abd <= 37) {
                System.out.println("R");
            } else if ((idade >= 38 && idade <= 41)  && abd <= 54) {
                System.out.println("B");
            } else if ((idade >= 38 && idade <= 41)  && abd <= 63) {
                System.out.println("MB");
            } else if ((idade >= 38 && idade <= 41) && abd > 64) {
                System.out.println("E");
            }
            if ((idade >= 42 && idade <= 45)  && abd <= 26) {
                System.out.println("I");
            } else if ((idade >= 42 && idade <= 45) && abd <= 35) {
                System.out.println("R");
            } else if ((idade >= 42 && idade <= 45)  && abd <= 52) {
                System.out.println("B");
            } else if ((idade >= 42 && idade <= 45)  && abd <= 61) {
                System.out.println("MB");
            } else if ((idade >= 42 && idade <= 45) && abd > 62) {
                System.out.println("E");
            }
            if ((idade >= 46 && idade <= 49)  && abd <= 24) {
                System.out.println("I");
            } else if ((idade >= 46 && idade <= 49) && abd <= 33) {
                System.out.println("R");
            } else if ((idade >= 46 && idade <= 49)  && abd <= 50) {
                System.out.println("B");
            } else if ((idade >= 46 && idade <= 49)  && abd <= 59) {
                System.out.println("MB");
            } else if ((idade >= 46 && idade <= 49) && abd > 60) {
                System.out.println("E");
            }
            if(idade >= 50 && abd >=23){
                System.out.println("APTO");
            }
        }
        if (sexo == 2){
            if (idade <= 21 && abd <= 30) {
                System.out.println("I");
            } else if (idade <= 21 && abd <= 39) {
                System.out.println("R");
            } else if (idade <= 21 && abd <= 55) {
                System.out.println("B");
            } else if (idade <= 21 && abd <= 64) {
                System.out.println("MB");
            } else if (idade <= 21 && abd > 65) {
                System.out.println("E");
            }
            if ((idade >= 22 && idade <= 25)  && abd <= 32) {
                System.out.println("I");
            } else if ((idade >= 22 && idade <= 25) && abd <= 41) {
                System.out.println("R");
            } else if ((idade >= 22 && idade <= 25)  && abd <= 57) {
                System.out.println("B");
            } else if ((idade >= 22 && idade <= 25)  && abd <= 66) {
                System.out.println("MB");
            } else if ((idade >= 22 && idade <= 25) && abd > 67) {
                System.out.println("E");
            }
            if ((idade >= 26 && idade <= 29)  && abd <= 31) {
                System.out.println("I");
            } else if ((idade >= 26 && idade <= 29) && abd <= 40) {
                System.out.println("R");
            } else if ((idade >= 26 && idade <= 29)  && abd <= 56) {
                System.out.println("B");
            } else if ((idade >= 26 && idade <= 29)  && abd <= 65) {
                System.out.println("MB");
            } else if ((idade >= 26 && idade <= 29) && abd > 66) {
                System.out.println("E");
            }
            if ((idade >= 30 && idade <= 33)  && abd <= 29) {
                System.out.println("I");
            } else if ((idade >= 30 && idade <= 33) && abd <= 38) {
                System.out.println("R");
            } else if ((idade >= 30 && idade <= 33)  && abd <= 54) {
                System.out.println("B");
            } else if ((idade >= 30 && idade <= 33)  && abd <= 63) {
                System.out.println("MB");
            } else if ((idade >= 30 && idade <= 33) && abd > 64) {
                System.out.println("E");
            }
            if ((idade >= 34 && idade <= 37)  && abd <= 27) {
                System.out.println("I");
            } else if ((idade >= 34 && idade <= 37) && abd <= 36) {
                System.out.println("R");
            } else if ((idade >= 34 && idade <= 37)  && abd <= 52) {
                System.out.println("B");
            } else if ((idade >= 34 && idade <= 37)  && abd <= 61) {
                System.out.println("MB");
            } else if ((idade >= 34 && idade <= 37) && abd > 62) {
                System.out.println("E");
            }
            if ((idade >= 38 && idade <= 41)  && abd <= 25) {
                System.out.println("I");
            } else if ((idade >= 38 && idade <= 41) && abd <= 34) {
                System.out.println("R");
            } else if ((idade >= 38 && idade <= 41)  && abd <= 50) {
                System.out.println("B");
            } else if ((idade >= 38 && idade <= 41)  && abd <= 59) {
                System.out.println("MB");
            } else if ((idade >= 38 && idade <= 41) && abd > 60) {
                System.out.println("E");
            }
            if ((idade >= 42 && idade <= 45)  && abd <= 23) {
                System.out.println("I");
            } else if ((idade >= 42 && idade <= 45) && abd <= 32) {
                System.out.println("R");
            } else if ((idade >= 42 && idade <= 45)  && abd <= 48) {
                System.out.println("B");
            } else if ((idade >= 42 && idade <= 45)  && abd <= 57) {
                System.out.println("MB");
            } else if ((idade >= 42 && idade <= 45) && abd > 58) {
                System.out.println("E");
            }
            if ((idade >= 46 && idade <= 49)  && abd <= 21) {
                System.out.println("I");
            } else if ((idade >= 46 && idade <= 49) && abd <= 30) {
                System.out.println("R");
            } else if ((idade >= 46 && idade <= 49)  && abd <= 46) {
                System.out.println("B");
            } else if ((idade >= 46 && idade <= 49)  && abd <= 55) {
                System.out.println("MB");
            } else if ((idade >= 46 && idade <= 49) && abd > 56) {
                System.out.println("E");
            }
            if(idade >= 50 && abd >=20){
                System.out.println("APTO");
            }
        }
    }
}