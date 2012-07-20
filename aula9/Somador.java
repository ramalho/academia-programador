import java.util.Scanner;

public class Somador {
	static double somar(double a, double b) {
		double resultado = a + b;
		return resultado;
	}
	
	public static void main(String[] args) {
		double n1, n2, soma;
		Scanner console = new Scanner(System.in);
		System.out.print("Informe um numero: ");
		n1 = console.nextDouble();
		System.out.print("Informe outro numero: ");
		n2 = console.nextDouble();
		soma = somar(n1, n2);
		System.out.println(n1+" + "+n2+" = "+soma);
	}
}
