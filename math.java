import javax.swing.JOptionPane;

public class math {
    public static void main(String[] args) throws Exception{
        
        int n1 = 4;
        int n2 = 4;

        int res = n1 + n2 ;
        int res1 = n1 - n2 ;
        int res2 = n1 * n2 ;
        int res3 = n1 / n2 ;
        int res4 = n1 % n2 ;
        int res5 = n1 ^ n2 ;
    
        double[] a = {
            Math.min(res4, res5),
            Math.max(res1, res5),
            Math.abs(res1),
            Math.sqrt(res1),
            Math.pow(res1, res5)
        };


        JOptionPane.showMessageDialog(null, res , "o resultado é : " , JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, res1 , "o resultado é : " , JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, res2 , "o resultado é : " , JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, res3 , "o resultado é : " , JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, res4 , "o resultado é : " , JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, res5 , "o resultado é : " , JOptionPane.INFORMATION_MESSAGE);

        for (double value : a) {
            System.out.println(value);
        }
    }
}
