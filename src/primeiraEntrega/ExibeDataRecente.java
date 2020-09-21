/*
 *  k) Faça um programa que recebe duas datas distintas e exibe a mais recente. Cada data deve ser fornecida como três valores inteiros, 
 *  onde o primeiro representa o dia, o segundo o mês e o terceiro o ano. Dica: comece verificando pelo ano.
 */
package primeiraEntrega;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ExibeDataRecente {
    
    public static void main(String[] args){

        String primeiroData = JOptionPane.showInputDialog("Digite a primeira data no formato ddMMyy (010120)");
        String segundaData = JOptionPane.showInputDialog("Digite a segunda data no formato ddMMyy (010120)");
        
        Calendar data1;
        Calendar data2;
                
        try {
            data1 = converterData(primeiroData);
            data2 = converterData(segundaData);
        
            if(data1.after(data2)){
                 JOptionPane.showMessageDialog(null,String.format("A primeira data e mais recenter %s", primeiroData));
            }else{
                 JOptionPane.showMessageDialog(null,String.format("A primeira data e mais recenter %s", segundaData));
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
