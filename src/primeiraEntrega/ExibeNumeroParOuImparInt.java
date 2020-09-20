
package primeiraEntrega;

import javax.swing.JOptionPane;

public class ExibeNumeroParOuImparInt {
            public static void main(String args[])
    {
       
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite seu número"));
        
        if(numero%2==0){
            JOptionPane.showMessageDialog(null,"O maior número que você digitou é par: " + numero);
        } else {
             JOptionPane.showMessageDialog(null,"O maior número que você digitou é ímpar: " + numero);
        }
            
    }
}
