package Calculadora;

public class Media {
	
	public static void soma (int a, int b) {
		   int resultado = a + b;
		   System.out.println("Soma: " + resultado);
		   soma(a,b);
		}
		
		public static void soma (double a, double b) {
		   double resultado = a + b;
		   System.out.println("Soma: " + resultado);
		}
		
		public static void subtracao (int a, int b) {
			   int resultado = a - b;
			   System.out.println("Subtracao: " + resultado);
		}
		
		public static void multiplicacao (int a, int b) {
			   int resultado = a * b;
			   System.out.println("multiplicacao: " + resultado);
		}
		
		public static void divisao (int a, int b) {
			if (b != 0) {
				double resultado= (double) a/b;
				String resultado1 = null;
				System.out.print("divisao: " + resultado);
			}else{
				System.out.print("erro divisao por zero! " );
				
			}
			
		}
			 public static void main (String[] args) {
				 int num1 = 10;
				 int num2 = 5;
				 
				 soma(num1, num2);
				 subtracao(num1, num2);
				 multiplicacao(num1, num2);
				 divisao(num1, num2);
	 }

}