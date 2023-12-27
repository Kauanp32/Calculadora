package Calculadora;

public class UsandoMetodos {

    int numero1 = 0;
    int numero2 = 3;

    public int somarNumeros() {
        return numero1 + numero2;
    }

    public static void main(String[] args) {
        // Criar uma instância da classe UsandoMetodos
        UsandoMetodos instancia = new UsandoMetodos();

        // Chamar o método somarNumeros e exibir o resultado
        int resultado = instancia.somarNumeros();
        System.out.println("A soma dos números é: " + resultado);
    }
}