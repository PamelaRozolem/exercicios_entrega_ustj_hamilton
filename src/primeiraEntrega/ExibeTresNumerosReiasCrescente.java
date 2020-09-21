/*
 * f) Faça um programa que recebe três números reais e os exibe em ordem crescente. 
 *  
 */
package primeiraEntrega;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

public class ExibeTresNumerosReiasCrescente {
   public static void main(String args[])
    {        
        List listaDeNumeros = new ArrayList();
        String exibe = "";
        
        for(int i = 1; i < 4; i++)
          {
              listaDeNumeros.add(Double.parseDouble(JOptionPane.showInputDialog("Digite o "+ i + "° numero: ")));
          } 
        
         Collections.sort(listaDeNumeros);
         
        for (int j = 0; j < listaDeNumeros.size(); j++) 
       	  {
              exibe += " " + listaDeNumeros.get(j).toString() + ",";
          }

        JOptionPane.showMessageDialog(null, exibe);
    }
}
