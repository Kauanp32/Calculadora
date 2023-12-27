package Calculadora;

public class Retangulo {

    public int base;
    public int altura;
    public int largura;

    public int CalculaArea() {
        return base * altura;
    }
        public static void main(String[] args) {
            // Criar uma instância da classe Retangulo
            Retangulo retangulo = new Retangulo();
            
            // Atribuir valores para base e altura
            retangulo.base = 5;
            retangulo.altura = 3;

            // Chamar o método CalculaArea e exibir o resultado
            int area = retangulo.CalculaArea();
            System.out.println("A área do retângulo é: " + area);
        }
}