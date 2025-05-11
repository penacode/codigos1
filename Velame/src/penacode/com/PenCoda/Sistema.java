package penacode.com.PenCoda;
import java.util.Scanner;

    public class Sistema {

        public static void escolherSistema() {

            Scanner scanner = new Scanner(System.in);

            int sistemas;

            System.out.println("Escolha o Sistema defeituoso: ");
            System.out.println("1 - Alimentação ");
            System.out.println("2 - Arrefecimento ");
            System.out.println("3 - Escape ");
            System.out.println("4 - Rodados ");
            System.out.println("5 - Lubrificação ");
            System.out.println("6 - Embreagem ");
            System.out.println("7 - Transmissão ");
            System.out.println("8 - Freios ");
            System.out.println("9 - Elétrico ");
            System.out.println("10 - Outros ");
            sistemas = scanner.nextInt();

            switch(sistemas){
                case 1:
                    System.out.println("Você escolheu o sistema de alimentação ");
                    break;
                case 2:
                    System.out.println("Você escolheu o sistema de arrefecimento");
                    break;
                case 3:
                    System.out.println("Você escolheu o sistema de escape");
                    break;
                case 4:
                    System.out.println("Você escolheu o sistema de rodados");
                    break;
                case 5:
                    System.out.println("Você escolheu o sistema de lubrificação");
                    break;
                case 6:
                    System.out.println("Você escolheu o sistema de embreagem");
                    break;
                case 7:
                    System.out.println("Você escolheu o sistema de transmissão");
                    break;
                case 8:
                    System.out.println("Você escolheu o sistema de freios ");
                    break;
                case 9:
                    System.out.println("Você escolheu o sistema Elétrico");
                    break;
                case 10:
                    System.out.println("Você escolheu outros ");
                        String especifico;
                        System.out.println("Seja mais específico: ");
                            especifico = scanner.nextLine();
                    break;
                default:
                    System.out.println("Opção inválida!");

            }

        }
    }