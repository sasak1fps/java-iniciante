import java.util.Scanner;

public class condicoes {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
    
      try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("digite um numero : ");
          int num = scanner.nextInt();

          boolean res = null != null;

          if (num % 2 == 0 ) {
           
            res = true;
            System.out.println("o numero " + num +" é par ");
        }else{
            res = false;
            System.out.println("o numero "+ num +" é impar");
          }
    }
            int numero =  100; 
            
            boolean valor = (numero == 100) ? true : false ;

            System.out.println(valor);
    }
}
