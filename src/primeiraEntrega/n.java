/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

n) Faça um programa que recebe a idade de um nadador e exibe a categoria que ele pertence. Sendo o critério: 
• Infantil (0 a 10 anos);
• Junior (11 a 14 anos); 
• Adolescente (15 a 20 anos);
• Jovem (21 a 35 anos) e 
• Máster (> 35 anos).

 */
package primeiraEntrega;

import javax.swing.JOptionPane;

/**
 *
 * @author pamela rozolem
 */
public class n {
     public static void main(String[] args){
         Integer idadeNadador = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do nadador"));
          
         if(idadeNadador > 0 && idadeNadador <= 10){
             JOptionPane.showMessageDialog(null,String.format("Infantil"));
         }else if(idadeNadador > 11 && idadeNadador <= 14){
             JOptionPane.showMessageDialog(null,String.format("Junior"));
         }else if(idadeNadador > 14 && idadeNadador <= 20){
             JOptionPane.showMessageDialog(null,String.format("Adolecente"));
         }else if(idadeNadador > 20 && idadeNadador <= 35){
             JOptionPane.showMessageDialog(null,String.format("Jovem"));
         }else if(idadeNadador > 35){
             JOptionPane.showMessageDialog(null,String.format("Master"));
         }


     }
}
