package Calculadora;

import java.util.Scanner;

public class CalculadoraDeArea {

    public int altura;
    public int largura;

    public int CalculaArea() {
        return largura * altura;
    }

    public static void main(String[] args) {
        CalculadoraDeArea rt = new CalculadoraDeArea();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a altura do retangulo:");
        rt.altura = sc.nextInt();

        System.out.println("Digite a largura do retangulo: ");
        rt.largura = sc.nextInt();

        // Debug: Imprimir os valores de altura e largura
        System.out.println("Altura: " + rt.altura);
        System.out.println("Largura: " + rt.largura);

        // Calcular a área e exibir o resultado
        int area = rt.CalculaArea();
        System.out.println("A área do retângulo é: " + area);

        sc.close();
    }
}