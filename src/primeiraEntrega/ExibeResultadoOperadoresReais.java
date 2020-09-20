package primeiraEntrega;

import java.util.Scanner;

public class ExibeResultadoOperadoresReais {
   public static void main(String[] args) {
        int num1, num2;
        int resultado = 0;
        String operação;
        Scanner console = new Scanner(System.in);
        System.out.println("Digite o Primeiro Número: ");
        num1 = Integer.parseInt(console.nextLine());
        System.out.println("Digite o Segundo  Número: ");
        num2 = Integer.parseInt(console.nextLine());
        System.out.println("Escolha o tipo de ação desejada");
        System.out.println("+ => Adição");
        System.out.println("- => Subtração");
        System.out.println("* => Multiplicação");
        System.out.println("/ => Divisão");
        System.out.println("Escolha a operação: ");
        operação = console.nextLine();

        switch (operação) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
            default:
                System.out.printf("Operação invalida!!");
                resultado = 0;
                break;
        }
        System.out.printf("Resultado é: " + resultado);

    }
}

