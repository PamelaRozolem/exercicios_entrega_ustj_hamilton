/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

m) Faça um programa que recebe a quantidade de cilindradas (cc) de um veículo de competição e exibe a categoria 
a qual ele pertence, sendo:
• De 0cc a 120cc: “Sub Production”;
• De 121cc a 240cc: “Production”;
• Acima de 240cc: “Super Production”.

 */
package primeiraEntrega;

import javax.swing.JOptionPane;

/**
 *
 * @author pamela rozolem
 */
public class m {
     public static void main(String[] args){
         Integer cc = Integer.parseInt(JOptionPane.showInputDialog("Quantas cilindradas"));
          
         if(cc > 0 && cc <= 120){
             JOptionPane.showMessageDialog(null,String.format("Sub Production"));
         }else if(cc > 120 && cc <= 240){
             JOptionPane.showMessageDialog(null,String.format("Production"));
         }else if(cc > 240){
             JOptionPane.showMessageDialog(null,String.format("Super Production"));
         }

     }
}
