import java.util.Scanner;

public class Calculadora {
	static double somar(double x, double y) {
		return x + y;
	} 
	static double subtrair(double x, double y) {
		return x - y;
	} 
	static double multiplicar(double x, double y) {
		return x * y;
	} 
	static double dividir(double x, double y) {
		return x / y;
	} 
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double x, y, resultado;
		System.out.println("Entre com o operando 1:");
		x = teclado.nextDouble();
		System.out.println("Entre com o operando 2:");
		y = teclado.nextDouble();
		char operacao;
		System.out.println("Entre com a operação + - * /:");
		operacao = teclado.next().charAt(0);
		boolean ok = true;
		switch (operacao) {
			case '+':
				resultado = somar(x,y);
				break;
			case '-':
				resultado = subtrair(x,y);
				break;
			case '*':
				resultado = multiplicar(x, y);
				break;
			case '/':
				resultado = dividir(x, y);
				break;
			default:
				resultado = 0;
				ok = false;
		}
		if (ok) {
			System.out.println("Resultado: "+resultado);
		} else {
			System.out.println("Operação inválida");
		}
	}
}
