package Calculadora;

import javax.swing.JOptionPane;

public class AdivinhaNumero {

    public static void main(String[] args) {
        int numeroAleatorio = (int) (Math.random() * 100) + 1;
        int tentativas = 0;

        while (true) {
           
        	// Obtenha a entrada do usuário usando a caixa de diálogo
            String input = JOptionPane.showInputDialog("Digite um número de 1 a 100:");

           
            // Verifique se o usuário pressionou Cancelar ou fechou a janela
            if (input == null) {
                break; // Sai do loop se o usuário cancelou
            }

            try {
                int numero = Integer.parseInt(input);
                tentativas++;

                if (numero == numeroAleatorio) {
                    JOptionPane.showMessageDialog(null, "Parabéns! Você acertou em " + tentativas + " tentativas.");
                    break; // Sai do loop se o número for adivinhado corretamente
                } else if (numero < numeroAleatorio) {
                    JOptionPane.showMessageDialog(null, "Tente um número maior.");
                } else {
                    JOptionPane.showMessageDialog(null, "Tente um número menor.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, digite um número válido.");
            }
        }
    }
}