/*
 * d) Faça um programa que recebe dois números reais e exibe o menor deles e com duas  
 *  
 */

package primeiraEntrega;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ExibeMenorNumeroRealDecimais {
        public static void main(String args[])
    {
       
        double primeiroNumeroReal = Double.parseDouble(JOptionPane.showInputDialog("Digite seu primeiro número"));
        double segundoNumeroReal = Double.parseDouble(JOptionPane.showInputDialog("Digite seu segundo número"));
        
        if(primeiroNumeroReal < segundoNumeroReal){
            JOptionPane.showMessageDialog(null,"O menor número entre os dois é: " + new DecimalFormat("#.00").format(primeiroNumeroReal));
        } else {
             JOptionPane.showMessageDialog(null,"O menor número entre os dois é: " + new DecimalFormat("#.00").format(segundoNumeroReal));
        }
            
    }
}
