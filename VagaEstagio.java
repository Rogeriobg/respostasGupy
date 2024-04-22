/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vagaestagio;

/**
 *
 * @author rbgor
 */
public class VagaEstagio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int numero = 21; 

        
        int a = 0;
        int b = 1;
        int soma;

        System.out.print("Sequência de Fibonacci até " + numero + ": ");
        System.out.print(a + ", " + b);

        while (b <= numero) {
            soma = a + b;
            System.out.print(", " + soma);
            a = b;
            b = soma;
        }

      
        if (verificarSequencia(numero)) {
            System.out.println("\nO número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("\nO número " + numero + " NÃO pertence à sequência de Fibonacci.");
        }
    }

   
    public static boolean verificarSequencia(int numero) {
        int a = 0;
        int b = 1;
        int soma;

        while (b <= numero) {
            if (numero == b) {
                return true;
            }
            soma = a + b;
            a = b;
            b = soma;
        }
        return false;
    }
}