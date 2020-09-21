/*
 * j) Faça um programa que recebe os coeficientes 𝑎, 𝑏 𝑒 𝑐 (𝑎 ≠ 0) de uma equação de segundo grau e exibe os valores das raízes, 
 *  se forem reais, ou a mensagem "nao existem raizes reais", caso contrário.
 */
package primeiraEntrega;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ExibeValoresRaizes {
    

    public static void main(String[] args){
        
        double a  = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de a"));
        double b  = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de b"));
        double c  = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de c"));
        
        double delta = ((b*b)-(4*a*c));
        double x1 = 0;
        double x2 = 0;
        
        if(delta >=0 ){
            x1 = (-b + Math.sqrt (delta)) / ( 2*a );
            x2 = (-b - Math.sqrt (delta)) / ( 2*a );
            
            if(x1 == Math.floor(x1) && x2 == Math.floor(x2)){
              JOptionPane.showMessageDialog(null,"nao existem raizes reais");
            }else{
              JOptionPane.showMessageDialog(null,String.format("Primeira raiz e: %f Segunda Raiz e: %f", x1, x2));
            }
            
        }else {
            JOptionPane.showMessageDialog(null,"Nao ha solucao com conjunto reais");
        }
        
    }
}
