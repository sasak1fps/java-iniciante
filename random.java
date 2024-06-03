import java.util.Random;

import javax.swing.JOptionPane;

public class random {
    public static void main(String[] args) {
        //double dado =  Math.random();
       // JOptionPane.showMessageDialog(null, dado, null, 1);
        
        //int dado =  1+(int) (Math.random() * 9999);
        //JOptionPane.showMessageDialog(null, dado, null, 1);

        Random gerador = new Random();
      //  int numero = gerador.nextInt(999) + 1 ;
      //  JOptionPane.showMessageDialog(null , numero);

      String faceString = JOptionPane.showInputDialog(null, " quantas faces tem : ");

      int faceDado = Integer.parseInt(faceString);

      int result = 1 +  gerador.nextInt(faceDado);
    
      JOptionPane.showMessageDialog(null, "voce tirou " + result + " no dado");

    }
}
