package Calculadora;

import java.util.Scanner;

public class CalculaAreaRetangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a base do retângulo X:");
        int xBase = sc.nextInt();
       
        System.out.println("Digite a altura do retângulo X:");
        int xAltura = sc.nextInt();
        
        int xArea = xBase * xAltura;

        System.out.println("Digite a base do retângulo Y:");
        int yBase = sc.nextInt();
        
        System.out.println("Digite a altura do retângulo Y:");
        int yAltura = sc.nextInt();
       
        int yArea = yBase * yAltura;

        if (xArea > yArea) {
       
        	System.out.println("A área do retângulo X é maior.");
        } else if (xArea < yArea) {
            System.out.println("A área do retângulo Y é maior.");
        } else {
            System.out.println("As áreas dos retângulos X e Y são iguais.");
        
        }   
        sc.close();

    }

}