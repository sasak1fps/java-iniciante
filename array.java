import javax.swing.JOptionPane;

public class array {
    public static void main(String[] args) {
        
        String [] nome = new String[5];
        nome[0] = "a";
        nome[1] = "b";
        nome[2] = "c";
        nome[3] = "d";
        nome[4] = "e";
       
        int num [] = {
            0 , 1 , 2 , 3 ,4 ,5 ,6 
        };
        
        String days [] = {"Mon", "Tue", "Wed","Thu","Fri","Sat","Sun"};
        
        
        
        
        for (int vet = 0 ; vet < nome.length ; vet++){
           System.out.println(nome[vet]);
       }
    
    int a=0;
    int i= 0;
    
    while (i<days.length){

         System.out.println(i++);
         System.out.println(days[i]);
         
         
        while (a < num.length) {
             a++;
             System.out.println(num[a]);
     }
 

     }

     String serie [] = {
        "got " , "flash " , "thebog" , "braking bed" , "sair"
     };

    int opt = 0 ;
    while (opt != 3) {
        opt = JOptionPane.showOptionDialog(null,
         "dev seria",
          null,
           JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
             null,
              serie,
               0);
    }
    System.out.println(opt);
     };
   }

   
