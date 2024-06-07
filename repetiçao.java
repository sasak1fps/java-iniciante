import java.util.Random;
import java.util.Scanner;

public class repetiçao {
    public static void main(String[] args) {
        int inicio = 0;
        int finaal;
        int passos;
        int n1;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("digite o inicio : ");
            inicio = scanner.nextInt();
     
            System.out.println("digite o final : ");
            finaal = scanner.nextInt();

            System.out.println("quantos passos ? ");
            passos = scanner.nextInt();
        }
          
             while (inicio <= finaal) {
            System.out.println("posiçao "+ inicio);
           
             inicio+=passos;
        }
                System.out.println("TIME FOR DO!!");
        
        do {
            inicio+=passos;
            System.out.println("repetiu " + inicio);
            
        } while (inicio <= finaal);
        
        
        System.out.println("FOR TIME \n");
        
        for (n1 = 1 ; n1 <= finaal ; n1+=passos){
            System.out.println(n1);
        }
        
        Random aleatorio = new Random();
        
        int numero = 1 + aleatorio.nextInt(10);
        
        while (numero != 3) {

            int contador = 0 ;
            
            System.out.println("o numero gerado foi "+ numero);
            
            numero = 1 + aleatorio.nextInt(10);
            
            contador +=  1;            
            System.out.println("tentativa "+contador);

        }
        System.out.println("voce ganhou com o numero 3");

    }
}
