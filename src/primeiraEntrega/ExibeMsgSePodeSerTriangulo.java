/*
* i) Faça um programa que recebe o valor de três arestas e exibe uma mensagem indicando se podem formar um triângulo. Em caso afirmativo, indique se ele é equilátero, isósceles ou escaleno. Lembre-se: Para que um triângulo exista, a medida de qualquer um dos lados deve ser menor que a soma das medidas dos outros dois.
*
*/
package primeiraEntrega;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

public class ExibeMsgSePodeSerTriangulo {
       public static void main(String args[])
    {        
        List<Integer> listaDeArestas = new ArrayList();
        Integer numeroIgual = 0;
        Integer naoIgual = 0;
        
        
        for(int i = 0; i < 3; i++){
            listaDeArestas.add(Integer.parseInt(JOptionPane.showInputDialog("Digite a "+ (i+1) +" aresta:")));
        }
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(listaDeArestas.get(i).equals(listaDeArestas.get(j)) && (i != j)){
                    numeroIgual = listaDeArestas.get(i);
                }else{
                    naoIgual = listaDeArestas.get(i);
                }
            }
        }

        if(numeroIgual > naoIgual){
            JOptionPane.showMessageDialog(null, "Pode ser um triângulo");
        }else{
            JOptionPane.showMessageDialog(null, "Não pode ser um triângulo");
        }
    }
}
