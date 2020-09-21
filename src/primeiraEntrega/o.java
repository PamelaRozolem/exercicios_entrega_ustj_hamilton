/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraEntrega;

import javax.swing.JOptionPane;

/**
 *
 * @author pamela rozolem
 */
public class o {
    public static void main(String[] args){
    
         Double prova1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira prova"));
         Double prova2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda prova"));
         Double trabalho1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o trabalho 1"));
         Double trabalho2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o trabalho 2"));
         Double trabalho3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o trabalho 3"));
         
         Double mediaFinal = (prova1 + prova2 + trabalho1 + trabalho2 + trabalho3) / 5;
          
         if(mediaFinal >= 6 && mediaFinal <= 10){
              JOptionPane.showMessageDialog(null,String.format("Aprovado"));
         }else if(mediaFinal >= 4 && mediaFinal < 6){
              JOptionPane.showMessageDialog(null,String.format("Exame"));
         }else if(mediaFinal >= 0 && mediaFinal < 4){
              JOptionPane.showMessageDialog(null,String.format("Reprovado"));
         }

    
    }
}
