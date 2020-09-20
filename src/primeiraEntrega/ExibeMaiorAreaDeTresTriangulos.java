
package primeiraEntrega;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class ExibeMaiorAreaDeTresTriangulos {
    public static void main(String []args){
   
       double maiorArea = 0;
    
       for(int i = 1; i < 4; i++)
          {
            double base =  Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da Base"+ i));
            double altura =  Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da Altura"+ i));
            double resultado = (base * altura)/2;
            
            if (resultado > maiorArea){
                maiorArea = resultado;
            }
          } 
       
     
           JOptionPane.showMessageDialog(null, String.format("A maior area e: %f", maiorArea));
       
    }
}
