import java.util.Scanner;

import javax.swing.JOptionPane;

public class scannerkey {

    private static Scanner scanner;

    public static void main(String[] args) throws Exception {
      
        int num;
        double num1;
        String num2;

        scanner = new Scanner(System.in);

        System.out.println("digite um numero inteiro :");
        num = scanner.nextInt();
        System.out.println("o numero é " + num);

        System.out.println("diginte um numero flutuante: ");
        num1 = scanner.nextFloat();
        System.out.println("o numero é : "+ num1);
        
        System.out.println("diginte um nome : ");
        num2 = scanner.next();
        System.out.println("o nome é : "+ num2);

        String filme = JOptionPane.showInputDialog(null,"qual seu filme preferido : ", "title" ,JOptionPane.QUESTION_MESSAGE );
        
        String a = JOptionPane.showInputDialog(null,"digite um numero ",JOptionPane.INFORMATION_MESSAGE);
        int numero = Integer.parseInt(a);
        numero =   numero * 2;
        System.out.println(filme);
        System.out.println(numero);
         
         
    }

}