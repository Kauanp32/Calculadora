package Calculadora;

public class Triangulo  {
	private double base;
	private double altura;
	
	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	
	public double getbase() {
		return base;
	}
	public void setbase(double base) {
		this.base = base;
	}
	public double getaltura() {
		return altura;
	}
	public void setaltura(double altura) {
		this.altura = altura;
	}

	public void CalculaArea() {
		System.out.println("A area do triangulo e: " + base * altura/2);
		
	}
	    public static void main(String[] args) {
	        // Criar uma instância da classe Triangulo
	        Triangulo triangulo = new Triangulo(5, 3);

	        // Chamar o método CalculaArea e exibir o resultado
	        triangulo.CalculaArea();
	    }
}