public class variavel {

    public static void main(String[] args) {

        byte numeropequeno = 127; //%d
        short numerocurto = 32767;
        int numeromaior = 2147483647;
        long numerogrande = 9223337203685547700L;

        float flutuante = 2.1f; //%f
        double dobroflutuante = 323.32; //%s

        char a = 'v';
        String nome1 = "alessandro";

        boolean verdadeiro_ou_falso = true ;

        System.out.println(numeropequeno);
        System.out.println(numerocurto);
        System.out.println(numeromaior);
        System.out.println(numerogrande);
        System.out.println(dobroflutuante);
        System.out.println(flutuante);
        System.out.println(nome1);
        System.out.println(verdadeiro_ou_falso);
        System.out.println(a);

        System.out.format("byte é %d ,  o int é %d , o float é %f ,\n",numeropequeno , numeromaior , flutuante);

    }
}