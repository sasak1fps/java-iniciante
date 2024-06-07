

public class bolean {
        
    
        public static boolean parseboolean;

        public static void main(String[] args) {
            
            /*   OPERADORES RELACIONAIS!!
             > maior 
             < menor 
             >= maior ou igual
             <= menor ou igual 
             == igual a 
             != diferente 

             && and
             || or 
             !  not 

             */
            int idade = 18;
            String name = "alessandro".toUpperCase();

            boolean result0 = name == "alessndro".strip();
            boolean result = idade >18;
            boolean result1 = idade <18;
            boolean result2 = idade >=18;
            boolean result3 = idade <=18;
            boolean result4 = idade ==18;
            boolean result5 = idade !=18;
            boolean result6 = idade == 18 && idade < 20;
            boolean result7 = idade <= 18 || idade <= 17;
            boolean result8 = false;

            System.out.println(result);
            System.out.println(result1);
            System.out.println(result2);
            System.out.println(result3);
            System.out.println(result4);
            System.out.println(result5);
            System.out.println(result6);
            System.out.println(result7);
            System.out.println(result8);
        
            System.out.println("nome é " + result0);
        }  
}
