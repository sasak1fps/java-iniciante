import java.util.Scanner;

public class swtcase {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um numero entre 0 a 7 ");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.println("voce é segunda : ");
                break;
            case 2:
                System.out.println("voce é terça : ");
                break;
            case 3:
                System.out.println("voce é quarta : ");
                break;
            case 4:
                System.out.println("voce é quinta : ");
                break;
            case 5:
                System.out.println("voce é sexta : ");
                break;
            case 6:
                System.out.println("voce é  sabado: ");
                break;
            case 7:
                System.out.println("voce é  domingo: ");
                break;
            default:
                System.out.println("DESCONHECIDO");
                break;
        }
    }
}
