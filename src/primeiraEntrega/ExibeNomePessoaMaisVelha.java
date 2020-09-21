/*
* l) Faça um programa que recebe o nome e a data de nascimento de duas pessoas e exibe o nome da mais velha. 
* Cada data deve ser fornecida em três valores inteiros, onde o primeiro representa o dia, o segundo o mês e o terceiro o ano.
*/
package primeiraEntrega;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static primeiraEntrega.ExibeDataRecente.converterData;

/**
 *
 * @author pamela rozolem
 */
public class ExibeNomePessoaMaisVelha {
    
    public static void main(String[] args){

         String primeiroData = JOptionPane.showInputDialog("Digite a primeira data de aniversario no formato ddMMyy (010120)");
         String primeiroNome = JOptionPane.showInputDialog("Digite o primeiro nome");
         
         String segundaData = JOptionPane.showInputDialog("Digite a segunda data de aniversario no formato ddMMyy (010120)");
         String segundoNome = JOptionPane.showInputDialog("Digite o segundo nome");
        
        Calendar data1;
        Calendar data2;
                
        try {
            data1 = converterData(primeiroData);
            data2 = converterData(segundaData);
        
            if(data1.after(data2)){
                 JOptionPane.showMessageDialog(null,String.format("A mais velha e %s", primeiroNome));
            }else{
                 JOptionPane.showMessageDialog(null,String.format("A mais velha e %s", segundoNome));
            }

        } catch (ParseException ex) {
            Logger.getLogger(ExibeDataRecente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   public static Calendar converterData(String dt) throws ParseException{
       SimpleDateFormat sdf = new SimpleDateFormat("dMyy");
        Calendar dataFormatada = Calendar.getInstance();
        
       dataFormatada.setTime(sdf.parse(dt));
       return dataFormatada;
    }
    
}

