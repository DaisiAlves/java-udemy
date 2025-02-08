import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Escolha o tipo de combustível: ");
        int x = sc.nextInt();
        while (x != 4) {

            switch (x) {

                case (1):
                    alcool += 1;
                    System.out.println("Álcool");
                    break;
                case (2):
                    gasolina += 1;
                    System.out.println("Gasolina");
                    break;
                case (3):
                    diesel += 1;
                    System.out.println("Diesel");
                    break;
                case (4):
                    System.out.println("Fim");
                    break;
                default:
                System.out.println("Código inválido. Digite um novo código:");
            }

            System.out.println("Escolha o tipo de combustível: ");
            x = sc.nextInt();  

        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Diesel: " + diesel);
        System.out.println("Gasolina: " + gasolina);

        sc.close();

    }
}
