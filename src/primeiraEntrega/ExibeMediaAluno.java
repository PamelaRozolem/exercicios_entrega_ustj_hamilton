/*
 * o) Desenvolva   um   programa   que,   com   base   em   duas   notas   de   provas   e   três   notas   de 
 *  trabalhos   dadas   pelo   usuário,   exibe   uma   mensagem   indicando   se   o   aluno   foi   aprovado,   reprovado   ou   se   fará   o   exame. 
 *  •   6   ≤   𝑀é𝑑𝑖𝑎   𝑓𝑖𝑛𝑎𝑙   ≤   10,   𝑎𝑝𝑟𝑜𝑣𝑎𝑑𝑜 
 *  •   4   ≤   𝑀é𝑑𝑖𝑎   𝑓𝑖𝑛𝑎𝑙   <   6,   𝑒𝑥𝑎𝑚𝑒 
 *  •   0   ≤   𝑀é𝑑𝑖𝑎   𝑓𝑖𝑛𝑎𝑙   <   4,   𝑟𝑒𝑝𝑟𝑜𝑣𝑎𝑑𝑜 
 */
package primeiraEntrega;

import javax.swing.JOptionPane;

public class ExibeMediaAluno {
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
