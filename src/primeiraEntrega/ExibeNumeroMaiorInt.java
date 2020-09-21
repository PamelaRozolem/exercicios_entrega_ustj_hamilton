/* 
 * c) Faça um programa que recebe dois números inteiros distintos e exibe o maior.
 */
package primeiraEntrega;

import javax.swing.JOptionPane;

public class ExibeNumeroMaiorInt {
        public static void main(String args[])
    {
       
        int primeiroNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite seu primeiro número"));
        int segundoNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite seu segundo número"));
        
        if(primeiroNumero > segundoNumero){
            JOptionPane.showMessageDialog(null,"O maior número entre os dois é: " + primeiroNumero);
        } else {
             JOptionPane.showMessageDialog(null,"O maior número entre os dois é: " + segundoNumero);
        }
            
    }
}
